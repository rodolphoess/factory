package abstract_factory;

import factory_method.Pizza;

public class Pizzaria {
	private Pizza pizza;
	
	public void criarPizza(String cidade, String tipo) {
		
		if (tipo.equals("queijo")) {
			pizza = new PizzaQuatroQueijos(getIngredientes(cidade));
		} else if (tipo.equals("portuguesa")) {
			pizza = new PizzaPortuguesa(getIngredientes(cidade));
		} else if (tipo.equals("calabresa")) {
			pizza = new PizzaCalabresa(getIngredientes(cidade));
		}
		
		pizza.prepara();
		pizza.assa();
		pizza.empacota();
	}
	
	private PizzaIngredientesFactory getIngredientes(String cidade) {
		if (cidade.equals("sao-paulo")) {
			return new SPPizzaIngredientesFactory();
		}
		
		return new RJPizzaIngredientesFactory();
	}
}
