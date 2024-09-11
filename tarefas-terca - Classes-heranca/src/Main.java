import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Sacnner para receber dados
        String frase; // Declaração dá String frase que vai ser manipulada
        System.out.println("Digite uma Frase"); // frase
        frase = sc.nextLine(); // leitura da frase
        int tamanhoFrase = frase.length(); // declaração e recebimento to tamanho frase para melhor leitura nos Objetos

        SubstituirLetraA substituirLetraA = new SubstituirLetraA(frase,tamanhoFrase); // Instanciação 1 com inicialização de parametros
        substituirLetraA.substutirA(); // Chamando a função

        InverterOrdem inverterOrdem = new InverterOrdem(frase,tamanhoFrase);// Instanciação 2 com inicialização de parametros
        inverterOrdem.inverterOrdem(); // Chamando a função

        SepararLetras separarLetras = new SepararLetras(frase,tamanhoFrase); // Instanciação 3 com inicialização de parametros
        separarLetras.separarLetras(); // Chamando a função

        ContarVogal contarVogal = new ContarVogal(frase,tamanhoFrase); // Instanciação 4 com inicialização de parametros
        contarVogal.contarVogais(); // Chamando a função

        ContarLetraA contarLetraA = new ContarLetraA(frase,tamanhoFrase); // 5 Instanciação com inicialização de parametros
        contarLetraA.contarA(); // Chamando a função

    }
}



