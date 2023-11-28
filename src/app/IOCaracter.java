package app;

import java.io.*;

public class IOCaracter {

    public static void receiveKeyboard() throws IOException {
        System.out.println("Recommend 3 films: ");
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

}
