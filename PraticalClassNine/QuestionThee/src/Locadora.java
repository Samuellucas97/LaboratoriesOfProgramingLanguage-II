/**
 * @file      Locadora.java
 * @brief     Contém a classe Locadora e a implementação de seus métodos   
 * @author    Samuel Lucas de Moura Ferino
 * @since     22.03.2018
 * @version   0.0.1
 */ 
 
 /// IMPORTAÇÕES DE PACOTES(BIBLIOTECAS)
 
 import java.util.ArrayList;
 import java.util.Iterator;
 
 /**
 * @class   Locadora
 */ 
 public class Locadora{
   
   /// ATRIBUTOS
   
   private ArrayList<Carro> listaDeCarros;
   private ArrayList<Moto>  listaDeMotos;
   
   /// MÉTODOS
  
  /**
   * @brief   Construtor padrão
   */ 
  public Locadora(){
      listaDeCarros = new  ArrayList<Carro>();
      listaDeMotos = new ArrayList<Moto>();
  }
     
   public void cadastrarCarroOuMoto(String marca, String modelo, String numeroDaPlaca, int potenciaDoMotor, int quantidadeDePortas){
      listaDeCarros.add( new Carro(marca, modelo, numeroDaPlaca, potenciaDoMotor, quantidadeDePortas) );
   }

   public void cadastrarCarroOuMoto(Carro car){
      listaDeCarros.add(car);
   }

   public void cadastrarCarroOuMoto(String marca, String modelo, String numeroDaPlaca, String tipoDaPartida, double cilindradas){
      listaDeMotos.add( new Moto(marca, modelo, numeroDaPlaca,,String tipoDaPartida, double cilindradas) ); 
   }

   public void cadastrarCarroOuMoto(Moto motorcycle){
      listaDeMotos.add(motorcycle); 
   }

   public void alugarVeiculo(){}

   public void exibirVeiculosCadastrados(){
      /**<  Iterador da lista de carros */
      Iterator<Carro> itCar = listaDeCarros.iterator();
      /**<  Iterador da lista de motos */
      Iterator<Moto>  itMotocycle = listaDeMotos.iterator();


      System.out.println("\n\n\n\n********************  LISTA DE CARROS  *********************\n\n\n");

      while(itCar.hasNext()){
          System.out.println("\n\n\nMarca: "            + itCar.next().getMarca() + "\n"
                              "Modelo: "                + itCar.next().getModelo() + "\n"
                              "Numero da placa: "       + itCar.next().getNumeroDaPlaca() + "\n"
                              "Potencia do motor: "     + itCar.next().getPotenciaDoMotor() + "\n"
                              "Quantidade de portas: "  + itCar.next().getQuantidadeDePortas());
      }

      System.out.println("\n\n\n\n********************  LISTA DE MOTOS  *********************\n\n\n");

      for(; itMotocycle.hasNext();){
        System.out.println("\n\n\nMarca: "              + itMotocycle.next().getMarca() + "\n"
                                "Modelo: "              + itMotocycle.next().getModelo() + "\n"
                                "Numero da placa: "     + itMotocycle.next().getNumeroDaPlaca() + "\n"
                                "Tipo da partida: "     + itMotocycle.next().getTipoDaPartida() + "\n"
                                "Cilindradas: "         + itMotocycle.next().getCilindradas());

      }

   }
 }
