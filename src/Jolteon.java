public class Jolteon extends Eevee {
    private String tipo;
    private Double peso;
    private int altura;
    private int hp;
 
    public Jolteon(int hp, int altura, Double peso, String tipo) {
        super(hp, altura, peso, tipo); // Chamada ao construtor da classe pai
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

    @Override
    public String Ataque(){
        return ("Trovoada - Thunder-shock");    }

    @Override
    public String Especial(){
        return("Raio - Thunderbolt");
    }

    @Override
    public String Defesa(){
        return("Carga - Wild Charge");
    }

    }
