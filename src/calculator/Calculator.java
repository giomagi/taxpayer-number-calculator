package calculator;

import calculator.model.Taxpayer;
import calculator.parts.ChecksumCalculator;
import calculator.parts.CountyCodeMapper;
import calculator.parts.DateAndSexCalculator;
import calculator.parts.FirstNameCalculator;
import calculator.parts.LastNameCalculator;

public class Calculator {
    private final FirstNameCalculator firstNameCalculator = new FirstNameCalculator();
    private final LastNameCalculator lastNameCalculator = new LastNameCalculator();
    private final DateAndSexCalculator dateAndSexCalculator = new DateAndSexCalculator();
    private final CountyCodeMapper countyCodeMapper = new CountyCodeMapper();
    private final ChecksumCalculator checksumCalculator = new ChecksumCalculator();

    public String taxpayerNumberFor(Taxpayer taxpayer) {
        throw new RuntimeException("gio didn't implement me");
    }
}
