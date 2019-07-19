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
public class ThDa25A36 extends Thread {
    DatiCondivisi datiC = new DatiCondivisi();
    int buffer;
    int numero;

    public ThDa25A36(int n, DatiCondivisi ptrDati) {
        datiC = ptrDati;
        buffer = datiC.getBuffer();
        numero = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < numero; i++) {
            datiC.chiediPermesso3();
            buffer = datiC.getBuffer();
            if ((buffer > 24) && (buffer < 37)) {
                datiC.da25A36Letto();
            }
            datiC.daiPermesso4();
        }
    }
}
