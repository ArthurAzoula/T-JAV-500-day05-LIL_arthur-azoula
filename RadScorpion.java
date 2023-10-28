public class RadScorpion extends Monster {

    private static int id = 1;

    public RadScorpion() {
        super("RadScorpion #" + id, 80, 50);
        System.out.println(this.getName() + ": Crrr!");
        this.damage = 25;
        this.apcost = 8;
        id++;
    }

    @Override
    public boolean attack(Fighter fighter) {
        if (fighter == null) {
            return false;
        }
        if (this.fighterClose != fighter) {
            System.out.println(getName() + ": I'm too far away from " + fighter.getName() + ".");
            return false;
        }
        if (ap < apcost) {
            return false;
        }
        ap -= apcost;
        System.out.println(getName() + " attacks " + fighter.getName() + ".");

        int dmg = this.damage;

        if (!(fighter instanceof AssaultTerminator) && fighter instanceof SpaceMarine) {
            dmg = damage * 2;
        }

        fighter.receiveDamage(dmg);
        return true;
    }

}
