public class Hero {
    private int health;
    private int demage;
    private String ability;

    public int getHealth() {
        return health;
    }

    public int getDemage() {
        return demage;
    }

    public String getAbility() {
        return ability;
    }

    public Hero(int health, int demage) {
        this.health = health;
        this.demage = demage;
    }

    public Hero(int health, int demage, String ability) {
        this.health = health;
        this.demage = demage;
        this.ability = ability;
    }
}
