package data_model;

import java.util.Date;

public class Visit {

    private Date begin;

    private Date end;

    private ShootingRange shootingRange;

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

    public ShootingRange getShootingRange() {
        return shootingRange;
    }

    public void setShootingRange(ShootingRange shootingRange) {
        this.shootingRange = shootingRange;
    }

}
