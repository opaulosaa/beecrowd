package lista2.ex1038;

public class Lanche {
    private int codigo;
    private int quantidade;

    public void total(){
        double total;
        total = 0;
        if (getCodigo() == 1){
            total = quantidade * 4.00;
        } else if (getCodigo() == 2) {
            total = quantidade * 4.50;
        } else if (getCodigo() == 3) {
            total = quantidade * 5.00;
        } else if (getCodigo() == 4) {
            total = quantidade * 2.00;
        } else if (getCodigo() == 5) {
            total = quantidade * 1.50;
        }

        System.out.printf("Total: R$ %.2f\n", total);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
