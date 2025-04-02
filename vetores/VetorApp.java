import estruturas.Lista;
import estruturas.Vetor;


public class VetorApp {

    public static void main(String[] args) {
        Lista lista = new Lista();
        
        lista.adicionarAoInicio(54);
        lista.adicionarAoInicio(42);
        lista.adicionarAoInicio(33);
        lista.adicionarAoInicio(27);
        lista.adicionarAoInicio(21);
        lista.adicionarAoInicio(16);
        lista.adicionarAoInicio(12);
        lista.adicionarAoInicio(9);
        lista.adicionarAoInicio(7);
        lista.adicionarAoInicio(2);

        // lista.remover(21);
        
        // lista.adicionarAoFinal(60);
        // lista.numeroDeNos();
        // System.out.println(lista.tamanho);
        lista.inserirApos(54, 60);
        
        //lista.getIterador().inserirAposAtual(5);
        //lista.getIterador().removerAposAtual();
        //lista.getIterador().inserirAntesAtual(0);
        //lista.getIterador().removerAntesAtual();

        lista.mostrarNos();
        
        // System.out.println("-----");


        Vetor vetor = new Vetor(10);

        vetor.adicionar(2);
        vetor.adicionar(7);
        vetor.adicionar(9);
        vetor.adicionar(12);
        vetor.adicionar(16);
        vetor.adicionar(21);
        vetor.adicionar(27);
        vetor.adicionar(33);
        vetor.adicionar(42);
        vetor.adicionar(54);

        // vetor.prepend(0);
        // vetor.buscaBinaria(54);

        // vetor.mostrarElementos();

    }
}