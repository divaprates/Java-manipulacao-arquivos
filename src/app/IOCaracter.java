package app;

import java.io.*;

public class IOCaracter {

    public static void receiveKeyboard() throws IOException {
        System.out.println("Recommend films: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        File f = new File("recomentacoes.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName()));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while(!line.isEmpty());

        bw.flush();

        br.close();
        bw.close();
    }

    public static void copyFile() throws IOException {
        File f = new File("recomentacoes.txt");
        String nameFile = f.getName();

        BufferedReader br = new BufferedReader(new FileReader(nameFile));
        String line = br.readLine();

        String nameFileCopy = nameFile.substring(0, nameFile.indexOf(".")).concat("-copy.txt");
        File fcopy = new File(nameFileCopy);

        BufferedWriter bw = new BufferedWriter(new FileWriter(fcopy.getName()));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while(line != null);

        bw.flush();

        br.close();
        bw.close();

        System.out.println("Arquivo copiado com Sucesso!");

        addNewKeyboard(fcopy.getName());
    }

    private static void addNewKeyboard(String file) throws IOException {
        System.out.println("Recommend new films: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while(!line.equalsIgnoreCase("fim"));

        bw.flush();
        br.close();
        bw.close();
    }

}
