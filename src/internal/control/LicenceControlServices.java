package internal.control;

import data_model.Licence;

import java.util.Date;

public class LicenceControlServices {

    /**
     * Default constructor
     */
    public LicenceControlServices() {

    }

    /**
     * Check if current licence is valid. It's mean that end validity is not yet arrived, licence has been paid,
     * and proprietary of given licence has not be excluded.
     * @param licence given licence
     * @return true if all conditions are correct
     */
    public boolean isValid(final Licence licence) {
        return licence.getEnd().before(new Date()) && licence.isValid() && licence.isPaid();
    }
}
