import java.util.ArrayList;
import java.util.List;


public class ControleDePedidos implements InterfaceSistemaDeControle{
	private List<Pedido> pedido;
	private List<Pedido>auxiliar;
	
	public ControleDePedidos(){
		this.pedido=new ArrayList<Pedido>();
		this.auxiliar=new ArrayList<Pedido>();
	}

	public void adicionaPedido(Pedido p) {
		pedido.add(p);
		
	}

	public List<Pedido> pesquisaPedidoIncluindoProduto(long codProduto) {
		for(Pedido p:pedido){
			for(ItemDePedido i:p.getItem()){
				if(codProduto==i.getCodProduto());
				auxiliar.add(p);
				
			}
		}
		return null;
	}

	public void removePedido(long numPedido) {
		for(Pedido p:pedido){
			if(numPedido==p.getNumeroDoPedido()){
				pedido.remove(p);
			}
		}
		
	}
    public int calculaQuantidadeDePedidoDoCliente(String nome){
    	int total=0;
    	for(Pedido p:pedido){
    		if(nome.equals(p.getCliente().getNome())){
    		total++;
    	}
    	
    }
		return total;
		
	}
	

}
