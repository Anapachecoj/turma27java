package animal;

public class testeAnimal {

	public static void main (String[] args) {
		
		cachorro dog = new cachorro ("bernardo ", 4, true, true); 
		cavalo horse = new cavalo ("pocoto", 12, true, true); 
		preguiça sono = new preguiça ("dorminhoca", 2, true, true); 
		
		System.out.println("Função cachorro ");
		System.out.println("nome: "+ dog.getNome() + " idade: "+ dog.getIdade() + " esta emitindo som? "+ dog.isEmiteSom() +" AU AU AU "+ " ele está correndo? " + dog.isDeveCorrer());
		
		System.out.println("Função cavalo ");
		System.out.println("nome: "+ horse.getNome() + " idade: "+ horse.getIdade() + " esta emitindo som? "+ horse.isEmiteSom() + " POCOTO...POCOTO...POCOTO " + " ele está correndo? " + horse.isDeveCorrer());
		
		System.out.println("Função preguiça ");
		System.out.println("nome: "+ sono.getNome() + " idade: "+ sono.getIdade() + " esta emitindo som? "+ sono.isEmiteSom() + " ROOM ZZZZzzz " + " ele está subindo em alguma árvore? " + sono.isSubirArvore());
	}
	
}
