package app;

import app.domain.Cat;

import java.io.*;

public class IOObject {
    public static void serializableObject() {
        File f = new File("cat");
        Cat cat = new Cat("Lion", "black", 2);

        ObjectOutputStream oos = null;

        try {
            OutputStream os = new FileOutputStream(f.getAbsolutePath());
            oos = new ObjectOutputStream(os);
            oos.writeObject(cat);
        } catch (FileNotFoundException e) {
            System.out.printf("Arquivo %s não encontrado!", f.getName());
        } catch (IOException e) {
            System.out.printf("Não foi possível criar o arquivo!");
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                System.out.printf("Erro ao fechar o arquivo!");
            }
        }
    }
}
