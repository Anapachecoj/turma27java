package animal;

public class cavalo extends animal {

	private boolean deveCorrer;

	public cavalo(String nome, int idade, boolean emiteSom, boolean deveCorrer) {
		super(nome, idade, emiteSom);
		this.deveCorrer = deveCorrer;
	}

	public boolean isDeveCorrer() {
		return deveCorrer;
	}

	public void setDeveCorrer(boolean deveCorrer) {
		this.deveCorrer = deveCorrer;
	} 
	
}
