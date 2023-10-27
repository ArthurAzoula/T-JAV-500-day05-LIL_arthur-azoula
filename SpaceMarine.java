public abstract class SpaceMarine extends Unit {

    protected Weapon weapon = null;

    protected SpaceMarine(String name, int hp, int damage, Weapon weapon) {
        super(name, hp, damage);
        this.equip(weapon);
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    @Override
    public boolean equip(Weapon weapon) {
        if (weapon == null) {
            return false;
        }
        if (this.weapon == weapon) {
            return false;
        }
        this.weapon = weapon;
        System.out.println(this.name + " has been equipped with a " + weapon.getName());
        return true;
    }

    @Override
    public boolean attack(Fighter fighter) {
        if (fighter == null) {
            return false;
        }
        if (weapon == null) {
            System.out.println("Hey, this is crazy. I'm not going to fight this empty-handed.");
            return false;
        }
        if (ap < weapon.getApcost()) {
            return false;
        }
        if (weapon.isMelee()) {
            if(this.fighterClose != fighter) {
                System.out.println(getName() + ": I'm too far away from " + fighter.getName() + ".");
                return false;
            }
        }
        ap -= weapon.getApcost();
        weapon.attack();
        fighter.receiveDamage(weapon.getDamage());
        return true;
    }

    @Override
    public void recoverAP() {
        ap += 9;
        if (ap > 50) {
            ap = 50;
        }
    }
}
