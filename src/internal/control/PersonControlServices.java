package internal.control;

import data_model.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class PersonControlServices {

    private LicenceControlServices licenceControlServices;

    public PersonControlServices(final LicenceControlServices licenceControlServicesParam) {

        licenceControlServices = licenceControlServicesParam;

    }

    public void removeWeapon(final Person person, final Weapon weapon) {
        person.getWeapons().remove(weapon);
    }

    public void addWeapon(final Person person, final Weapon weapon) {
        person.getWeapons().add(weapon);
    }

    public void removeVisit(final Person person, final Visit visit) {
        person.getVisits().remove(visit);
    }

    public void addVisit(final Person person, final Visit visit) {
        person.getVisits().add(visit);
    }

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

    public boolean isAuthorizedInShootingRange(final Person person, final ShootingRange shootingRange) {
        return licenceControlServices.isValid(person.getLicence()) && person.getAuthorizedShootingRanges().contains(shootingRange);
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
