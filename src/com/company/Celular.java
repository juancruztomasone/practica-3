package com.company;

public class Celular implements IPrecedable<Celular>{
    String titular;
    String numero;

    public Celular(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public int precedeA(Celular c1) {
        return this.numero.compareTo(c1.numero);
    }

    @Override
    public String toString() {
        return "Celular {" +
                "titular='" + titular + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
