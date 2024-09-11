// Essa Classe Conta a quantidade de as Vogais da frase

public class ContarVogal extends FraseComum{
    String[] vogal = new String[]{"a", "e", "i", "o", "u"}; // Utilzei um Arrey inicializado devido diminuir o código de comparação

    int cont = 0;

    // construtor super para garantir a inicialização das probriedades do Pai
    public ContarVogal(String frase, int tamanhoDaFrase) {
        super(frase, tamanhoDaFrase);
    }
    // Função contar Vogal
    public void contarVogais() {
        for (int i = 0; i < tamanhoDaFrase; i++) { // For 1 para pegar a primeira letra da frase e comparar com todas as vogais do Array acima
            char c = frase.charAt(i);
            for (String a : vogal) { //Um for mas enxuto (for-each) para pecorrer a lista
                if (String.valueOf(c).equalsIgnoreCase(a)) { // comparação frase com as Vogais
                    cont++;
                }
            }
        }
        // Impressão na tela
        System.out.println("Nesta Frase há " +cont+ " vogais");
    }
}
