package abstract_factory;

//Final para bloquear a possibilidade de herança a partir desta classe.
final public class CidadeFilial {
	public static final CidadeFilial SAOPAULO = new CidadeFilial("sao-paulo");
	public static final CidadeFilial RIODEJANEIRO = new CidadeFilial("riodejaneiro");
	
	private String cidade;
	
	//Private para bloquear a instanciação da classe SaborPizza.
	private CidadeFilial(String cidade) {
		this.cidade = cidade;
	}
	
	public String toString() {
		return cidade;
	}
}
