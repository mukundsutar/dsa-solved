package TechMahindra_Practice.Classes3;

public class Main {
    public static void main(String[] args) {
        Fire fire = new Fire();
        Water water = new Water();

        fire.setStat("Flareon", 12);
        water.setStat("Vaporeon", 13);

        Pokemon[] poke = { fire, water };

        poke[0].attack();
        poke[1].attack();
    }
}
