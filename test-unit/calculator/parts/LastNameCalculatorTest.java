package calculator.parts;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class LastNameCalculatorTest {
    LastNameCalculator calculator = new LastNameCalculator();

    @Test
    public void theCodeForALastNameWithThreeOrMoreConsonantsIsTheFirstSecondAndThirdConsonant() throws Exception {
        assertThat(calculator.codeFor("Merisi"), equalTo("MRS"));
        assertThat(calculator.codeFor("Buonarroti"), equalTo("BNR"));
    }

    @Test
    public void theCodeForALastNameWithLessThanThreeConsonantsIsThePaddedUsingVowels() throws Exception {
        assertThat(calculator.codeFor("Magi"), equalTo("MGA"));
        assertThat(calculator.codeFor("Rosi"), equalTo("RSO"));
    }

    @Test
    public void theCodeForALastNameWithLessThanThreeLettersIsPaddedWithZeros() throws Exception {
        assertThat(calculator.codeFor("Zu"), equalTo("ZUX"));
        assertThat(calculator.codeFor("Q"), equalTo("QXX"));
    }

    @Test
    public void multipleLastNamesAreTreatedAsOne() throws Exception {
        assertThat(calculator.codeFor("De Giorgi"), equalTo("DGR"));
    }
}
