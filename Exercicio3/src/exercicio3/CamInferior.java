
package exercicio3;


public class CamInferior extends Especial{
    
    public String tipo = "Inferior";
    
    @Override
    public void imprimirNota(){
        System.out.println("*NOTA DO INGRESSO*:"
                + "\n"+"VALOR DO INGRESSO ESPECIAL(VIP): R$"+this.vip()
                + "\n" + " TIPO DO CAMAROTE: "+this.tipo+" PREÇO:  R$0.0"
                + "\n"+"TOTAL DO VALOR:  R$"+this.valor);
    }
    
}
