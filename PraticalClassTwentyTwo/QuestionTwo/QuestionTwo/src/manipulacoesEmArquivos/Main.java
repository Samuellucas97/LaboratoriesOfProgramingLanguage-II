/**
 * 
 */

package manipulacoesEmArquivos;

/**
 * Realiza teste com a classe ManipulaArquivo
 * @author  Samuel Lucas de Moura Ferino 
 * @since   21.02.2018
 * @version 0.0.3
 */ 
public class Main {

	/**
	 * Construtor da classe
	 */
	public Main() { /** Vazio */}
	
	/**
	 * @param args	Argumento via linha de comando
	 */
	public static void main(String[] args) {

	    /// LENDO ARQUIVO
	    String nomeDoArquivo = new String("teste.txt");
	    String conteudoDoArquivo = ManipulacaoDeArquivo.lerArquivo(nomeDoArquivo);
	    System.out.println(conteudoDoArquivo);

	    /// ESCREVENDO ARQUIVO
	    String a = new String("+-10^^");
	    ManipulacaoDeArquivo.salvarArquivo("e.txt", a);
	  
	}

}
