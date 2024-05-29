public class Horista extends Empregado {
    private double horas;

    public Horista(String n, String e, double h) {
        super(n, e);
        horas = h;
        calcularSalario(); // Certifique-se de calcular o salário ao criar o objeto
    }

    // Métodos de acesso
    public void setHoras(double h) {
        horas = h;
    }

    public double getHoras() {
        return horas;
    }

    public void calcularSalario() {
        salario = 50 * horas;
    }
}