public class BubbleSort{
    public static int[] ordenar(int lista[]) {
		int auxiliar;
		long quantidadeDeTrocas = 0;
		long comparacoes = 0;
		
		for (int i = 1 ; i <= lista.length; i++) {
			comparacoes++;
			for (int k = 0; k < lista.length - 1; k++) {
				comparacoes++;
				if (lista[k] > lista[k+1]) {
					comparacoes++;
					auxiliar = lista[k];
					lista[k] = lista[k+1];
					lista[k+1] = auxiliar;
					quantidadeDeTrocas =+ 3;
				}
			}
		}
		System.out.println(String.format("%s Trocas e %s Comparações", quantidadeDeTrocas, comparacoes));
		return lista;
    }
}
