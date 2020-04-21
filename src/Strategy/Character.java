package Strategy;

public abstract class Character {

    WeaponBehaviour weaponBehaviour;

    protected abstract void fight();

    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }
}
