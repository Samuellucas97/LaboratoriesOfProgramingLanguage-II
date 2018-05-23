/**
 *
 */

package manipulacoesEmArquivos;

//// IMPORTA��ES DE PACOTES

/// (MANIPULA��O DE ARQUIVO)
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;

/// CLASSE DE EXCE��O (MANIPULA��O DE ARQUIVO)
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Cont�m os m�todos de leitura e escrita de arquivo
 * @author  Samuel Lucas de Moura Ferino
 * @since   21.05.2018   
 * @version 0.0.6
 */
public class ManipulacaoDeArquivo{
    
	/**
	 * Construtor da classe
	 */
	public ManipulacaoDeArquivo() { /** Vazio */}
	
    /**
     * L� o arquivo entrado com o nome  
     * @param   nomeDoArquivo   Nome do arquivo a ser lido
     * @return  String com o conteudo do arquivo se a leitura for feita corretamente, sen�o string nula
     */
    public static String lerArquivo( String nomeDoArquivo ){

        String conteudo = new String("");
        
        try{

            BufferedReader buffReader = new BufferedReader(new FileReader( nomeDoArquivo ));
            String linha = new String();

            while( buffReader.ready() ){              /// LENDO CADA LINHA  
                linha = buffReader.readLine();
                conteudo += linha + "\n";
            }
            
            buffReader.close();
            return conteudo;

        }
        catch(FileNotFoundException e){  /// ARQUIVO N�O EXISTE

            System.err.println( e.getMessage() );   
            return "";
        }  
        catch(IOException e){  /// OCORREU OUTRO ERRO, SENDO ESSE DESCONHECIDO

            System.err.println( e.getMessage() );
            return "";
        
        }

    }
    
    /**
     * L� o arquivo entrado com o nome  
     * @param   nomeDoArquivo   Nome do arquivo a ser lido
     * @param   conteudo        Conte�do 
     * @return  True se a leitura for feita corretamente, sen�o false
     */
    public static boolean salvarArquivo(String nomeDoArquivo, String conteudo){
        
        try{

          FileWriter writer = new FileWriter(nomeDoArquivo);     

          writer.write(conteudo);

          writer.close();  

          return true;

        }
        catch(FileNotFoundException e){   /// ARQUIVO N�O EXISTE
            System.err.println( e.getMessage() );
            return false;        
        }
        catch(IOException e){  /// OCORREU OUTRO ERRO, SENDO ESSE DESCONHECIDO
            System.err.println( e.getMessage() );
            return false;
        }
    }


}