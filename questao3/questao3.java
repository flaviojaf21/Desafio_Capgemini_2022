import javax.swing.JOptionPane;
import java.util.Arrays;

public class questao3 {
    public static void main(String[] args) {
       
        String str = Digite_a_palavra();
                
        int tamanhoDaString = str.length();
        int anagramas=0, ctr1=0, ctr2=0;
        String subStr1, subStr2;

        for (int i = 1; i < tamanhoDaString; i++) {
            ctr1 = i;

            for (int j = 0; ctr1 <= tamanhoDaString; j++) { 
                subStr1 = str.substring(j, ctr1);
                ctr2 = i + j + 1;
                
                for (int l = j + 1; ctr2 <= tamanhoDaString; l++) {
                    if (ctr2 == tamanhoDaString) {
                        subStr2 = str.substring(l);
                    }
                    else {
                        subStr2 = str.substring(l, ctr2);
                    }
                    char[] array1 = subStr1.toCharArray();
                    char[] array2 = subStr2.toCharArray();
                    Arrays.sort(array1);
                    Arrays.sort(array2);
                    if (Arrays.equals(array1, array2)) {
                        anagramas++;
                    }
                    ctr2++;
                    
                }
                ctr1++;
            }
        }
        System.out.println(anagramas);
    }//fim main

    /**
	 * Este metodo pede ao usuario para entrar com uma palavra
	 * 
	 * returna a variável palavra
	 */
	private static String Digite_a_palavra() {
		String palavra = "";
		while (palavra.length() <= 2) {
			palavra = JOptionPane.showInputDialog(null,
					"Digite uma palavra de no minimo 3 caracteres",
					"Calculando Anagrama", JOptionPane.INFORMATION_MESSAGE);
		}
		return palavra;
	}// fim metodo Digite_a_palavra()

} //fim class
