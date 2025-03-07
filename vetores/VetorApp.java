import estruturas.Vetor;

public class VetorApp {

    public static void main(String[] args){
        Vetor vetor = new Vetor(10);

        vetor.adicionar(1);
        vetor.adicionar(2);
        vetor.adicionar(3);
        vetor.adicionar(4);

        vetor.mostrarElementos();

        vetor.contemElemento(3);
    }

}