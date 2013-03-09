package calculator.model;

import com.natpryce.makeiteasy.Instantiator;
import com.natpryce.makeiteasy.Property;
import com.natpryce.makeiteasy.PropertyLookup;
import org.joda.time.LocalDate;

import static calculator.model.Sex.FEMALE;
import static com.natpryce.makeiteasy.Property.newProperty;

public class TaxpayerMaker {
    public static final Property<Taxpayer, String> firstname = newProperty();
    public static final Property<Taxpayer, String> lastname = newProperty();
    public static final Property<Taxpayer, Sex> sex = newProperty();
    public static final Property<Taxpayer, LocalDate> birthdate = newProperty();
    public static final Property<Taxpayer, String> county = newProperty();

    public static final Instantiator<Taxpayer> Taxpayer = new Instantiator<calculator.model.Taxpayer>() {
        @Override
        public Taxpayer instantiate(PropertyLookup<Taxpayer> lookup) {
            return new Taxpayer(lookup.valueOf(firstname, "first.name"),
                                lookup.valueOf(lastname, "last.name"),
                                lookup.valueOf(sex, FEMALE),
                                lookup.valueOf(birthdate, new LocalDate(1980, 6, 10)),
                                lookup.valueOf(county, "Bologna"));
        }
    };
}
