public class SelectionSort{
    public static int[] ordenar(int lista[]) {
		int i;
		int j;
		int eleito;
		int menor;
		int posicao;
		long quantidadeDeTrocas = 0;
		long comparacoes = 0;
		
		for(i = 0; i < lista.length - 1; i++) {
			comparacoes++;
			eleito = lista[i];
			menor = lista[i+1];
			posicao = i+1;
			quantidadeDeTrocas += 3;
			for(j = i+2; j < lista.length; j++) {
				comparacoes++;
				if(lista[j] < menor) {
					comparacoes++;
					menor = lista[j];
					posicao = j;
					quantidadeDeTrocas =+ 2;
							
				}
			}
			
			if(menor < eleito) {
				comparacoes++;
				lista[i] = lista[posicao];
				lista[posicao] = eleito;
				quantidadeDeTrocas += 2;
				
			}
		}
		System.out.println(String.format("%s Trocas e %s Comparações", quantidadeDeTrocas, comparacoes));
		return lista;
	}
}