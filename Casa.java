/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

/**
 *
 * @author Pablo Sorzano
 */
public class Casa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         verNetflix objeto = new verNetflix();//constructor vacío
         objeto.mostrar();
         
         verNetflix obj = new verNetflix(true);//constructor lleno
         obj.mostrar();
    }
    
}
