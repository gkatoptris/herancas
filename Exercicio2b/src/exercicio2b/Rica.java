
package exercicio2b;


public class Rica extends Pessoa {
    private double dindin = 1000000;
    
    public double getDindin() {
        return dindin;
    }

    public void setDindin(double dindin) {
        this.dindin = dindin;
    }
    
    public void fazCompras(){
        System.out.println("\nRico: Vou investir uma grande quantia nessa nova empresa que saiu no mercado, no total de R$ "+ dindin);
    }
}