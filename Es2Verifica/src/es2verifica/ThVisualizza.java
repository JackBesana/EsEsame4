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
public class ThVisualizza extends Thread {

    DatiCondivisi datiC = new DatiCondivisi();
    int numero;

    public ThVisualizza(int n, DatiCondivisi ptrDati) {
        datiC = ptrDati;
        numero = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < numero; i++) {
            datiC.chiediPermesso4();
            datiC.visualizza();
            datiC.daiPermesso5();
        }
    }
}
