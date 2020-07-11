
package exercicio2;


public class Animais {
    
    protected String nome;
    protected String tipo;

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", tipo=" + tipo + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
  
  
  public void caminhar(){
      System.out.println("Olhe, estou andando!");
  }
    
}
