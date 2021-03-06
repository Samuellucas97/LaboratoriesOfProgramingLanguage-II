
// -> PACOTES IMPORTADOS

import java.util.Stack;
import java.util.Scanner;

/**
 * Implementação das operações da interface Calculavel
 * @see       Calculavel
 * @author    Samuel Lucas de Moura Ferino
 * @since     24.04.2018
 * @version   0.0.3
 */ 
public class Calculadora implements Calculavel{
 
  // -> ATRIBUTOS
  
  Stack<Double> historico;  // ->  Pilha que contém o histórico 
 
  // -> MÉTODOS
  
  /**
   * Construtor padrão
   */ 
  public Calculadora(){
    historico = new Stack<Double>();
  } 
  
  /**
   * Liga a calculadora e espera os operandos e o operador  
   */ 
  public void operacao(){

    System.out.print("Informe o primeiro valor:");
    Scanner ler = new Scanner(System.in);
    historico.push(ler.nextDouble() );    // -> PRIMEIRO OPERANDO 
    System.out.print("\nInforme o segundo valor:");
    historico.push(ler.nextDouble() );    // -> SEGUNDO OPERANDO
    
    double operador = -1;
    System.out.print("\nInforme o caractere que simboliza a operacao:");
    
    switch( ler.next() ){
      case "+": operador = 0;
        break;
      case "-": operador = 1;
        break;
      case "*": operador = 2;
        break;
      case "/": operador = 3;
        break;
    }
    
    historico.push(operador);       // -> OPERACAO
    
    double operacao = historico.pop();
    double b = historico.pop();
    double a = historico.pop();
      
    double resultado;  
      
    if( operacao == 0){      // -> SOMA
      resultado = soma(a,b);
    }
    else if( operacao == 1){  // -> SUBTRAÇÃO
      resultado = subtracao(a,b);
    }
    else if( operacao == 2){  // -> MULTIPLICAÇÃO
      resultado = multiplicacao(a,b);
    }
    else{                     // -> DIVISÃO
      resultado = divisao(a,b);
    }
    
    historico.push(resultado);
  }
  
  /**
   * Soma o valor de "a" com o valor de "b"
   * @param   a   Primeiro operando 
   * @param   b   Segundo operando
   * @return  +(a,b)
   */ 
  public double soma(double a, double b){ 
      return a+b;
  }
  
  /**
   * Subtrai o valor de "a" pelo valor de "b"
   * @param   a   Primeiro operando 
   * @param   b   Segundo operando
   * @return  -(a,b)
   */ 
  public double subtracao(double a, double b){ 
    return a-b; 
  }
  
  /**
   * Multiplica o valor de "a" pelo valor de "b"
   * @param   a   Primeiro operando 
   * @param   b   Segundo operando
   * @return  *(a,b)
   */ 
  public double multiplicacao(double a, double b){ 
    return a*b; 
  }
  
  /**
   * Dividi o valor de "a" pelo valor de "b"
   * @param   a   Primeiro operando 
   * @param   b   Segundo operando
   * @return  /(a,b)
   */ 
  public double divisao(double a, double b){  
    
    try{ 
   
       if(b == 0){     // -> DIVISÃO INVÁLIDA: Divisão por zero
         throw new ArithmeticException("Divisao por zero eh invalida...");
       }   
       return a/b;
    }
    catch( ArithmeticException e){
       System.err.println( e.getMessage() );
       return 0;  
    }
   
  }
  
  /**
   * Imprime o historico de resultado 
  */
  public void imprimirHistorico(){
    
    System.out.println("\n\nHISTORICO:");
    
    // -> ENQUANTO A PILHA NÃO ESTÁ VAZIA, IMPRIME
    while( !historico.empty() ){
      System.out.println( historico.pop() );
    }
    
  }
  
}
