package abstract_factory;

import factory_method.Pizza;

public class Pizzaria {
	private Pizza pizza;
	
	public void criarPizza(String cidade, String tipo) {
		
		/*
		 * Nesse bloco de código poderia ser feita uma outra factory do tipo PizzariaFactory com o método abstrato criarPizza(String cidade) e getIngredientes(String cidade)
		 * em que cada tipo de concrete factory instanciaria um sabor de pizza diferente. Não seria preciso diferenciar o sabor/tipo de cada concrete factory porque 
		 * seria encaminhado para cada classe o sabor que precisará ser intanciado, precisando somente diferenciar a cidade para ser recuperado em getIngredientes().
		 */
		if (tipo.equals(SaborPizza.QUATROQUEIJOS.toString())) {
			pizza = new PizzaQuatroQueijos(getIngredientes(cidade));
		} else if (tipo.equals(SaborPizza.PORTUGUESA.toString())) {
			pizza = new PizzaPortuguesa(getIngredientes(cidade));
		} else if (tipo.equals(SaborPizza.CALABRESA.toString())) {
			pizza = new PizzaCalabresa(getIngredientes(cidade));
		}
		
		pizza.prepara();
		pizza.assa();
		pizza.empacota();
	}
	
	private PizzaIngredientesFactory getIngredientes(String cidade) {
		if (cidade.equals(CidadeFilial.SAOPAULO.toString())) {
			return new SPPizzaIngredientesFactory();
		}
		
		return new RJPizzaIngredientesFactory();
	}
}
