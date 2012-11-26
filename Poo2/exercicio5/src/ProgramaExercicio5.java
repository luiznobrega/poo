
public class ProgramaExercicio5 {
	public static void main (String args[]){
		
		Agenda ag1=new Agenda();
		
		
		try{
		ag1.adicionarContato("felipe","8887");
		ag1.pesquisaContato("felipe");
		
		}
		
		catch(ContatoInexistenteException err){
			System.out.println("contato não cadastrado felipeee ");
			ag1.adicionarContato("felipe", "778");
		}
		try{
		ag1.pesquisaContato("luiz");
		}
		catch(ContatoInexistenteException err){
			System.out.println("contato não cadastrado luiz");
		}
	
	}
	

}
