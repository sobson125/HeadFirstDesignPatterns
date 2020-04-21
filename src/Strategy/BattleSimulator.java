package Strategy;

public class BattleSimulator {
    public static void main(String[] args) {

        Character mage = new Mage();
        Character bishop = new Bishop();

        mage.setWeaponBehaviour(new Wand());
        mage.fight();
        bishop.setWeaponBehaviour(new Stick());
        bishop.fight();
    }
}
