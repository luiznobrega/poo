import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class GravadorAgenda {
	List<Contato> arquivaContatos;
	public GravadorAgenda(){
		this.arquivaContatos=new ArrayList<Contato>();
	}
	
	public List<Contato> lerContatos()throws IOException {
		FileInputStream in=new FileInputStream("contatos.txt");//criar um arquivo para os contatos  
		ObjectInputStream cos=new ObjectInputStream (in);//objeto que manipula o arquivo de leitura
		try {
			arquivaContatos = (List<Contato>) cos.readObject();//fazendo a leitura do arquivo.
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new IOException(e.getMessage());
		}
		cos.close();//fechando o fluxo.
		return arquivaContatos;//retorna a Lista de contatos.
		
      }
	
	public void  GravaContatos (List<Contato> contatos)throws IOException{
		FileOutputStream fos=new FileOutputStream("contatos.txt");//criar o arquivo.
		ObjectOutputStream cos=new ObjectOutputStream(fos);//objeto que manipula o arquivo.de escrita.
		cos.writeObject(arquivaContatos);//escrever o objeto no arquivo;
		cos.close(); // fechando o fluxo
	}
	

}
