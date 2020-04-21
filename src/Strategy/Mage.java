package Strategy;

public class Mage extends Character {
    @Override
    protected void fight() {
       super.weaponBehaviour.fight();
    }
}
