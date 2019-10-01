public class MergeSort{
    public static int[] ordenar(int lista[]) {
        int i;
        int j;
        int eleito;
        int menor;
        int posicao;

        for(i = 0; i < lista.length - 1; i++) {
            eleito = lista[i];
            menor = lista[i+1];
            posicao = i+1;
            
            for(j = i + 2; j < lista.length; j++) {
                if(lista[j] < menor) {
                    menor = lista[j];
                    posicao = j;
                }
            }
            
            if(menor < eleito) {
                lista[i] = lista[posicao];
                lista[posicao] = eleito;    
            }
        }
        return lista;
    }
}