package com.company;

public class Cuerpo {
    int cerebro;
    int corazon;
    int pulmones;
    int higado;
    int estomago;
    int boca;
    int intestinos;
    String[] partes = {"Cerebro", "Corazon", "Pulmones", "Higado", "Estomago", "Boca", "Intestinos"};

    public Cuerpo() {
        this.cerebro = 0;
        this.corazon = 1;
        this.pulmones = 2;
        this.higado = 3;
        this.estomago = 4;
        this.boca = 5;
        this.intestinos = 6;
    }
}