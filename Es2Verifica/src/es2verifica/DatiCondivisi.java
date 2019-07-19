/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es2verifica;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author besan
 */
public class DatiCondivisi {

    boolean d1A12 = false;
    boolean d13A24 = false;
    boolean d25A36 = false;

    int da1A12 = 0;
    int da13A24 = 0;
    int da25A36 = 0;
    int buffer = 0;

    private Semaphore sem1;
    private Semaphore sem2;
    private Semaphore sem3;
    private Semaphore sem4;
    private Semaphore sem5;

    public DatiCondivisi() {
        sem1 = new Semaphore(0);
        sem2 = new Semaphore(0);
        sem3 = new Semaphore(0);
        sem4 = new Semaphore(0);
        sem5 = new Semaphore(1);
    }

    public int getBuffer() {
        return buffer;
    }

    public void setBuffer(int buffer) {
        this.buffer = buffer;
    }

    public void da1A12Inseriti() {
        d1A12 = true;
        d13A24 = false;
        d25A36 = false;
    }

    public void da13A24Inseriti() {
        d1A12 = false;
        d13A24 = true;
        d25A36 = false;
    }

    public void da25A36Inseriti() {
        d1A12 = false;
        d13A24 = false;
        d25A36 = true;
    }

    public void da1A12Letto() {
        da1A12++;
    }

    public void da13A24Letto() {
        da13A24++;
    }

    public void da25A36Letto() {
        da25A36++;
    }

    public void visualizza() {
        System.out.println("Il numero estratto è: " + buffer);
        System.out.println("I numeri estratti da 1 a 12 sono: " + da1A12);
        System.out.println("I numeri estratti da 13 a 24 sono: " + da13A24);
        System.out.println("I numeri estratti da 25 a 36 sono: " + da25A36);
        if (d1A12 == true) {
            System.out.println("L'ultimo numero estratto è compreso tra 1 e 12");
        }

        if (d13A24 == true) {
            System.out.println("L'ultimo numero estratto è compreso tra 13 e 24");
        }

        if (d25A36 == true) {
            System.out.println("L'ultimo numero estratto è compreso tra 25 e 36");
        }
    }

    public void daiPermesso1() {
        sem1.release();
    }

    public void chiediPermesso1() {
        try {
            sem1.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void daiPermesso2() {
        sem2.release();
    }

    public void chiediPermesso2() {
        try {
            sem2.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void daiPermesso3() {
        sem3.release();
    }

    public void chiediPermesso3() {
        try {
            sem3.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void daiPermesso4() {
        sem4.release();
    }

    public void chiediPermesso4() {
        try {
            sem4.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void daiPermesso5() {
        sem5.release();
    }

    public void chiediPermesso5() {
        try {
            sem5.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
