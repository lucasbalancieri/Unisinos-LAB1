package exercicios_fixacao4;

public class Principal {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Joaquim", 'M', 19, 1.78, 0, "Rua C, 145");
		Pessoa p2 = new Pessoa("Manuelita", 'F', 30, 1.67, 3, "Rua dos Camelos, 12");
		Pessoa p3 = new Pessoa("Pedro", 'M', 10, 1.91, 1, "Rua dos Gigantes, 189");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		
		if (p1.isFilhoUnico() && p1.getSexo() == 'M')
			System.out.println(p1.getNome() + " é filho único");
		else if (p1.isFilhoUnico() && p1.getSexo() == 'F')
			System.out.println(p1.getNome() + " é filha única");
		else if (!p1.isFilhoUnico() && p1.getSexo() == 'M')
			System.out.println(p1.getNome() + " não é filho único");
		else
			System.out.println(p1.getNome() + " não é filha única");
		
		if (p2.isFilhoUnico() && p2.getSexo() == 'M')
			System.out.println(p2.getNome() + " é filho único");
		else if (p2.isFilhoUnico() && p2.getSexo() == 'F')
			System.out.println(p2.getNome() + " é filha única");
		else if (!p2.isFilhoUnico() && p2.getSexo() == 'M')
			System.out.println(p2.getNome() + " não é filho único");
		else
			System.out.println(p2.getNome() + " não é filha única");
		
		if (p3.isFilhoUnico() && p3.getSexo() == 'M')
			System.out.println(p3.getNome() + " é filho único");
		else if (p3.isFilhoUnico() && p3.getSexo() == 'F')
			System.out.println(p3.getNome() + " é filha única");
		else if (!p3.isFilhoUnico() && p3.getSexo() == 'M')
			System.out.println(p3.getNome() + " não é filho único");
		else
			System.out.println(p3.getNome() + " não é filha única");
		
	}

}
