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

    public static void deserializableObject(String file) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Cat cat = (Cat) ois.readObject();

        System.out.printf("\nNome..................: %s\n", cat.getName());
        System.out.printf("Cor................: %s\n", cat.getColor());
        System.out.printf("Idade...................: %d\n", cat.getAge());
        System.out.println(cat);

        ois.close();
    }
}
