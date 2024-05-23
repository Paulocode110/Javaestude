
public class FolhadePGTO {
    public static void main(String args[]) {
        Mensalista men1, men2;
        Horista hora1, hora2;

        men1 = new Mensalista("Paulo", "Rua Batuira", "Junior");
        men1.imprimir();

        men2 = new Mensalista("Maria", "Rua São Jay Garcia", "Senior");
        men2.imprimir();

        // Empregado horista
        hora1 = new Horista("Carlos", "Rua Jay Saturno", 20);
        hora1.imprimir();

        hora2 = new Horista("Diana", "Rua Central", 100);
        hora2.imprimir();
    }
}