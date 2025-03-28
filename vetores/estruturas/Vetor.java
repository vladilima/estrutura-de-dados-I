package estruturas;

public class Vetor {

    public Integer[] elementos; // 3fc -> 4fd
    private int tamanho;
    private int capacidade;

    public Vetor(int capacidade) {
        this.elementos = new Integer[capacidade];
        this.capacidade = capacidade;
        this.tamanho = 0;
    }

    public void adicionar(Integer valor) {
        if (this.capacidade == this.tamanho) {
            this.aumentarCapacidade();
        }

        this.elementos[this.tamanho] = valor;
        this.tamanho++;
    }

    public void prepend(Integer valor) {
        if (this.capacidade == this.tamanho) {
            this.aumentarCapacidade();
        }

        Integer[] novosElementos = new Integer[this.capacidade];

        for (int i =0; i<this.tamanho; i++) {
            novosElementos[i+1] = this.elementos[i];
        }

        this.elementos = novosElementos;
        this.elementos[0] = valor;
        this.tamanho++;
    }

    private void aumentarCapacidade() {
        int novaCapacidade = this.capacidade + (this.capacidade/2);
        Integer[] novosElementos = new Integer[novaCapacidade];

        for (int i =0; i<this.tamanho; i++) {
            novosElementos[i] = this.elementos[i];
        }

        this.elementos = novosElementos;
        this.capacidade = novaCapacidade;
    }

    public void mostrarElementos() {
        System.out.println("-----");
        System.out.println("Elementos no vetor");
        for (int i=0; i < tamanho; i++) {
            System.out.println(this.elementos[i]);
        }
        System.out.println("-----");
    }

    public void contem(Integer valor) {
        for (int i=0; i < tamanho; i++) {
            if (this.elementos[i] == valor) {
                System.out.println("Valor encontrado");
                return;
            }
        }
        System.out.println("Valor não encontrado");
    }

    public void remover(int posicao) {
        if (posicao > this.tamanho) {
            System.out.println("Posição informada é inválida");
            return;
        }

        for (int i = posicao; i < this.tamanho-1; i++) {
            this.elementos[i] = this.elementos[i+1];
        }

        this.elementos[this.tamanho-1] = null;
        this.tamanho--;
    }

    public void removerPorValor(Integer valor) {
        for (int i=0; i<this.tamanho; i++) {
            if (this.elementos[i] == valor) {
                this.remover(i);
                System.out.println("Item removido");
                return;
            }
        }

        System.out.println("Item não encontrado");
    }

    public Integer buscaBinaria(Integer valor) {
        int min = 0;
        int max = tamanho-1;
        int target = (min + max) / 2;
        
        while (this.elementos[target] != valor) {
            System.out.println(min + " + " + max + " / 2 = " + target);
            int targetVelho = target;
            if (this.elementos[target] > valor){
                max = target;
            }
            else {
                min = target;
            }
            target = (min + max) / 2;

            if (targetVelho == target) {
                if (this.elementos[target + 1] == valor) {
                    target += 1;
                    break;
                }
                System.out.println("Item nao encontrado!");
                return null;
            }
        }
        System.out.println(min + " + " + max + " / 2 = " + target);

        System.out.println("Item encontrado!");
        return target;
    }
}