import static org.junit.Assert.*;
import org.junit.Test;



public class questao2teste {

  @Test

  public void questao2Teste() {

  //Arrange
  questao2 q = new questao2();
  int tam1=3;
  int result;

  //Act
  result= q.tamanhosenha(tam1);

  //Assert
  assertEquals(3, result);
  
  }
    
}
