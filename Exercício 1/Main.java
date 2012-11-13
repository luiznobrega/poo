
public class Main {

	public static void main(String[] args) {
		ControleDePedidos c1=new ControleDePedidos();
		Pedido p1= new Pedido(1,"felipe");
		Pedido p2= new Pedido(2,"felipe");
		c1.adicionaPedido(p2);
		c1.adicionaPedido(p1);
		int resul=c1.calculaQuantidadeDePedidoDoCliente("felipe");
		if (resul==2){
			System.out.println("programa correto");
		}else{
			System.out.println("programa incorreto");
		}
		
		

	}

}
