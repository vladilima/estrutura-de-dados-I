package estruturas;

public class Pilha {

    public String[] elementos;
    public int tamanho;
    private int capacidade;

    public Pilha(int capacidade) {
        this.elementos = new String[capacidade];
        this.capacidade = capacidade;
        this.tamanho = 0;
    }

    public void mostrarPilha(){
        for (int i = 0; i < this.tamanho; i++) {
            System.out.println(this.elementos[i]);
        }
    }

    private void aumentarCapacidade() {
        int novaCapacidade = this.capacidade + (this.capacidade/2);
        String[] novosElementos = new String[novaCapacidade];

        for (int i =0; i<this.tamanho; i++) {
            novosElementos[i] = this.elementos[i];
        }

        this.elementos = novosElementos;
        this.capacidade = novaCapacidade;
    }

    public void empilhar(String valor) {
        if (this.capacidade == this.tamanho) {
            this.aumentarCapacidade();
        }

        this.elementos[this.tamanho] = valor;
        this.tamanho++;
    }

    public String desempilhar() {
        String elementoRemovido = this.elementos[this.tamanho - 1];
        this.elementos[this.tamanho - 1] = null;
        this.tamanho--;

        return elementoRemovido;
    }

}
