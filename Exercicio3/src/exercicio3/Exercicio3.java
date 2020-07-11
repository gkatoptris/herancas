
package exercicio3;

import javax.swing.JOptionPane;


public class Exercicio3 {

  
   public static void main(String[] args) {
        
        int operacao;        
        operacao = Integer.parseInt(JOptionPane.showInputDialog("Se deseja comprar o ingresso normal digite 1" + 
                "\n" + "Se deseja comprar o especial(VIP) digite 2"));
        
        switch(operacao){
            case 1:
                Normal normal = new Normal();
                normal.imprimirNota();
                break;
            case 2:
                Especial vip = new Especial();
                vip.vip();
                int opcao;
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Se deseja o camarote inferior digite 1"+
                        "\n"+ "Se deseja o camarote superior digite 2"));
                
                        switch(opcao){
                            
                            case 1:
                                CamInferior infer = new CamInferior();
                                infer.imprimirNota();
                                break;
                                
                            case 2:
                                CamSuperior supe = new CamSuperior();
                                supe.vip();
                                supe.imprimirNota();
                                break;
                                
                            default:
                                JOptionPane.showMessageDialog(null,"Digite somente o numero 1 ou o numero 2");
                                vip.imprimirNota();
                                break;
                        }
                break;
            default:
                JOptionPane.showMessageDialog(null,"Digite somente o numero 1 ou o numero 2");
                System.exit(0);
                break;
    
    
        }
    }
    
}
