package animal;

public class pregui�a extends animal {
 
	private boolean subirArvore;

	public boolean isSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(boolean subirArvore) {
		this.subirArvore = subirArvore;
	}

	public pregui�a(String nome, int idade, boolean emiteSom, boolean subirArvore) {
		super(nome, idade, emiteSom);
		this.subirArvore = subirArvore;
	}
	
}
