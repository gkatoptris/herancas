
package exercicio3;


public class Especial extends Ingresso {
    
    public double especial;
    
    public double vip(){
        this.valor = this.valor + 50;
        return this.valor;
    }
    
    
    @Override
    public void imprimirNota(){
        
         System.out.println("*NOTA DO INGRESSO*:"
                + "\n" + "VALOR DO INGRESSO ESPECIAL(VIP):  R$"+this.valor);
    }
}

