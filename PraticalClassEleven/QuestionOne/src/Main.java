/**
 * @file      Main.java
 * @brief     Contém a classe principal e alguns teste com as classes Cliente, 
 *            PessoaFisica e PessoaJuridica
 * @author    Samuel Lucas de Moura Ferino
 * @since     27.03.2018
 * @version   0.0.1 
 */ 

/**
 * @class   Main
 */ 
class Main {
  public static void main(String[] args) {
    
    /// TESTES
    System.out.println("\nInicio dos testes...\n\n");
    
    
    Cliente a = new Cliente("Samuel", "Rota do sol", "9 9999-9999");
    
    System.out.println("\nCliente: ");
    a.imprimirDados();
    
    PessoaFisica b = new PessoaFisica("Daniel", "Capim Macio", "9 9999-9999","777777");
    
    System.out.println("\nPessoa Fisica: ");
    b.imprimirDados();
    
    PessoaJuridica loja  = new PessoaJuridica("Clube de tiro", "Rota do sol", "9 9999-9999","700","Halo");
    
    System.out.println("\nPessoa Juridica: ");
    loja.imprimirDados();
    
    /// --------------
    
    
    System.out.println("\n\n\nFim dos testes... ");
  }
}
