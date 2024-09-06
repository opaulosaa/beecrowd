package lista2.ex2434;

public class ContaVovo {
    private int saldoInicial;
    private int menorSaldo;

    public ContaVovo(int saldoInicial) {
        this.saldoInicial = saldoInicial;
        this.menorSaldo = saldoInicial;
    }
    public void movimentacaoDiaria(int movimentacao){
        saldoInicial += movimentacao;
        if (saldoInicial < menorSaldo){
            menorSaldo = saldoInicial;
        }
    }

    public int getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(int saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public void setMenorSaldo(int menorSaldo) {
        this.menorSaldo = menorSaldo;
    }

    public int getMenorSaldo(){
        return menorSaldo;
    }
}
