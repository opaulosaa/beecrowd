package lista2.ex2221;

public class Pomekon {
    private int ataque;
    private int defesa;
    private int nivel;

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Pomekon(int ataque, int defesa, int nivel) {
        this.ataque = ataque;
        this.defesa = defesa;
        this.nivel = nivel;
    }

    public double calcularValorGolpe(int bonus){
        double valorGolpe  = (getAtaque() + getDefesa()) / 2.0;
        if (nivel % 2 == 0){
            valorGolpe += bonus;
        }
        return valorGolpe;
    }
}
