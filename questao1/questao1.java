import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class questao1{

    public static void main(String[] args) {
       
                 Scanner entrada = new Scanner(System.in);
                 List<String> degraus = new ArrayList<>();
                  
                 System.out.print("Digite a quantidade de degrau da escada: ");
                 int n = entrada.nextInt();
                 entrada.nextLine();

                 System.out.println("");
                 System.out.println("");

                for (int i = 0; i < n; i++) {
                degraus.add(" ".repeat(n - i) + "*".repeat(i + 1));
                }

 

                for (String d : degraus ) {
                 System.out.println(d);
               }
      }//fim main()

}//fim class
