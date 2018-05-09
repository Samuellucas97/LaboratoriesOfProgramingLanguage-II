package formularioPessoas;

public class Usuario {
	
	public static void main(String[] args) {
		BancoDeDados a = new BancoDeDados();
		a.cadastrar("Lucas", 20);
		a.listar();
		
		InterfaceUsuario b = new InterfaceUsuario();
		
		
		System.out.println("Ok!");
	}

}
