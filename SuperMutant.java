public class SuperMutant extends Monster {

    private static int id = 1;

    public SuperMutant() {
        super("SuperMutant #" + id, 170, 20);
        this.damage = 60;
        this.apcost = 20;
        id++;
        System.out.println(this.name + ": Roaarrr!");
    }

    @Override
    public void recoverAP() {
        super.recoverAP();
        hp = Math.min(170, hp + 10);
    }
}
