public class Pokedex {
    public static void main(String[] args) {
        Eevee e = new Eevee(55,30,6.5,"Normal");
        Umbreon u = new Umbreon(95, 100, 27.0, "Sombrio");
        Jolteon j = new Jolteon(65, 80, 24.5, "Elétrico");
        Vaporeon v = new Vaporeon(135, 100, 29.0, "Água");

        System.out.println("Eevee Ataque: " + e.Ataque());
        System.out.println("Eevee Defesa: " + e.Defesa());
        System.out.println("Eevee Especial: " + e.Especial());

        e = u;
        System.out.println("Umbreon Ataque: " + e.Ataque());
        System.out.println("Umbreon Defesa: " + e.Defesa());
        System.out.println("Umbreon Especial: " + e.Especial());

        e = v;
        System.out.println("Vaporeon Ataque: " + e.Ataque());
        System.out.println("Vaporeon Defesa: " + e.Defesa());
        System.out.println("Vaporeon Especial: " + e.Especial());

        e = j;
        System.out.println("Jolteon Ataque: " + e.Ataque());
        System.out.println("Jolteon Defesa: " + e.Defesa());
        System.out.println("Jolteon Especial: " + e.Especial());
    }
}
