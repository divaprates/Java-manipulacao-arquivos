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

        readProduct(f.getPath());

        dos.close();
        scan.close();
        ps.close();

    }

    public static void readProduct(String arquivo) throws IOException {
        File f = new File(arquivo);
        DataInputStream dis = new DataInputStream(new FileInputStream(f.getPath()));

        String name = dis.readUTF();
        char type = dis.readChar();
        int amount = dis.readInt();
        double price = dis.readDouble();

        System.out.println("name: " + name + "\n"
                         + "type: " + type + "\n"
                         + "amount: " + amount + "\n"
                         + "price: " + price);

        dis.close();
    }

}
