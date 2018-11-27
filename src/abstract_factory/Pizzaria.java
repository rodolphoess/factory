package abstract_factory;

import factory_method.Pizza;

public class Pizzaria {
	private Pizza pizza;
	
	public void criarPizza(String cidade, String tipo) {
		
		/*
		 * Nesse bloco de c�digo poderia ser feita uma outra factory do tipo PizzariaFactory com o m�todo abstrato criarPizza(String cidade) e getIngredientes(String cidade)
		 * em que cada tipo de concrete factory instanciaria um sabor de pizza diferente. N�o ser� preciso diferenciar o sabor de cada concrete factory porque 
		 * ser� encaminhado para cada classe o sabor que precisar� ser intanciado, precisando somente diferenciar a cidade para ser recuperado em getIngredientes().
		 */
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
