package internal.control;

import data_model.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class PersonControlServices {

    private LicenceControlServices licenceControlServices;

    /**
     * Default constructor
     * @param licenceControlServicesParam licence control service used to manage licence from given person
     */
    public PersonControlServices(final LicenceControlServices licenceControlServicesParam) {

        licenceControlServices = licenceControlServicesParam;

    }

    public void removeWeapon(final Person person, final Weapon weapon) {
        person.getWeapons().remove(weapon);
    }

    public void addWeapon(final Person person, final Weapon weapon) {
        person.getWeapons().add(weapon);
    }

    /**
     * This method removes visit from a person. According to the french law, all visit must be saved.
     * So we should only used this method in case wrong visit creation. Users can't used this.
     * @param person current person
     * @param visit visit to remove
     */
    public void removeVisit(final Person person, final Visit visit) {
        person.getVisits().remove(visit);
    }

    /**
     * This method add a complete visit to given person. It's used to add visit after the real visit when problem happened
     * (No computer during initial visit by example).
     * @param person current person
     * @param visit visit to add
     */
    public void addVisit(final Person person, final Visit visit) {
        person.getVisits().add(visit);
    }

    /**
     * Creates visit when current person arrives in the shooting range.
     * At the end, if current person is not authorised to visit given shooting range we will throw an exception
     * @param person current person
     * @param beginDateParam begin date of the visit
     * @param shootingRangeParam chosen shooting range
     */
    public void createVisit(final Person person, final Date beginDateParam, final ShootingRange shootingRangeParam) {

        // Create visit to add (end date must be add only when shooter leave the place)
        final Visit visit = new Visit();
        visit.setBegin(beginDateParam);
        visit.setShootingRange(shootingRangeParam);

        // Adding visit to given person if it's possible
        if (this.isAuthorizedInShootingRange(person, shootingRangeParam)) {
            person.getVisits().add(visit);
        } else {
            // TODO throw an exception
        }

    }

    /**
     * Check if current person can access to given shooting range. Shooting range must be in the list of authorised
     * shooting range from current person, and the licence must be valid.
     * @param person current person
     * @param shootingRange shooting range to access
     * @return true if person can access to given shooting range
     */
    public boolean isAuthorizedInShootingRange(final Person person, final ShootingRange shootingRange) {
        return licenceControlServices.isValid(person.getLicence()) && person.getAuthorizedShootingRanges().contains(shootingRange);
    }

    /**
     * Creates a person with all basic information. By default new person can only access to the "VISITOR" shooting range,
     * and have any licence (used to save all visit, club's member or not).
     * @param firstName well...hum...first name
     * @param name the name
     * @param sex sexual orientation....no it's a joke, we don't care about that, it's just the sex of this person
     * @param birthDate find by yourself
     * @param address where this person lives, maybe under a bridge or inside an old castle lost in the wood
     * @return the new person, make good usage of this pretty nice person
     */
    public Person create(final String firstName, final String name, final Sex sex, final Date birthDate, final String address) {
        final Person person = new Person();
        person.setFirstName(firstName);
        person.setName(name);
        person.setSex(sex);
        person.setBirth(birthDate);
        person.setAddress(address);
        person.setExamOk(false);
        person.setCompetitor(false);
        person.getAuthorizedShootingRanges().add(ShootingRange.VISITOR);
        return person;
    }

    public int getAge(final Person person) {
        // TODO take care of complete birth date, not only the year
        return new Date().getYear() - person.getBirth().getYear();

    }

    public List<Weapon> getFavoritePowderPistol(Person person) {
        return person.getWeapons().stream().filter(weapon -> weapon.getType().equals(WeaponType.POWDER_PISTOL)).collect(Collectors.toList());
    }

    public List<Weapon> getFavoriteAirPistol(Person person) {
        return person.getWeapons().stream().filter(weapon -> weapon.getType().equals(WeaponType.AIR_PISTOL)).collect(Collectors.toList());
    }

    public List<Weapon> getFavoriteBlackPowderPistol(Person person) {
        return person.getWeapons().stream().filter(weapon -> weapon.getType().equals(WeaponType.BLACK_POWDER_PISTOL)).collect(Collectors.toList());
    }

    public List<Weapon> getFavoritePowderRifle(Person person) {
        return person.getWeapons().stream().filter(weapon -> weapon.getType().equals(WeaponType.POWDER_RIFLE)).collect(Collectors.toList());
    }

    public List<Weapon> getFavoriteAirRifle(Person person) {
        return person.getWeapons().stream().filter(weapon -> weapon.getType().equals(WeaponType.AIR_PISTOL)).collect(Collectors.toList());
    }

    public List<Weapon> getFavoriteBlackPowderRifle(Person person) {
        return person.getWeapons().stream().filter(weapon -> weapon.getType().equals(WeaponType.BLACK_POWDER_RIFLE)).collect(Collectors.toList());
    }

    public void addFavoriteWeapon(final Person person, final Weapon weapon) {
        
    }

}
