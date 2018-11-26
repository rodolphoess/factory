package factory;

public class PizzaFactorySaoPaulo extends PizzaFactory {

	@Override
	public void criarPizza(String tipo) {
		
		if (tipo.equals("queijo")) {
			pizza = new SPPizzaQuatroQueijos();
			System.out.println("Pizza de quatro queijos da Pizzaria São Paulo criada!");
		} else if (tipo.equals("portuguesa")) {
			pizza = new SPPizzaPortuguesa();
			System.out.println("Pizza portuguesa da Pizzaria São Paulo criada!");
		} else if (tipo.equals("calabresa")) {
			pizza = new SPPizzaCalabresa();
			System.out.println("Pizza de calabresa da Pizzaria São Paulo criada!");
		}
	}
	
}
