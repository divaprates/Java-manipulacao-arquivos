import app.IOBytes;
import app.IOCaracter;
import app.IOData;
import app.IOObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose the option:");
        System.out.println("1: Criando arquivo txt e salvando conteúdo\n" +
                "2: Fazendo uma cópia de um arquivo txt para outro\n" +
                "3: Copiando arquivo Bytes\n" +
                "4: Criando arquivos Data\n" +
                "5: Serializando Objetos\n" +
                "6: Deserializando Objetos: ");
        Scanner br = new Scanner(System.in);
        String option = br.next();

        switch (option) {
            case "1":
                // Criando arquivo txt e salvando conteúdo
                try {
                    IOCaracter.receiveKeyboard();
                } catch (IOException e) {
                    System.err.println("Algo deu errado...");
                    throw new RuntimeException(e);
                }
                break;
            case "2":
                // Fazendo uma cópia de um arquivo txt para outro
                try {
                    IOCaracter.copyFile();
                } catch (IOException e) {
                    System.err.println("Algo deu errado...");
                    throw new RuntimeException(e);
                } finally {
                    System.out.println("Finalizado!!");
                }
                break;
            case "3":
                try {
                    IOBytes.copyFile();
                } catch (IOException e) {
                    System.err.println("Algo deu errado...");
                    throw new RuntimeException(e);
                }
            case "4":
                try {
                    IOData.incluirProduto();
                } catch (IOException e) {
                    System.err.println("Algo deu errado...");
                    throw new RuntimeException(e);
                }
            case "5":
                IOObject.serializableObject();
            case "6":
                try {
                    IOObject.deserializableObject("/home/diva/Documentos/workspace/Java-manipulacao-arquivos/cat");
                } catch (IOException | ClassNotFoundException e) {
                    System.err.println("Algo deu errado...");
                    throw new RuntimeException(e);
                }
            default:
                System.out.println("The end...");
        }
    }
}