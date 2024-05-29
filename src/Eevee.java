public class Eevee {
    private String tipo;
    private Double peso;
    private int altura;
    private int hp;

    public Eevee(int hp, int altura, Double peso, String tipo) {
        this.hp = hp;
        this.altura = altura;
        this.peso = peso;
        this.tipo = tipo;
    }

    // Getter methods
    public int getHp() {
        return hp;
    }

    public int getAltura() {
        return altura;
    }

    public Double getPeso() {
        return peso;
    }

    public String getTipo() {
        return tipo;
    }

    // Setter methods
    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Abstract methods for subclasses to override
    public String Ataque() {
        return "Ataque básico";
    }

    public String Especial() {
        return "Ataque especial";
    }

    public String Defesa() {
        return "Defesa básica";
    }
}
