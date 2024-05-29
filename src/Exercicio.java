/*
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

public class Mensalista extends Empregado {
    private String cargo;

    // Construtor
    public Mensalista(String n, String e, String c) {
        super(n, e);
        cargo = c;
        calcularSalario(); // Certifique-se de calcular o salário ao criar o objeto
    }

    // Método de acesso
    public void setCargo(String c) {
        cargo = c;
    }

    public String getCargo() {
        return cargo;
    }

    public void calcularSalario() {
        if (cargo.equals("Junior")) {
            salario = 2500;
        } else if (cargo.equals("Pleno")) {
            salario = 3500;
        } else {
            salario = 5500;
        }
    }
}

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

public class FolhaDePgto {
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
 */

