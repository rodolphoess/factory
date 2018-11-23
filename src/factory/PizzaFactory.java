package factory;

public class PizzaFactory {
	
	private PizzaFactory() {}
	
	public static Pizza criarPizza(String tipo) {
		Pizza pizza = null;
		
		if (tipo.equals("queijo")) 
			pizza = new PizzaQuatroQueijos();
		 else if (tipo.equals("portuguesa")) 
			pizza = new PizzaPortuguesa();
		 else if (tipo.equals("calabresa")) 
			pizza = new PizzaCalabresa();
		 else if (tipo.equals("camarao")) 
			pizza = new PizzaCamarao();
		
		
		return pizza;
	}

}
