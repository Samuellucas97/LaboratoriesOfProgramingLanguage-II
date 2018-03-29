/**
 * @file    Deposito.java
 * @brief   Contém a classe Deposito além de seus métodos 
 * @author  Samuel Lucas de Moura Ferino
 * @since   22.03.2018
 * @version 0.0.1 
 */

/// IMPORTAÇÕES DE PACOTES (BIBLIOTECAS)

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @class   Deposito
 */
 public class Deposito{
   
   /// ATRIBUTO
   
   /**< Lista de produtos */
   private ArrayList<Produto> listaDeProdutos;
  
  /// MÉTODO
  
  /**
   * @brief   Construtor padrão
   */ 
  public Deposito(){
    listaDeProdutos = new ArrayList<Produto>();
  }
  
  /**
   * @brief   Adiciona um produto à lista de produtos
   */ 
  public void adicionandoProduto(Produto produtoAdicionado ){ 
    listaDeProdutos.add(produtoAdicionado); 
  }
  
  /**
   * @brief   Adiciona um produto à lista de produtos
   * @param   nome      Nome do produto 
   * @param   preco     Preço do produto
   * @param   marca     Marca do produto
   * @param   descricao Descrição do produto
   */ 
  public void adicionandoProduto(String nome, double preco,
    String marca, String descricao, String dataDeFabricacao){
    Produto produtoAdicionado = new Produto(nome, preco, marca, descricao, dataDeFabricacao);
    listaDeProdutos.add(produtoAdicionado);
  }
  
  /**
   * @brief   Remove um produto específico da lista de produtos
   * @param   produtoRemovido      Produto a ser removido 
   */ 
  public void removeProduto(Produto produtoRemovido){
    Iterator<Produto> it = listaDeProdutos.iterator();
    
    while( it.hasNext() ){
      if(  produtoRemovido.getNome().equals( it.next().getNome() ) 
        && it.next().getPreco() == produtoRemovido.getPreco()
        && produtoRemovido.getMarca().equals( it.next().getMarca() )
        && produtoRemovido.getDescricao().equals( it.next().getDescricao() )
        && produtoRemovido.getDataDeFabricacao().equals(it.next().getDataDeFabricacao() ) 
        ){ 
          listaDeProdutos.remove(it.next()); 
        }
    }
  }
  
  /**
   * @brief   Retorna a quantidade de produtos compõem a lista de produtos
   * @return  Quantidade de elementos que compõem a lista de produtos
   */
  public int quantidadeDeProdutos(){ 
    return listaDeProdutos.size(); 
  }
  
  /**
   * @brief   Verifica se na lista de produtos não há elementos
   * @return  true se não houver nenhum elemento e false se houver pelo menos um
   */ 
  public boolean naoHaProdutos(){ 
    return listaDeProdutos.isEmpty();  
  }
  
  /**
   *  @brief  Busca e retorna o produto de maior preço na lista de produtos
   * @return  Produto mais caro
   */
  public Produto produtoComMaiorValor(){
    /**<  Produto mais caro */
    Produto produtoMaisCaro = new Produto();
    /** Iterador para a lista de produtos */
    Iterator<Produto> it = listaDeProdutos.iterator();
    
    if(naoHaProdutos()){
      return null;
    }
    
    while( it.hasNext() ){
      if(  produtoMaisCaro.getPreco() < it.next().getPreco() ){ 
          produtoMaisCaro = it.next();
      }
    }
    
    return produtoMaisCaro;
  }
   
}
 
 
 