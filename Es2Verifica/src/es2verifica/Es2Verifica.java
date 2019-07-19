/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es2verifica;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author besan
 */
public class Es2Verifica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try {
            // TODO code application logic here
            Scanner input = new Scanner(System.in);

            DatiCondivisi datiC = new DatiCondivisi();

            System.out.println("Digitate quanti numeri inserire");
            int n = input.nextInt();

            ThGenera th1 = new ThGenera(n, datiC);
            ThDa1A12 th2 = new ThDa1A12(n, datiC);
            ThDA13A24 th3 = new ThDA13A24(n, datiC);
            ThDa25A36 th4 = new ThDa25A36(n, datiC);
            ThVisualizza th5 = new ThVisualizza(n, datiC);

            th1.start();
            th2.start();
            th3.start();
            th4.start();
            th5.start();

            th1.join();
            th2.join();
            th3.join();
            th4.join();
            th5.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Es2Verifica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
