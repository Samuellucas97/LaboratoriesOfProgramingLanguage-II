/**
 * 
 */
package tratamentoDeExcessao;

/**
 * Realiza testes nos métodos da classe Pessoa
 * @author 		Samuel Lucas de Moura Ferino
 * @since 		12.05.2018
 * @version 	0.0.2
 */
public class Main {

	/**
	 * @param args	Entrado via linha de comando
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa();
		System.out.println( p.toString() + "\n");
		
		Pessoa pNovo1 = new Pessoa("Lucas", 18, 'S', 8);
		System.out.println( pNovo1.toString() );
		
		Pessoa pNovo2 = new Pessoa("Luc4s", 18, 'S', 8);
		System.out.println( pNovo2.toString() );
		
		Pessoa pNovo3 = new Pessoa("Luca", 18, 'S', 8);
		System.out.println( pNovo3.toString() );
		
		
	}

}
