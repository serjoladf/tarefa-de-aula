// Essa Classe inverte a ordem da frase
public class InverterOrdem extends FraseComum{

    // construtor super para garantir a inicialização das probriedades do Pai
    public InverterOrdem(String frase, int tamanhoDaFrase) {
        super(frase, tamanhoDaFrase);
    }

    public void inverterOrdem(){
        System.out.println(">>>>>Frase Invertida");
        for (int i = tamanhoDaFrase; i > 0; i--) { // for com decremento,
            System.out.print(frase.charAt(i - 1)); // quando o I recebe o tamanho da frase ele recebe a partir de 1 ele não conta o 0 por isso o decremento de 1 Aqui
        }
        // Pùlar linha
        System.out.println("\n");
    }
}
