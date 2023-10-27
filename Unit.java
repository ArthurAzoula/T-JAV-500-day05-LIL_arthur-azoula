public abstract class Unit implements Fighter {

    protected String name;
    protected int hp;
    protected int ap;

    protected Unit(String name, int hp, int ap) {
        this.name = name;
        this.hp = hp;
        this.ap = ap;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public int getAp() {
        return ap;
    }

    @Override
    public void receiveDamage(int damage) {
        

    }
}
