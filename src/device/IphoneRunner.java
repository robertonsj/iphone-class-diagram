/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package device;

/**
 *
 * @author logistica
 */
public class IphoneRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Iphone iPhone = new Iphone();
        iPhone.realizarChamada();
        iPhone.exibirPagina();
        iPhone.reproduzirMusica();
    }
    
}
