package calculator.parts;

public class LastNameCalculator extends NameCalculator {
    @Override
    protected String codeFrom(StringBuilder consonants, StringBuilder vowels) {
        return consonants.append(vowels).append("XXX").substring(0, 3);
    }
}
