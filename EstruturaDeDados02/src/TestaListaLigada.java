
public class TestaListaLigada {
	public static void main (String args[]) {
		ListaLigada lista = new ListaLigada();
		
		lista.adicionaNoComeco("Lorena");
		lista.adicionaNoComeco("Simone");
		lista.adiciona("Tiago");
		
		lista.adiciona(2, "Lia");
		
		System.out.println(lista);
	}

}
