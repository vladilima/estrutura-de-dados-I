import estruturas.Lista;
import estruturas.Vetor;


public class VetorApp {

    public static void main(String[] args) {
        Lista lista = new Lista();
        
        lista.adicionarAoInicio(28);
        lista.adicionarAoInicio(27);
        lista.adicionarAoInicio(24);
        lista.adicionarAoInicio(21);
        lista.adicionarAoInicio(32);
        lista.adicionarAoInicio(12);
        lista.adicionarAoInicio(2);

        //lista.remover(21);
        //lista.mostrarNos();
        
        //System.out.println("-----");

        Vetor vetor = new Vetor(10);

        //2, 7, 9, 12, 16, 21, 27, 33, 42, 54
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
        vetor.adicionar(59);

        //vetor.mostrarElementos();

        vetor.prepend(0);

        vetor.mostrarElementos();

        vetor.buscaBinaria(59);
    }
}