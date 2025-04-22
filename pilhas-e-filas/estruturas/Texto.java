package estruturas;

public class Texto {

    public Pilha pilhaDesfazer;
    public Pilha pilhaRefazer;
    public String textoAtual;

    public Texto(String textoInicial) {
        this.textoAtual = textoInicial;
        this.pilhaDesfazer = new Pilha(2);
        this.pilhaRefazer = new Pilha(2);
    }

    public void inserirTexto(String texto) {
        this.pilhaDesfazer.empilhar(this.textoAtual);
        this.pilhaRefazer = new Pilha(2);
        
        this.textoAtual = this.textoAtual.concat(texto);
    }

    public void desfazer() {
        this.pilhaRefazer.empilhar(this.textoAtual);
        this.textoAtual = this.pilhaDesfazer.desempilhar();
    }

    public void refazer() {
        this.pilhaDesfazer.empilhar(this.textoAtual);
        this.textoAtual = this.pilhaRefazer.desempilhar();
    }

}
