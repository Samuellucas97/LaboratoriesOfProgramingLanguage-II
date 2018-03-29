/**
 * @file      Main.java
 * @brief     Contém a classe Main    
 * @author    Samuel Lucas de Moura Ferino
 * @since     22.03.2018
 * @version   0.0.1
 */ 
 
 /**
 * @class   Main
 */ 
class Main {
  public static void main(String[] args) {
    
    ProfessorHorista prof1 = new ProfessorHorista("Lucas", "201618", 29, "12", 160);
     System.out.println(
      "Nome: " + prof1.getNome() + "\n" +
      "Matricula: " + prof1.getMatricula() + "\n" +
      "Idade: " + prof1.getIdade() + "\n" +
      "Salario por hora: " + prof1.getSalarioHora() + "\n" +
      "Total de horas trabalhadas: " + prof1.getTotalHoras() + "\n" +
      "Salario: "+ prof1.salario() + "\n\n\n");
 
  
    ProfessorRegime prof2 = new ProfessorRegime("Felipe", "201618", 29, 8000);
      System.out.println(
      "Nome: " + prof2.getNome() + "\n" +
      "Matricula: " + prof2.getMatricula() + "\n" +
      "Idade: " + prof2.getIdade() + "\n" +
      "Salario: "+ prof2.getSalario() );
  }
}
