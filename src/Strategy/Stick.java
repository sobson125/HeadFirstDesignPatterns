package Strategy;

public class Stick implements WeaponBehaviour{
    @Override
    public void fight() {
        System.out.println("Healing allies with stick");
    }
}
