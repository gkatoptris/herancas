
package exercicio2;


public class Gatinho extends Animais{
    
    public void miar(){
        System.out.println("Miando*");
    }
    
    @Override
    public void caminhar(){
        System.out.println("O gatinho está andando!");
    }
    
}