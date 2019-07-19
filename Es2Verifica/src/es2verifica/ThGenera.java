/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es2verifica;

import java.util.Random;

/**
 *
 * @author besan
 */
public class ThGenera extends Thread {

    DatiCondivisi datiC = new DatiCondivisi();
    int buffer;
    int num;

    public ThGenera(int n, DatiCondivisi ptrDati) {
        buffer = datiC.getBuffer();
        datiC = ptrDati;
        num = n;
    }

    @Override
    public void run() {
        Random rand = new Random();
        for (int i = 0; i < num; i++) {
            datiC.chiediPermesso5();
            buffer = (rand.nextInt(37));
            if ((buffer > 0) && (buffer < 13)) {
                datiC.da1A12Inseriti();
            }
            if ((buffer > 12) && (buffer < 25)) {
                datiC.da13A24Inseriti();
            }
            if ((buffer > 24) && (buffer < 37)) {
                datiC.da25A36Inseriti();
            }
            datiC.setBuffer(buffer);
            datiC.daiPermesso1();
        }
    }
}
