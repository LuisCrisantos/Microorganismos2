package com.company;

public class Main {

    public static void main(String[] args) {
        int i;
        int num=0;
        Microorganismos[] micro = new Microorganismos[4];

        for(i=0; i<4; i++){
            micro[i] = new Microorganismos();
            micro[i].moverOrgano(i+1);
        }

    }
}

