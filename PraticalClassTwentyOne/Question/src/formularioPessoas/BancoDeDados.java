package formularioPessoas;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 				Contains the BancoDeDados class 
 * @author		Samuel Lucas de Moura Ferino
 * @since		08.05.2018
 * @version		0.0.2
 */
public class BancoDeDados {
	
	/// ATTRIBUTE
	
	private ArrayList<Pessoa> bank;
	
	/// METHODS
	
	public BancoDeDados(){
		bank = new ArrayList<Pessoa>();
	}
	
	public boolean cadastrar(Pessoa p){
		if( p == null) {
			return false;
		}
		
		bank.add(p);
		
		return true;
			
	}
	
	public boolean cadastrar(String nome, int idade) {
	
		if(nome == null)
		{
			nome = new String("Desconhecido");
		}
		
		Pessoa p = new Pessoa(nome, idade);
		
		bank.add(p);
		
		return true;
		
	}
	
	public void listar(){
		
		Iterator<Pessoa> it = bank.iterator();
		
		while(it.hasNext() ){
			System.out.println(it.next().toString() + "\n");
		}
	}
}
