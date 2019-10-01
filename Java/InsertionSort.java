public class InsertionSort{
    public static int[] ordenar(int lista[]) {
		int eleito;
		int i;
		int j;
		long quantidadeDeTrocas = 0;
		long comparacoes = 0;
		
		for(i = 1; i < lista.length; i++) {
			comparacoes++;
			eleito = lista[i];
			j = i - 1;
			quantidadeDeTrocas += 2;

			while((j >= 0) && (lista[j] > eleito)) {
				comparacoes += 2;
				lista[j+1] = lista[j];
				quantidadeDeTrocas++;
				j--;
			}

			lista[j+1] = eleito;
			quantidadeDeTrocas++;
        }
        System.out.println(String.format("%s Trocas e %s Comparações", quantidadeDeTrocas, comparacoes));
        return lista;
    }
}
