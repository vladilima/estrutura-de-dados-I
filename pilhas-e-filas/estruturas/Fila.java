package estruturas;

public class Fila {

    public String[] elementos;
    public int tamanho;
    private int capacidade;

    public Fila(int capacidade) {
        this.elementos = new String[capacidade];
        this.capacidade = capacidade;
        this.tamanho = 0;
    }

    public void mostrarFila(){
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

    public void enfileirar(String valor) {
        if (this.capacidade == this.tamanho) {
            this.aumentarCapacidade();
        }

        this.elementos[this.tamanho] = valor;
        this.tamanho++;
    }

    public String desenfileirar() {
        String elementoRemovido = null;
        for (int i =0; i< this.tamanho; i++) {
            if (this.elementos[i] != null) {
                elementoRemovido = this.elementos[i];
                this.elementos[i] = null;
                return elementoRemovido;
            }
        }

        return null;
    }

    public boolean estaVazia() {
        for (int i = 0; i< this.tamanho; i++) {
            if (this.elementos[i] != null) {
                return false;
            }
        }
        return true;
    }

}
