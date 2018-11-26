package abstract_factory;

import factory_method.Pizza;

public class PizzaQuatroQueijos extends Pizza {
	PizzaIngredientesFactory ingredientes;
	private Massa massa;
	private Queijo queijo;
	private Molho molho;
	private Salsa salsa;

	public PizzaQuatroQueijos(PizzaIngredientesFactory ingredientes) {
		this.ingredientes = ingredientes;
	}

	@Override
	public void prepara() {
		massa = ingredientes.criarMassa();
		queijo = ingredientes.criarQueijo();
		molho = ingredientes.criarMolho();
		salsa = ingredientes.criarSalsa();
	}

	@Override
	public void assa() {
		
	}

	@Override
	public void empacota() {
		// TODO Auto-generated method stub
		
	}

}
