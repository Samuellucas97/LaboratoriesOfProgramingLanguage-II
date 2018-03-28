/**
 * @file      Banco.java
 * @brief     Contém a classe Banco e a implementação de seus métodos
 * @author    Samuel Lucas de Moura Ferino
 * @since     27.03.2018
 * @version   0.0.1
 */ 

/// PACOTES (BIBLIOTECAS) USADOS
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @class   Banco
 */ 
public class Banco{
  
  /// ATRIBUTOS
  
  /**<  Contas cadastradas no banco */
  private ArrayList<ContaBancaria> contas;
  
  /// MÉTODOS
  
  /**
   * @brief   Construtor padrão
   */ 
  public Banco(){
    contas = new ArrayList<ContaBancaria>();
  }
  
  /**
   * @brief   Adiciona a conta a lista de contas cadastradas
   * @param   c   Conta bancária
   * @return  True se foi adicionado a conta senão, false
   */ 
  public boolean add( ContaBancaria c){
    if( c == null){
      return false;
    }
    
    /// CASO JÁ EXISTA ALGUMA CONTA COM ESSE NÚMERO, NÃO ADICIONA    
    if(pesquisaNaListaDeContas(c.getNumeroDaConta() ) )
    {
      return false;
    }
    
    contas.add(c);
    
    return true;
  }
  
  /**
   * @brief   Adiciona a conta a lista de contas cadastradas
   * @param   c   Conta especial
   * @return  True se foi adicionado a conta senão, false
   */ 
  public boolean add( ContaEspecial c){
    ContaBancaria d = c;
    
    if( d == null){
      return false;
    }
    
    /// CASO JÁ EXISTA ALGUMA CONTA COM ESSE NÚMERO, NÃO ADICIONA    
    if(pesquisaNaListaDeContas(d.getNumeroDaConta() ) )
    {
      return false;
    }
    
    contas.add(d);
    
    return true;
  }
  
  /**
   * @brief   Adiciona a conta a lista de contas cadastradas
   * @param   c   Conta bancária
   * @return  True se foi adicionado a conta senão, false
   */ 
  public boolean add( ContaPoupanca c){
    ContaBancaria d = c;
    
    if( d == null){
      return false;
    }
    
    /// CASO JÁ EXISTA ALGUMA CONTA COM ESSE NÚMERO, NÃO ADICIONA    
    if(pesquisaNaListaDeContas(c.getNumeroDaConta() ) )
    {
      return false;
    }
    
    contas.add(d);
    
    return true;
  }
  
  /**
   * @brief   Remove a conta com o respectivo número da lista de contas cadastradas
   * @param   numeroDaConta   Número da conta
   * @return  True se foi removida a conta senão, false
   */ 
  public boolean remove(int numeroDaConta){
  
    /// CASO NÃO EXISTA NENHUMA CONTA COM ESSE NÚMERO, NÃO REMOVE 
    if(!pesquisaNaListaDeContas(numeroDaConta) )
    {
      return false;
    }
                     
    for(int i = 0;i < contas.size() ;++i){
      if(contas.get(i).getNumeroDaConta() == numeroDaConta){
        contas.remove(i);
        break;
      }
    }               
    
    return true;                   
  }
  
  /**
   * @brief   Imprime os dados(atributos) das contas cadastradas
   */ 
  public void imprime(){
    Iterator<ContaBancaria> itContas = contas.iterator();
    
    System.out.println("\nCONTAS CADASTRADAS NO BANCO:\n");
    
    while(itContas.hasNext()){
      System.out.println(itContas.next().toString() + "\n\n");
    }
  }
  
  /**
   * @brief   Pesquisa se já existe alguma conta cadastra com o número entrado
   * @param   numeroDaConta   Número da conta
   * @return  True se foi achada alguma conta senão, false
   */ 
  private boolean pesquisaNaListaDeContas(int numeroDaConta)
  {
    Iterator<ContaBancaria> itContas = contas.iterator();
      
    while(itContas.hasNext()){
      if( itContas.next().getNumeroDaConta() == numeroDaConta){
        return true;
      }
    }
      
    return false;
  }
  
}
