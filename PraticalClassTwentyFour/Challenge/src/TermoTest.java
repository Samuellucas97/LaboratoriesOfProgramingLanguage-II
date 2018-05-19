import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testa os m�todos da classe Termo com JUnit5")
public class TermoTest {

	@Test
	@DisplayName("Testando o m�todo insere")
	public void insereTest() {
		
		Termo a = new Termo(20,2);
		Termo b = new Termo();
		
		assertEquals(false, b.getCoeficiente() == a.getCoeficiente() && b.getGrauDoMonomio() == a.getGrauDoMonomio(), 
				"O resultado esperado eh False... Est� correto?");
		
		b.insere(a);
		
		assertEquals(true, b.getCoeficiente() == a.getCoeficiente() && b.getGrauDoMonomio() == a.getGrauDoMonomio(), 
				"O resultado esperado eh True... Est� correto?");

		
	}
	
	@Test
	@DisplayName("Testando o m�todo calcula")
	public void calculaTest() {	 
		
		Termo a = new Termo(20,2);
		assertEquals(180,a.calcula(3),"O resultado esperado eh 180 pois a expressao eh (20*(3)^2)... Est� correto?");	
	
	}

}
