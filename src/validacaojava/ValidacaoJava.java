
package validacaojava;

import javax.swing.JFrame;


public class ValidacaoJava {

   
    public static void main(String[] args) {
        JFrame janela = new JFrame ("Cadastro de Clientes");
        CadastroClientes painel = new CadastroClientes();
        
        
        //Define atributos da tela
        
        janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
        janela.setSize(430, 300);
        janela.add(painel);
        janela.setVisible(true);
    }
 }
    
