package calculator.model;

import org.joda.time.LocalDate;
import org.junit.Test;

import static calculator.model.Sex.MALE;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class TaxpayerTest {
    @Test
    public void validateTaxpayerCreation() throws Exception {
        Taxpayer taxpayer = new Taxpayer("Giovanni", "Magi", MALE, new LocalDate(1977, 9, 7), "Pesaro");

        assertThat(taxpayer.firstname, equalTo("Giovanni"));
        assertThat(taxpayer.lastname, equalTo("Magi"));
        assertThat(taxpayer.sex, equalTo(MALE));
        assertThat(taxpayer.birthdate, equalTo(new LocalDate(1977, 9, 7)));
        assertThat(taxpayer.county, equalTo("Pesaro"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void canNotInstantiateWithoutLastName() throws Exception {
        new Taxpayer("Giovanni", "", MALE, new LocalDate(1977, 9, 7), "Pesaro");
    }

    @Test(expected = IllegalArgumentException.class)
    public void canNotInstantiateWithoutCounty() throws Exception {
        new Taxpayer("Giovanni", "Magi", MALE, new LocalDate(1977, 9, 7), "");
    }
}
