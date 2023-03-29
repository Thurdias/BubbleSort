package test;

public class BubbleSort {
	public static void main(String[] args) {
		int vetor[] = {4,25,9,87,11};
		int aux;
		
		for (int i = 0; i < vetor.length; ++i) {
			for(int j = 0; j < vetor.length - 1; ++j) {
				if(vetor[j] > vetor[j+1]) {
					aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
					
				}
			}
		}
		System.out.print("[");
		for (int i = 0; i < vetor.length; i++) {
		    System.out.print(vetor[i]);
		    if (i != vetor.length - 1) {
		        System.out.print(", ");
		    }
		}
		System.out.println("]");
	}
	}

