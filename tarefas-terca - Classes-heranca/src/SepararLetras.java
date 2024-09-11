import java.sql.SQLOutput;

// Essa Classe separa a frase com traços
public class SepararLetras extends FraseComum{

    // construtor super para garantir a inicialização das probriedades do Pai
    public SepararLetras(String frase, int tamanhoDaFrase) {
        super(frase, tamanhoDaFrase);
    }

    public void separarLetras() {
        System.out.println(">>>>>Frase separada com Traço");
        for (int i = 0; i < tamanhoDaFrase; i++) { // laço
            System.out.print(frase.charAt(i)); // Impressão da lista
            if (i < frase.length() - 1) { // Condição para não colocar "-" depois do último item
                System.out.print(" - ");
            }
        }
        // pular linha devido esta usando Print sem LN
        System.out.println("\n");
    }
}