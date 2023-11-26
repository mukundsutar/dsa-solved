package TechMahindra_Practice.Classes;

public class Basics {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("Pikachu", 12);
        p1.name = "Charmender";
        p1.level = 10;

        System.out.println();
        p1.attack();
    }
}
