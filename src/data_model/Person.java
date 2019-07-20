package data_model;

import java.util.Date;
import java.util.List;

public class Person {

    private Date birth;

    private String name;

    private String firstName;

    private Sex sex;

    private String address;

    private String mail;

    private String phone;

    private List<Weapon> weapons;

    private List<Visit> visits;

    private Licence licence;

    private boolean isCompetitor;

    private boolean examOk;

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }

    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }

    public Licence getLicence() {
        return licence;
    }

    public void setLicence(Licence licence) {
        this.licence = licence;
    }

    public boolean isCompetitor() {
        return isCompetitor;
    }

    public void setCompetitor(boolean competitor) {
        isCompetitor = competitor;
    }

    public boolean isExamOk() {
        return examOk;
    }

    public void setExamOk(boolean examOk) {
        this.examOk = examOk;
    }
}
