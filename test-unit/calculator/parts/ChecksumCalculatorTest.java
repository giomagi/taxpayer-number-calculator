package calculator.parts;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class ChecksumCalculatorTest {
    ChecksumCalculator calculator = new ChecksumCalculator();

    @Test
    public void generatesChecksumCorrectly() throws Exception {
        assertThat(calculator.checksumFor("MGAGNN77P07G479"), equalTo('V'));
        assertThat(calculator.checksumFor("CSLSRA77E63F205"), equalTo('S'));
    }
}
