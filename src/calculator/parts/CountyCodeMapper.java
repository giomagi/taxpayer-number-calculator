package calculator.parts;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class CountyCodeMapper {
    private static final Map<String, String> nameToCodeMapping = ImmutableMap.<String, String>builder()
                                                                             .put("Milano", "F205")
                                                                             .put("Pesaro", "G479")
                                                                             .build();

    public String codeFor(String countyName) {
        return nameToCodeMapping.get(countyName);
    }
}
