public class TacticalMarine extends SpaceMarine {

    protected String name;

    protected TacticalMarine(String name) {
        super(name, 100, 20);
        this.name = name;
        System.out.println(this.name + " on duty.");

    }

}
