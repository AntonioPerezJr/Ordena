import java.util.Random;

public class Metodos {
	//bubble Sort
	public int[] BubbleSort(int[] vet, int aux){
		int i;
		for(i = 0; i<vet.length; i++)
		 {
			 for(int j = 0; j<vet.length - 1; j++){
				 if(vet[j] > vet[j + 1]){
					 aux = vet[j];
					 vet[j] = vet[j+1];
					 vet[j+1] = aux;
				 }
			 }
		 }
		return vet;
	 }

	//quicksort
	public static int[] quicksort(int vet[], int ini, int fim) {
        int meio;

        if (ini < fim) {
            meio = partition(vet, ini, fim);
            quicksort(vet, ini, meio);
            quicksort(vet, meio + 1, fim);
        }
        return vet;
    }

    public static int partition(int vet[], int ini, int fim) {
        int pivo, topo, i;
        pivo = vet[ini];
        topo = ini;

        for (i = ini + 1; i <= fim; i++) {
            if (vet[i] < pivo) {
                vet[topo] = vet[i];
                vet[i] = vet[topo + 1];
                topo++;
            }
        }
        vet[topo] = pivo;
        return topo;
    }

	public static int [] embaralhar(int [] v){
		 Random random = new Random();
		 for (int i=0; i < (v.length - 1); i++) {
			 //sorteia um índice
			 int j = random.nextInt(v.length);
			 //troca o conteúdo dos índices i e j do vetor
			 int temp = v[i];
			 v[i] = v[j];
			 v[j] = temp;
		 }
		 return v;
	 }
}
