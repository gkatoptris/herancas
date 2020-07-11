/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

public class Cao extends Animais {
   
    public void latir(){
        System.out.println("*Latindo*");
    }
    
    @Override
    public void caminhar(){
        System.out.println("O caozinho está caminhando!");
    }
    
}