package calculator.model;

import java.util.Date;

public class Taxpayer {

    public final String firstname;
    public final String lastname;
    public final Sex sex;
    public final Date birthdate;
    public final String county;

    public Taxpayer(String firstname, String lastname, Sex sex, Date birthdate, String county) {
        validate(lastname);
        validate(county);

        this.firstname = firstname;
        this.lastname = lastname;
        this.sex = sex;
        this.birthdate = birthdate;
        this.county = county;
    }

    private void validate(String param) {
        if (param.equals("")) {
            throw new IllegalArgumentException();
        }
    }
}
