package data_model;

import java.util.Date;

public class Weapon {

    private WeaponType type;

    private int id;

    private Date lestRev;

    private State currentState;

    private boolean isUsed;

    public WeaponType getType() {
        return type;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getLastRev() {
        return lestRev;
    }

    public void setLestRev(Date lestRev) {
        this.lestRev = lestRev;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }
}
