
package exercicio3;


public class Ingresso {
    
     public double valor = 245; 
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void imprimirNota(){
        System.out.println("*NOTA DO INGRESSO*:"
                + "\n" + "VALOR DO INGRESSO:  R$"+this.valor);
    }
    
    
    
}
