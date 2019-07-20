package internal.control;

import data_model.Licence;

import java.util.Date;

public class LicenceControlServices {

    public LicenceControlServices() {

    }

    public boolean isValid(final Licence licence) {
        return licence.getEnd().before(new Date()) && licence.isValid() && licence.isPaid();
    }
}
