import app.IOCaracter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            IOCaracter.receiveKeyboard();
        } catch (IOException e) {
            System.err.println("Algo deu errado...");
            throw new RuntimeException(e);
        }
    }
}