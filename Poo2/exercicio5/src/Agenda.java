import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Agenda implements AgendaIf {
	private List<Contato> contatos;
	GravadorAgenda gravadorContato=new GravadorAgenda();

	public Agenda() {
		try {
			this.contatos=gravadorContato.lerContatos();
		} catch (IOException e) {
			e.getLocalizedMessage();
			e.printStackTrace();
		}
		this.contatos = new ArrayList<Contato>();
		

	}

	public void adicionarContato(String nome, String tel) {
		contatos.add(new Contato(nome, tel));
		try{
			gravadorContato.GravaContatos(contatos);
		}catch(IOException e){
			e.getMessage();
		}

	}

  	public void removerContato(String nome) throws ContatoInexistenteException {
		for (Contato c : contatos) {
			if (c.getNome().equals(nome)) {
				contatos.remove(c);
			}
		}

	}

	public Contato pesquisaContato(String nome) throws ContatoInexistenteException {

		for (Contato c : contatos) {
			if (!(c.getNome().equals(nome))) {
				throw new ContatoInexistenteException("Contato não Existe");
				
			}
			return c;
			
			}
		return null;
		
		}

	
	}


