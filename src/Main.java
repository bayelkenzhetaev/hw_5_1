public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossDefence("голум");
        boss.setDemage(666);
        boss.setHealth(1000);

        System.out.println("Boss health " + boss.getHealth() + "\nboss damage: " + boss.getDemage() + "\ntype boss defence " + boss.getBossDefence());
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getHealth() + "," + createHeroes()[i].getDemage());
        }
    }

    private static Hero[] createHeroes() {
        Hero bayel = new Hero(100, 1000);
        Hero ainazik = new Hero(0, 12, "эластик");
        Hero asan = new Hero(200, 1);
        Hero[] superHero = {bayel, ainazik, asan};
        return superHero;

    }
}