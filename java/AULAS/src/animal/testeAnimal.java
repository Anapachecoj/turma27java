package animal;

public class testeAnimal {

	public static void main (String[] args) {
		
		cachorro dog = new cachorro ("bernardo ", 4, true, true); 
		cavalo horse = new cavalo ("pocoto", 12, true, true); 
		pregui�a sono = new pregui�a ("dorminhoca", 2, true, true); 
		
		System.out.println("Fun��o cachorro ");
		System.out.println("nome: "+ dog.getNome() + " idade: "+ dog.getIdade() + " esta emitindo som? "+ dog.isEmiteSom() +" AU AU AU "+ " ele est� correndo? " + dog.isDeveCorrer());
		
		System.out.println("Fun��o cavalo ");
		System.out.println("nome: "+ horse.getNome() + " idade: "+ horse.getIdade() + " esta emitindo som? "+ horse.isEmiteSom() + " POCOTO...POCOTO...POCOTO " + " ele est� correndo? " + horse.isDeveCorrer());
		
		System.out.println("Fun��o pregui�a ");
		System.out.println("nome: "+ sono.getNome() + " idade: "+ sono.getIdade() + " esta emitindo som? "+ sono.isEmiteSom() + " ROOM ZZZZzzz " + " ele est� subindo em alguma �rvore? " + sono.isSubirArvore());
	}
	
}
