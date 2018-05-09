package formularioPessoas;

/// PACOTES IMPORTADOS (**SWING**)
import javax.swing.JFrame;		/// JANELA
import javax.swing.JLabel;	
import javax.swing.JButton;		/// BOTÃO
import javax.swing.JMenuBar;	/// BARRA DE MENUS (CONJUNTO DE MENUS)
import javax.swing.JMenu;		/// MENU (CONJUNTO DE ITENS DE MENU)
import javax.swing.JMenuItem;	/// ITEM DE MENU
import javax.swing.JPanel;
import javax.swing.JTextField;

/// PACOTES IMPORTADOR (**AWT**)
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class InterfaceUsuario{
	
	/// ATRIBUTO(S)
	
	private JFrame quadro;
//	private BancoDeDados bk;
	
	/// MÉTODOS PÚBLICOS
	
	/**
	 * Construtor da classe 
	 */
	public InterfaceUsuario(){
		
	//	bk = new BancoDeDados();
		
		makeFrame();
		
	}
	/// MÉTODOS PRIVADOS
	
	/**
	 * Cria a janela
	 */
	private void makeFrame() {
		
		quadro = new JFrame("Formulario de cadastro");
		
		makeMenuBar();
		
		JPanel painelGeral = (JPanel) quadro.getContentPane();
		painelGeral.setLayout( new BorderLayout(10,0) );
		
		makePanel(painelGeral);		
				
		//quadro.setSize(1000,700);	/// TAMANHO DA JANELA **FIXO**	
		quadro.pack(); 				/// TAMANHO DA JANELA AJUSTADA À TELA
		quadro.setVisible(true);	

	}
	
	private void makePanel( JPanel painelGeral ){

		JPanel painel2 = new JPanel();
		painel2.setLayout(new FlowLayout(FlowLayout.LEFT, 110,0) );
		
		JLabel rotuloNome = new JLabel("Nome");
		painel2.add(rotuloNome);
		JLabel rotuloIdade = new JLabel("Idade");
		painel2.add(rotuloIdade);
		
		
		JPanel painel3 = new JPanel();
		painel3.setLayout(new FlowLayout(FlowLayout.LEFT, 10,10) );
		
		JTextField caixaIdade = new JTextField(20);
		painel3.add(caixaIdade );
		JTextField caixaNome = new JTextField(6);
		painel3.add(caixaNome );
		JButton botaoCadastrar = new JButton("Cadastrar");		
		painel3.add(botaoCadastrar);
		
		JPanel painel4 = new JPanel();
		JLabel version = new JLabel("0.0.3");
		painel4.add(version);
		
		JPanel painel5 = new JPanel();
		painel5.setLayout(new FlowLayout(FlowLayout.CENTER, 20,20) );
		
		JButton botaoListagem = new JButton("Listagem");
		painel5.add(botaoListagem, FlowLayout.LEFT);
		
		
		painelGeral.add(painel5, BorderLayout.EAST);
		painelGeral.add(painel2, BorderLayout.NORTH);
		painelGeral.add(painel3, BorderLayout.WEST);
		painelGeral.add(painel4, BorderLayout.SOUTH);

	}
	
	/**
	 * Realiza a construção das opções do menu
	 */
	private void makeMenuBar(){
		
		JMenuBar barraDeMenu = new JMenuBar();
		quadro.setJMenuBar(barraDeMenu);
		
		/// **SUBMENU** AJUDA
		JMenu helpConjuntoMenu = new JMenu("Ajuda");
		
		/// **ITEM DE MENU** Sobre
		JMenuItem sobreFormularioDeCadastroMenu = new JMenuItem("Sobre o Formulario de Cadastro");
		sobreFormularioDeCadastroMenu.addActionListener(new SobreActionListener() );

		helpConjuntoMenu.add(sobreFormularioDeCadastroMenu);
		
		barraDeMenu.add(helpConjuntoMenu);
		
		/// **ITEM DE MENU** SAIR
		JMenuItem saidaMenu = new JMenuItem("Sair");
		
		saidaMenu.addActionListener( new ActionListener() {	
				public void actionPerformed(ActionEvent event) {
					System.exit(0);
				}
			});
		
		barraDeMenu.add(saidaMenu);
		
	}

	/// CLASSE(S) INTERNA(S) 
	
	public class SobreActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			
		}
	}
		
	
}	
	
