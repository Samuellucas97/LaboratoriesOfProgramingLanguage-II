/**
 * @file    Celular.java
 * @brief   Contém a classe Celular além de seus métodos 
 * @author  Samuel Lucas de Moura Ferino
 * @since   20.03.2018
 * @version 0.0.1 
 */
 
 /**
  * @class  Celular
  */ 
public class Celular extends ProdutoDuravel{
  
  /// ATRIBUTOS
  /**<  Número do celular */
  private int numero;
  /**<  Há ou não um whatsapp vinculado a esse celular */
  private boolean temWhatsapp;
  
  /// MÉTODOS
  
  /**
   * @brief Construtor padrão
   */ 
  public Celular(){
    super();
    numero = 0;
    temWhatsapp = false;
  }
  
  /**
   * @brief   Construtor parametrizado
   * @param   nome                  Nome do modelo do celular
   * @param   preco                 Preço do celular
   * @param   marca                 Marca do Celular
   * @param   descricao             Descrição do celular
   * @param   dataDeFabricao        Data de fabricação do Celular
   * @param   materialPredominante  Material predominante que compõem o celular
   * @param   durabilidade          Durabilidade do Celular
   * @param   numero                Número do celular
   * @param   temWhatsapp           Há ou não um whatsapp vinculado ao telefone
   */ 
  public Celular( String nome, double preco, String marca, 
    String descricao, String dataDeFabricao, String materialPredominante, 
    String durabilidade, int numero, boolean temWhatsapp){ 
    super(nome, preco, marca, descricao, 
    dataDeFabricao, materialPredominante, durabilidade);
    this.numero = numero;
    this.temWhatsapp = temWhatsapp;
  } 
  
  /**
   * @brief   Método get do atributo numero
   * @return  O número do celular
   */ 
  public int getNumero(){ return numero; }
  
  /**
   * @brief   Método get do atributo temWhatsapp
   * @return  true se tiver whatsapp senão false 
   */ 
   public boolean getTemWhatsapp(){ return temWhatsapp; }
  
  /**
   * @brief   Método set do atributo numero
   * @param   numero  Número do celular
   */ 
  public void setNumero(int numero){ this.numero = numero; }
 
  /**
   * @brief   Método set do atributo temWhatsapp
   * @param   temWhatsapp   Há ou não whatsapp vinculado ao celular
   */ 
   public void setTemWhatsapp(boolean temWhatsapp){
    this.temWhatsapp = temWhatsapp;
  }
}