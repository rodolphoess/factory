package factory;

public abstract class PizzaFactory {
	protected Pizza pizza;

	public abstract void criarPizza(String tipo);

	public Pizza delivery() {
		System.out.println("Pizza sendo entregue!");
		
		return pizza;
	}
}
