package app;

import java.io.*;
import java.util.Scanner;

public class IOData {

    public static void incluirProduto() throws IOException {
        File f = new File("lista.bin");

        PrintStream ps = new PrintStream(System.out);
        ps.flush();

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(f.getPath()));

        Scanner scan = new Scanner(System.in);

        ps.print("Digite o nome: ");
        String name = scan.nextLine();
        dos.writeUTF(name);

        ps.print("Digite o tipo: ");
        char type = (char) System.in.read();
        dos.writeChar(type);

        ps.print("Digite a quantidade: ");
        int amount = scan.nextInt();
        dos.writeInt(amount);

        ps.print("Digite o preço: ");
        double price = scan.nextDouble();
        dos.writeDouble(price);

        dos.close();
        scan.close();

    }

    public static void readProduct(String arquivo) {

    }

}
