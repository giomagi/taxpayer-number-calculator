package calculator.parts;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class CountyCodeMapperTest {
    CountyCodeMapper mapper = new CountyCodeMapper();

    @Test
    public void canMapACountyCode() throws Exception {
        assertThat(mapper.codeFor("Pesaro"), equalTo("G479"));
        assertThat(mapper.codeFor("Milano"), equalTo("F205"));
    }
}
