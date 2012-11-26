import java.io.IOException;

import javax.swing.JOptionPane;
public class ProgramaExercicio7 {
	public static void main (String args [] ){
		String nome = "";
		String telefone="";
		Agenda contatos=new Agenda();
		int num = 0;
		
		try {
			contatos.gravadorContato.lerContatos();
		} catch (IOException e1) {
			e1.getMessage();
			e1.printStackTrace();
		}
		
		while(num!=4){
			num= Integer.parseInt(JOptionPane.showInputDialog(" digite 1 gravar o contato\n digite 2 para pesquisar os contatos\n " +
					"digite 3 para remover o contato\n digite 4 para sair"));
			switch(num){
			case 1:
			nome=JOptionPane.showInputDialog("digite o nome");
		    telefone=JOptionPane.showInputDialog("digite o numero do telefone");
		    System.out.println(telefone);
			contatos.adicionarContato(nome,telefone);
			break;
			case 2:
				  nome=JOptionPane.showInputDialog("digite o nome");
			
				try {
				   
					contatos.pesquisaContato(nome);
					JOptionPane.showMessageDialog(null,"o nome:" + nome + "\n telefone:" + telefone);
				} catch (ContatoInexistenteException e) {
					System.err.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			case 3:
				
				try {
					nome=JOptionPane.showInputDialog("digite o nome");
					contatos.removerContato(nome);
					
				} catch (ContatoInexistenteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"FIM DE PROGRAMA");
				System.exit(0);
				break;
				
				
			}
			
		}
	}

}
