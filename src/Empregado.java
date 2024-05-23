public class Empregado {
    protected String nome;
    protected String endereco;
    protected double salario;

    // Construtor
    public Empregado(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularIrpf() {
        double irpf;
        if (salario <= 1903.98) {
            irpf = 0;
        } else if (salario <= 2826.65) {
            irpf = 0.075 * salario - 142.80;
        } else if (salario <= 3751.05) {
            irpf = 0.15 * salario - 354.80;
        } else if (salario <= 4664.68) {
            irpf = 0.225 * salario - 636.13;
        } else {
            irpf = 0.275 * salario - 869.36;
        }
        return irpf;
    }

    public double calcularInss() {
        double inss;
        if (salario <= 1212.00) {
            inss = 0.075 * salario;
        } else if (salario <= 2427.35) {
            inss = 0.09 * salario - 18.18;
        } else if (salario <= 3641.03) {
            inss = 0.12 * salario - 91.00;
        } else if (salario <= 7087.22) {
            inss = 0.14 * salario - 163.82;
        } else {
            inss = 828.39; // Teto do INSS
        }
        return inss;
    }

    public void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Salário: " + getSalario());
        System.out.println("IRPF: " + calcularIrpf());
        System.out.println("INSS: " + calcularInss());
    }
}