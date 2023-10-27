public abstract class Monster extends Unit {

    protected int damage = 0;
    protected  int apcost = 0;

    protected Monster(String name, int hp, int damage) {
        super(name, hp, damage);
    }
}
