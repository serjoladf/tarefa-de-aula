// Essa Classesubstitui a vogal A da frase pelo "-"

import java.util.ArrayList;

public class SubstituirLetraA extends FraseComum{
    ArrayList<Character> letrasFrase = new ArrayList<>(); // instanciei um arrei para receber as letras separada da frase

    // construtor super para garantir a inicialização das probriedades do Pai
    public SubstituirLetraA(String frase, int tamanhoDaFrase) {
        super(frase, tamanhoDaFrase);
    }
    // função
    public void substutirA(){
        System.out.println(">>>>>Frase com o Traço Substituindo o A");
        for (int i = 0; i < tamanhoDaFrase; i++) {
            letrasFrase.add(frase.charAt(i)); // recebimento e adicionando a frase ao o Arreio
        }
        for(char letras: letrasFrase) // laço for para comparar letra a letra e na sequencia substituir a pelo traço

        {
            if (letras == 'a' || letras == 'ã') { // comparaça com a igualdade e Operador Lógico OU
                letras = '-';
            }
            System.out.print(letras); // Impressão em Tela
        }
        // Pular Linha
        System.out.println("\n");
    }
}

