package lista3.ex2059;

public class Jogo implements Regras{

    @Override
    public void determinarVencedor() {
    int soma = getJ1() + getJ2();
        if (p == 1){
         if (soma % 2 != 0){
             if (r == 1 && a == 0){
                 System.out.println("Jogador 1 ganha!");
             }else if (r == 0 && a == 0) {
                 System.out.println("Jogador 2 ganha!");
             } else if (r == 0 && a == 1) {
                 System.out.println("Jogador 1 ganha!");
             } else if (r == 1 && a == 1) {
                 System.out.println("Jogador 2 ganha!");
             }
         } else if (soma % 2 == 0) {
             if (r == 1 && a == 0){
                 System.out.println("Jogador 1 ganha!");
             }else if (r == 0 && a == 0) {
                 System.out.println("Jogador 1 ganha!");
             } else if (r == 0 && a == 1) {
                 System.out.println("Jogador 1 ganha!");
             } else if (r == 1 && a == 1) {
                 System.out.println("Jogador 2 ganha!");
             }
         }
        } else if (p == 0) {
            if (soma % 2 != 0){
                if (r == 1 && a == 0){
                    System.out.println("Jogador 1 ganha!");
                }else if (r == 0 && a == 0) {
                    System.out.println("Jogador 1 ganha!");
                } else if (r == 0 && a == 1) {
                    System.out.println("Jogador 1 ganha!");
                } else if (r == 1 && a == 1) {
                    System.out.println("Jogador 2 ganha!");
                }
            } else if (soma % 2 == 0) {
                if (r == 1 && a == 0){
                    System.out.println("Jogador 1 ganha!");
                }else if (r == 0 && a == 0) {
                    System.out.println("Jogador 2 ganha!");
                } else if (r == 0 && a == 1) {
                    System.out.println("Jogador 1 ganha!");
                } else if (r == 1 && a == 1) {
                    System.out.println("Jogador 2 ganha!");
                }
            }
        }
    }

    protected int p;
    protected int j1;
    protected int j2;
    protected int r;
    protected int a;

    public Jogo(int p, int j1, int j2, int r, int a) {
        this.p = p;
        this.j1 = j1;
        this.j2 = j2;
        this.r = r;
        this.a = a;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getJ1() {
        return j1;
    }

    public void setJ1(int j1) {
        this.j1 = j1;
    }

    public int getJ2() {
        return j2;
    }

    public void setJ2(int j2) {
        this.j2 = j2;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
