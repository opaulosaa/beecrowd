package lista2.ex2221;

public class Batalha {
    private Pomekon pomekonDabriel;
    private Pomekon pomekonGuarte;
    private int bonus;

    public Batalha(Pomekon pomekonDabriel, Pomekon pomekonGuarte, int bonus) {
        this.pomekonDabriel = pomekonDabriel;
        this.pomekonGuarte = pomekonGuarte;
        this.bonus = bonus;
    }

    public String determinarVencedor(){
        double valorGolpeDabriel = pomekonDabriel.calcularValorGolpe(getBonus());
        double valorGolpeGuarte = pomekonGuarte.calcularValorGolpe(getBonus());

        if (valorGolpeDabriel > valorGolpeGuarte){
            return "Dabriel";
        } else if (valorGolpeDabriel < valorGolpeGuarte) {
            return "Guarte";
        } else {
            return "Empate";
        }
    }

    public Pomekon getPomekonDabriel() {
        return pomekonDabriel;
    }

    public void setPomekonDabriel(Pomekon pomekonDabriel) {
        this.pomekonDabriel = pomekonDabriel;
    }

    public Pomekon getPomekonGuarte() {
        return pomekonGuarte;
    }

    public void setPomekonGuarte(Pomekon pomekonGuarte) {
        this.pomekonGuarte = pomekonGuarte;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
