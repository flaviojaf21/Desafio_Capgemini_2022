import javax.swing.JOptionPane;
import java.util.regex.*;

public class questao2 {

    public static void main(String[] args) {
        
        int dif;
        String senha = Cadastre_a_senha();        
            
        dif = 6-(senha.length());

        // veriifca se a senha é menor que 6 se for maior então verifica se a senha é forte
        if(dif>0){
            System.out.println(dif);   
        } else if (validarsenha(senha)) {
            System.out.println("Senha válida");
        } else{
            System.out.println("Senha não é forte conforme a Política de Segurança:\n Possui no mínimo 6 caracteres\n Contem no mínimo 1 digito \n Contem no mínimo 1 letra em maíúscula \n Contem no mínimo 1 letra em minúscula \n Contem no mínimo 1 caractere especial. ");
        }  

    } // fim main () 

    /**
	 * Este metodo pede para o usuario cadastrar sua senha
	 * 
	 * retorna a variável senha
	 */
	private static String Cadastre_a_senha() {
		String senha = "";
		senha = JOptionPane.showInputDialog(null,
		"Digite a senha",
		"Cadastrando a senha", JOptionPane.INFORMATION_MESSAGE);
		
		return senha;
	}// fim metodo Cadastre_a_senha()


    /**
     * Este método usa expressões regulares ou Regex - uma API para validar a senha
     * 
     * retorna false se a senha não for forte conforme a política de senhas
     */
    public static boolean validarsenha(String senha)
    {

      // Regex valida a senha.
      // ^ representa o caractere inicial da string.
      // (? =. * [0-9]) representa um dígito deve ocorrer pelo menos uma vez.
      // (? =. * [az]) representa um alfabeto minúsculo deve ocorrer pelo menos uma vez.
      // (? =. * [AZ]) representa um alfabeto maiúsculo que deve ocorrer pelo menos uma vez.
      // (? =. * [@ # $% ^ & - + =()] representa um caractere especial que deve ocorrer pelo menos uma vez.
      // .{6, 30} representa pelo menos 6 caracteres e no máximo 30 caracteres.
      // $ representa o final da string.

      String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"+"(?=\\S+$).{6,30}$";

      // Compilar ReGex
      Pattern p = Pattern.compile(regex);
  
      // Se a senha é nulo
      // retorna false
      if (senha == null) {
          return false;
      }

      // A classe padrão contém o método matcher()
      // para encontrar correspondência entre a senha fornecida
      // e expressão regular.
      Matcher m = p.matcher(senha);
  
     // Retorna se a senha 
     // correpondeu a ReGex
     return m.matches();
    } // fim método validarsenha
                 
            
} // fim class
