import app.IOCaracter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Criando arquivo txt e salvando conteúdo
//        try {
//            IOCaracter.receiveKeyboard();
//        } catch (IOException e) {
//            System.err.println("Algo deu errado...");
//            throw new RuntimeException(e);
//        }

        // Fazendo uma cópia de um arquivo txt para outro
        try {
            IOCaracter.copyFile();
        } catch (IOException e) {
            System.err.println("Algo deu errado...");
            throw new RuntimeException(e);
        } finally {
            System.out.println("Finalizado!!");
        }

    }
}