package data_model;

import java.util.Date;

public class Licence {

    private Date begin;

    private Date end;

    private boolean isPaid;

    /**
     * This field is not about validity date, it will be used to marked excluded person.
     */
    private boolean isValid;

    private int licenceNumber;

    private int clubNumber;

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public int getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(int licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public int getClubNumber() {
        return clubNumber;
    }

    public void setClubNumber(int clubNumber) {
        this.clubNumber = clubNumber;
    }

}
