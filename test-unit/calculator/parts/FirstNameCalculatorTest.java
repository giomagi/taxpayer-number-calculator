package calculator.parts;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class FirstNameCalculatorTest {
    FirstNameCalculator calculator = new FirstNameCalculator();

    @Test
    public void theCodeForANameWithMoreThanFourConsonantsIsTheFirstThirdAndFourthConsonants() throws Exception {
        assertThat(calculator.codeFor("Francesco"), equalTo("FNC"));
        assertThat(calculator.codeFor("Alessandra"), equalTo("LSN"));
    }

    @Test
    public void theCodeForANameWithThreeConsonantsIsTheFirstSecondAndThirdConsonants() throws Exception {
        assertThat(calculator.codeFor("Giacomo"), equalTo("GCM"));
        assertThat(calculator.codeFor("Andrea"), equalTo("NDR"));
    }

    @Test
    public void theCodeForANameWithLessThanThreeConsonantsIsFilledUsingVowels() throws Exception {
        assertThat(calculator.codeFor("Dario"), equalTo("DRA"));
        assertThat(calculator.codeFor("Sara"), equalTo("SRA"));
    }

    @Test
    public void theCodeForANameWithLessThanThreeLettersIsPaddedWithXs() throws Exception {
        assertThat(calculator.codeFor("Jo"), equalTo("JOX"));
        assertThat(calculator.codeFor("I"), equalTo("IXX"));
    }

    @Test
    public void theCodeForAPersonWithoutANameIsXXX() throws Exception {
        assertThat(calculator.codeFor(""), equalTo("XXX"));
    }

    @Test
    public void multipleNamesAreTreatedAsOne() throws Exception {
        assertThat(calculator.codeFor("Pier Francesco"), equalTo(calculator.codeFor("Pierfrancesco")));
    }
}
