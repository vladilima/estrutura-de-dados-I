import estruturas.Documento;
import estruturas.Fila;
import estruturas.Impressao;
import estruturas.Pilha;
import estruturas.Texto;

public class VetorApp {

    public static void main(String[] args) {

        System.err.println("--------------//-------------");
        // ------- Pilha / Texto ------- //

        Texto texto = new Texto("Jockey");
        System.err.println(texto.textoAtual);

        texto.inserirTexto(" de Galinha");
        System.err.println(texto.textoAtual);

        texto.desfazer();
        System.err.println(texto.textoAtual);
        
        texto.refazer();
        System.err.println(texto.textoAtual);

        texto.inserirTexto("!!!");
        System.err.println(texto.textoAtual);
        
        texto.desfazer();
        texto.desfazer();
        System.err.println(texto.textoAtual);


        // ------- Fila / Documentos ------- //
        System.err.println("--------------//-------------");

        Impressao impressao = new Impressao();

        impressao.adicionarDocumento(new Documento("Currículo", 1));
        impressao.adicionarDocumento(new Documento("Ficha de D&D", 2));
        impressao.adicionarDocumento(new Documento("Prova de Estrutura de Dados", 2));

        impressao.imprimirProximo();

        impressao.mostrarFila();

        impressao.imprimirProximo();

        impressao.mostrarFila();
        
        impressao.imprimirProximo();

        
        System.err.println("--------------//-------------");

    }
}