package calculator.parts;

public class FirstNameCalculator extends NameCalculator {

    @Override
    protected String codeFrom(StringBuilder consonants, StringBuilder vowels) {
        if (consonants.length() > 3) {
            consonants.deleteCharAt(1);
        }

        consonants.append(vowels).append("XXX");

        return consonants.substring(0, 3);
    }
}
