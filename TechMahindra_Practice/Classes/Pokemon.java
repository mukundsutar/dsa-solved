package TechMahindra_Practice.Classes;

public class Pokemon {
    String name;
    int level;

    Pokemon(String name, int level) {
        System.out.println(name + " lvl" + level);
    }

    void attack() {
        System.out.println(name + " " + "attack!");
    }
}
