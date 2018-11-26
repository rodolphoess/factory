package abstract_factory;

import factory_method.Pizza;

public class Pizzaria {
	private Pizza pizza;
	
	public void criarPizza(String cidade, String tipo) {
		
		if (tipo.equals("queijo")) {
			pizza = new PizzaQuatroQueijos(cidade);
		} else if (tipo.equals("portuguesa")) {
			pizza = new PizzaPortuguesa(cidade);
		} else if (tipo.equals("calabresa")) {
			pizza = new PizzaCalabresa(cidade);
		}
	}
}
