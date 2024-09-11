public class FraseComum {
    // Nessa Classe apliquei o conceito de Herança é o que tem em Comum entre pai e filhos
    // Atributos
    protected String frase; // Protec na mesma pasta as classes filhas consegue ver o pai
    protected int tamanhoDaFrase;

        // Construtor
       public FraseComum(String frase, int tamanhoDaFrase) {
        this.frase = frase;
        this.tamanhoDaFrase = tamanhoDaFrase;
    }
}
