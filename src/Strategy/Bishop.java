package Strategy;

public class Bishop extends Character{
    @Override
    protected void fight() {
        super.weaponBehaviour.fight();
    }
}
