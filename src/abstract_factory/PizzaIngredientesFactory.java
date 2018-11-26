package abstract_factory;

public abstract class PizzaIngredientesFactory {
	
	public abstract Massa criarMassa();
	
	public abstract Queijo criarQueijo();
	
	public abstract Molho criarMolho();
	
	public abstract Salsa criarSalsa();

}
