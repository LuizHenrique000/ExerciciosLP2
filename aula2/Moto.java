package aula2;

public class Moto {
    private String marca;
    private String cor;
    private int taxa;
    private double tempoDeEstacionamento;

    public Moto() {
    }

    public Moto(String marca, String cor, double tempoDeEstacionamento) {
        this.marca = marca;
        this.cor = cor;
        this.tempoDeEstacionamento = tempoDeEstacionamento;
    }

    public void calcularTaxa() {
        if (tempoDeEstacionamento <= 30) {
            taxa = 7;
        } else if (tempoDeEstacionamento <= 60) {
            taxa = 10;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTaxa() {
        return taxa;
    }

    public double getTempoDeEstacionamento() {
        return tempoDeEstacionamento;
    }

    public void setTempoDeEstacionamento(double tempoDeEstacionamento) {
        this.tempoDeEstacionamento = tempoDeEstacionamento;
    }

    public void setTaxa(int taxa) {
        this.taxa = taxa;
    }

    @Override
    public String toString() {
        return "Moto [cor=" + cor + ", marca=" + marca + ", taxa=" + taxa + "]";
    }

}
