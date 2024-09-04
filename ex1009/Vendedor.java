package lista2.ex1009;

public class Vendedor {
    private String nome;
    private double salario;
    private double valorVendas;

    public void calcularBonus(){
        double bonus = salario + (valorVendas * 0.15);
        System.out.printf("TOTAL = R$ %.2f\n", bonus);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }
}
