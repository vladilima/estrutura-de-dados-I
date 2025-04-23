package estruturas;

public class Impressao {

    public Fila documentos;
    public int tamanho;

    public Impressao() {
        this.documentos = new Fila(2);
        this.tamanho = 0;
    }

    public void adicionarDocumento(Documento documento) {
        this.documentos.enfileirar(documento.nome);
        this.tamanho++;
    }

    public void imprimirProximo() {
        String documento = this.documentos.desenfileirar();
        System.out.println("Imprimindo "+documento+"...");
    }

    public void mostrarFila() {
        System.out.println("Fila atual: ");
        for (int i = 0; i< this.tamanho; i++) {
            if (this.documentos.elementos[i] != null) {
                System.err.println(this.documentos.elementos[i]);
            }
        }
    }

}
