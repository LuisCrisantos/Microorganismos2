package com.company;

import java.util.Random;

public class Microorganismos extends Cuerpo{
    int vidas;
    int loc;
    int numdeOrg;
    String estado;
    Random rand = new Random();

    public Microorganismos(){
        this.vidas = 256;
        this.estado = "Vivo";
    }

    public void movePlace(int numdeOrg)
    {
        switch(numdeOrg)
        {
            case 3:
                this.vidas=this.vidas>>1;
                System.out.println("Organismo: "+numdeOrg+ ". Parte del cuerpo: " + partes[numdeOrg] + ". Vidas: "+vidas+". Estado: "+estado);
                break;
            default:
                System.out.println("Organismo: "+numdeOrg+ ". Parte del cuerpo: " + partes[numdeOrg] + ". Vidas: "+vidas+". Estado: "+estado);
                break;
        }
    }

    public void moverOrgano(int numdeOrg){

        System.out.println("Organismo: "+numdeOrg+ ". Parte del cuerpo: " + partes[5] + ". Vidas: "+vidas+". Estado: "+estado);

        while(vidas>0) {
            loc = rand.nextInt(7);

            if (loc == higado) {
                vidas = vidas >> 1;
            }

            if(vidas <= 0){
                estado = "Muerto";
            }

            System.out.println("Organismo: "+numdeOrg+ ". Parte del cuerpo: " + partes[loc] + ". Vidas: "+vidas+". Estado: "+estado);
        }
    }
}
