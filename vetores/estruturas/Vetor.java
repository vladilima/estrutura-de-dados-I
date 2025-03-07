package estruturas;

public class Vetor {

    private Integer[] elementos;
    private int tamanho;
    private int capacidade;

    public Vetor(int capacidade) {
        this.elementos = new Integer[capacidade];
        this.capacidade = capacidade;
        this.tamanho = 0;
    }

    public void adicionar(Integer valor) {
        if (this.capacidade == this.tamanho) {
            System.out.println("O vetor está cheio.");
            return;
        }
        this.elementos[this.tamanho] = valor;
        this.tamanho++;
    }

    public void mostrarElementos() {
        System.out.println("Elementos no vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(this.elementos[i]);
        }
    }

    public void contemElemento(Integer valor) {
        for (int i = 0; i < tamanho; i++) {
            if (this.elementos[i] == valor){
                System.out.println("Vetor contém " + valor);
                return;
            }
        }
        System.out.println("Vetor não contém " + valor);
    }
}