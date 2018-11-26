package factory;

public class PizzaFactoryRioDeJaneiro extends PizzaFactory {

	@Override
	public void criarPizza(String tipo) {
		
		if (tipo.equals("queijo")) {
			pizza = new RJPizzaQuatroQueijos();
			System.out.println("Pizza de quatro queijos da Pizzaria Rio de Janeiro criada!");
		} else if (tipo.equals("portuguesa")) {
			System.out.println("Pizza portuguesa da Pizzaria Rio de Janeiro criada!");
			pizza = new RJPizzaPortuguesa();
		} else if (tipo.equals("calabresa")) {
			pizza = new RJPizzaCalabresa();
			System.out.println("Pizza de calabresa da Pizzaria Rio de Janeiro criada!");
		}
		
	}
	
}
