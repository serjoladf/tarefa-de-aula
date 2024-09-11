// Essa Classe Conta a quantidade de "As" na frase
public class ContarLetraA extends FraseComum {
    int cont = 0;

    // construtor super para garantir a inicialização das probriedades do Pai
    public ContarLetraA(String frase, int tamanhoDaFrase) {
        super(frase, tamanhoDaFrase);
    }

    public void contarA(){ // funçao de classe para contar A
        for (int i = 0; i < tamanhoDaFrase; i++) {
            char c = frase.charAt(i);

            // condição para contar A
            if (String.valueOf(c).equalsIgnoreCase("a") || String.valueOf(c).equalsIgnoreCase("ã")) {
                cont++;
            }
        }
        // Impressão do Resultado
        System.out.println("Nesta Frase há " +cont+ " vogais A");
    }
}
