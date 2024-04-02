package TechMahindra_Practice.Classes3;

public class Pokemon {
    String name;
    int lvl;

    // Pokemon(String name, int lvl) {
    // this.name = name;
    // this.lvl = lvl;

    // System.out.println("lvl" + lvl + " " + name + " attack!");
    // }

    public void setStat(String pName, int pLvl) {
        name = pName;
        lvl = pLvl;
    }

    public void attack() {
        System.out.println("lvl" + lvl + " " + name + " attack!");
    }

    public void go() {
        System.out.println("Pokemon go!");
    }
}
