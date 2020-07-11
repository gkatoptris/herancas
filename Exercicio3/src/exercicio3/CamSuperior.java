
package exercicio3;


public class CamSuperior extends Especial{
    
    public String local = "Superior";
    public double total;
    
    @Override
    public double vip(){
        this.valor = this.valor + 50;
        return this.valor;
    } 
    
    
    
    @Override
    public void imprimirNota(){
        System.out.println("*NOTA DO INGRESSO*:"
                + "\n"+"VALOR DO INGRESSO ESPECIAL(VIP):  R$"+this.valor
                + "\n"+"TIPO DO CAMAROTE: "+this.local+" PREÇO: R$50.00"
                + "\n"+"TOTAL DO VALOR: R$"+this.vip()
        );
    }
    
}
