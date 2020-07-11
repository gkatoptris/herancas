
package exercicio3;


public class Normal extends Ingresso{
    
    @Override
    public void imprimirNota(){
        
         System.out.println("*NOTA DO INGRESSO*:"
                + "\n" + "VALOR DO INGRESSO:  R$"+this.valor);
    }
    
}
