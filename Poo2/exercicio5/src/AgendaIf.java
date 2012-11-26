
public interface AgendaIf {
	public void adicionarContato(String nome,String tel);
	
	public void removerContato(String nome)throws ContatoInexistenteException;
	
	public Contato pesquisaContato(String nome)throws ContatoInexistenteException;

}
