public class AssaultTerminator extends SpaceMarine {

    protected String name;

    protected AssaultTerminator(String name) {
        super(name, 150, 30);
        this.name = name;
        System.out.println(this.name + " has teleported from space.");
        super.equip(new PowerFist());
    }

    @Override
    public void receiveDamage(int damage) {
        damage -= 3;
        if (damage < 1) {
            damage = 1;
        }
        super.receiveDamage(damage);
    }
}
