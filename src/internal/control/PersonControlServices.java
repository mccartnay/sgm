package internal.control;

import data_model.Person;
import data_model.Weapon;
import data_model.WeaponType;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;

public class PersonControlServices {

    public PersonControlServices() {

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
