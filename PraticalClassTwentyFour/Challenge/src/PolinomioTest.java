import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testa os métodos da classe Polinomio com JUnit5")
public class PolinomioTest {

	@Test
	@DisplayName("Testando o método insere")
	public void insereTest() {
		Termo a = new Termo(7,3);
		Polinomio p = new Polinomio();
		
		assertEquals(true, p.insere(a), "O resultado deve ser True... Está certo?");
		//assertEquals(false, p.insere(null),"O resultado deve ser False... Está certo?");
		
	}
	
	@Test
	@DisplayName("Testando o método calcula")
	public void calculaTest(){
		Polinomio p1 = new Polinomio(new Termo(7,3));
		Polinomio p2 = new Polinomio(new Termo(7,3));
		
		p1.calcula(p2);
		assertEquals(true, (p1.quantidadeDeMonomios() == 1) && (p1.getMonomios().get(0).getCoeficiente() == 14), 
				"O resultado deve ser 14 pois o polinomio eh 14*(x)^(3)... Está certo?" );
	}
	
}
