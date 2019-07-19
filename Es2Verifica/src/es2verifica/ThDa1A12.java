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
public class ThDa1A12 extends Thread {

    DatiCondivisi datiC = new DatiCondivisi();
    int buffer;
    int numero;

    public ThDa1A12(int n, DatiCondivisi ptrDati) {
        datiC = ptrDati;
        buffer = datiC.getBuffer();
        numero = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < numero; i++) {
            datiC.chiediPermesso1();
            buffer = datiC.getBuffer();
            if ((buffer > 0) && (buffer < 13)) {
                datiC.da1A12Letto();
            }
            datiC.daiPermesso2();
        }
    }
}
