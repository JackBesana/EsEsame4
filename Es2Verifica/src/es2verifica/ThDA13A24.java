/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es2verifica;

/**
 *
 * @author besan
 */
public class ThDA13A24 extends Thread {
    DatiCondivisi datiC = new DatiCondivisi();
    int buffer;
    int numero;

    public ThDA13A24(int n, DatiCondivisi ptrDati) {
        datiC = ptrDati;
        buffer = datiC.getBuffer();
        numero = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < numero; i++) {
            datiC.chiediPermesso2();
            buffer = datiC.getBuffer();
            if ((buffer > 12) && (buffer < 25)) {
                datiC.da13A24Letto();
            }
            datiC.daiPermesso3();
        }
    }
}
