package aula2;

import java.time.LocalTime;

public class Carro {
    private String marca;
    private String cor;
    private int taxa;
    private double tempoDeEstacionamento;

    public Carro() {
    }

    public Carro(String marca, String cor, double tempoDeEstacionamento) {
        this.marca = marca;
        this.cor = cor;
        this.tempoDeEstacionamento = tempoDeEstacionamento;
    }

    public void calcularTaxa() {

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
        return "Carro [cor=" + cor + ", marca=" + marca + ", taxa=" + taxa + "]";
    }

}
