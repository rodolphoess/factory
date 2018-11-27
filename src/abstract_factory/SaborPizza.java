package abstract_factory;

//Final para bloquear a possibilidade de herança a partir desta classe.
final public class SaborPizza {
	public static final SaborPizza QUATROQUEIJOS = new SaborPizza("queijo");
	public static final SaborPizza PORTUGUESA = new SaborPizza("portuguesa");
	public static final SaborPizza CALABRESA = new SaborPizza("calabresa");
	
	String sabor;
	
	//Private para bloquear a instanciação da classe SaborPizza.
	private SaborPizza(String sabor) {
		this.sabor = sabor;
	}
	
	public String toString() {
		return sabor;
	}
}
