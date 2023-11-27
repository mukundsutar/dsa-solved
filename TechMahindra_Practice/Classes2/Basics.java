package TechMahindra_Practice.Classes2;

public class Basics {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon();
        Item it1 = new Item();

        p1.level = 12;
        p1.name = "Eevee";

        p1.attack();

        it1.name = p1.name;
        it1.consume();
    }
}
