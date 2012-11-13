import java.util.ArrayList;
import java.util.List;


public class Pedido {
	private long numeroDoPedido;
	private Cliente cliente;
	private List<ItemDePedido> itens;
	
	public Pedido(long numeroDoPedido){
		itens=new ArrayList<ItemDePedido>();
		this.numeroDoPedido=numeroDoPedido;
		}
	public Pedido(long numeroDoPedido,String nome){
		this.numeroDoPedido=numeroDoPedido;
		this.cliente=new Cliente(nome);
	}
	public List<ItemDePedido> getItem(){
		return this.itens;
	}

	public long getNumeroDoPedido() {
		return numeroDoPedido;
	}

	public void setNumeroDoPedido(long numeroDoPedido) {
		this.numeroDoPedido = numeroDoPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemDePedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemDePedido> itens) {
		this.itens = itens;
	}
	public void adicionaItem(ItemDePedido item){
		itens.add(item);
	}
}
