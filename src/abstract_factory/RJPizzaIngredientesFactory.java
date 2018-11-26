package abstract_factory;

public class RJPizzaIngredientesFactory extends PizzaIngredientesFactory {

	@Override
	public Massa criarMassa() {
		return new MassaFina();
	}

	@Override
	public Queijo criarQueijo() {
		return new QueijoParmesao();
	}

	@Override
	public Molho criarMolho() {
		return new MolhoDaRoca();
	}

	@Override
	public Salsa criarSalsa() {
		return new SalsaNobreApimentada();
	}

}
