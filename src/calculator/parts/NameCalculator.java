package calculator.parts;

import java.util.Arrays;

public abstract class NameCalculator {
    private static final Character[] CONSONANTS = new Character[]{'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N',
                                                                  'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};

    public String codeFor(String name) {
        StringBuilder consonants = new StringBuilder();
        StringBuilder vowels = new StringBuilder();

        for (char ch : name.replaceAll(" ", "").toUpperCase().toCharArray()) {
            if (isAConsonant(ch)) {
                consonants.append(ch);
            } else {
                vowels.append(ch);
            }
        }

        return codeFrom(consonants, vowels);
    }

    protected abstract String codeFrom(StringBuilder consonants, StringBuilder vowels);

    private boolean isAConsonant(char ch) {
        return Arrays.asList(CONSONANTS).contains(ch);
    }
}
