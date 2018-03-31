/**
 * @file      RecorrenciaDePalavras.java
 * @brief     Contém a classe RecorrenciaDePalavras
 * @author    Samuel Lucas de Moura Ferino
 * @since     15.03.2018
 * @version   0.0.7
 */ 

/// PACOTES(BIBLIOTECA) USADO
import java.util.HashSet;
import java.util.ArrayList;

/**
 * @class   RecorrenciaDePalavras
 */ 
public class RecorrenciaDePalavras{

  /**
   * @brief   Trata a string retirando espaço de início ou fim e caracteres especiais 
   *          além de transformar todos caracteres em letras minúculas 
   * @param   frase   Frase a ser tratada
   * @return  Frase já tratada
   */ 
  private static String tratandoString(String frase){
    /// TRANSFORMANDO TODA AS PALAVRAS EM PALAVRAS MINÚSCULAS E 
    /// RETIRANDO ESPAÇO NO INÍCIO E NO FIM
    frase = frase.trim().toLowerCase();
    

    /// RETIRANDO CARACTERES ESPECIAIS
    frase = frase.replaceAll("!", "");
    frase = frase.replaceAll("\\?", "");
    frase = frase.replaceAll("%", "");
    frase = frase.replaceAll("&", "");
    frase = frase.replaceAll("$", "");
    frase = frase.replaceAll("#", "");
    frase = frase.replaceAll("\\*", "");
    frase = frase.replaceAll("\\(", "");
    frase = frase.replaceAll("\\)", "");
    frase = frase.replaceAll("\\+", "");
    frase = frase.replaceAll("\\-", "");
    frase = frase.replaceAll("/", "");
    frase = frase.replaceAll("^", "");
    frase = frase.replaceAll("|", "");
    
    return frase;
  }
  
  /**
   * @brief   Imprime na tela cada palavra contida na string juntamente com a 
   *          quantidade de recorência em que aparece
   * @param   frase   Frase a ser tratada
   */ 
  public static void printTableOfWords(String frase){
    /// TRATANDO A STRING 
    frase = tratandoString(frase);
    
    /// SEPARANDO A FRASE EM PALAVRAS USANDO OS ESPAÇOS COMO REFERÊNCIA 
    String palavrasRepetidas[] = frase.split(" ");
    
    HashSet<String> palavrasNaoRepetidas = new HashSet<String>();
    ArrayList<String> palavrasNaoRepetidasArray = new ArrayList<String>();
    
    /**   ******************     ******************     ******************  */
    
    /**                           1ª FASE:                                  */
    
    /** @BRIEF  Seram descobertas e salvas as palavras que estão contidas na string  
     *          as quais serão salvas em um ArraList com a ajuda de um 
     *          HashSet para evitar que sejam adicionadas palavras repetidas 
    */
    
    
    /// INICIALIZANDO O O ARRAY DE PALAVRAS CONTIDAS NA FRASE USANDO UM SET
    for(String i: palavrasRepetidas){
      /// CASO JÁ NÃO TENHA SIDO ADD NO SET, ADD NO ARRAY
      if( palavrasNaoRepetidas.add(i) ){
        palavrasNaoRepetidasArray.add(i);
      }
      
    }
    
    
    /**   ******************     ******************     ******************  */
    
    /**                           2ª FASE:                                  */
    
    /** @BRIEF    O vetor de String que contém a frase(String) as palavras repetidas
     *            será percorrida sendo utilizado como índice o ArraList de palavras
     *            não repetida. Tendo em vista isso, para cada termino de iteração será
     *            imprimido a quantidade de recorrência da palavra usada como índice.
    */
    
    /**<  Quantidade de recorrência da palavra */
    int quantidadeDeRecorrencias = 0;
  
    for(String i: palavrasNaoRepetidasArray){
      for(String j : palavrasRepetidas ){
        if( i.equals(j) ){
          ++quantidadeDeRecorrencias;
        }
      }
      System.out.println(i + " : " + quantidadeDeRecorrencias);
      quantidadeDeRecorrencias = 0;
    }
      
  }
  
}