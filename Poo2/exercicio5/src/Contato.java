import java.io.Serializable;


public class Contato implements Serializable {
	private String nome;
	private String tel;
	
	public Contato(String nome, String tel) {
		this.nome=nome;
		this.tel=tel;
	}

	public Contato() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	


	

}
