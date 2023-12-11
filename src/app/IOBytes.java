package app;

import java.io.*;

public class IOBytes {

    public static void copyFile() throws IOException {
        File f = new File("recomendacoes-copy.txt");
        String nameFile = f.getName();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f.getName()));

        String nameFileCopy = nameFile.substring(0, nameFile.indexOf("-")).concat("-copy2.txt");
        File fCopy = new File(nameFileCopy);

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(nameFileCopy));

        int line = 0;
        while((line = bis.read()) != -1) {
            bos.write((char) line);
            bos.flush();
        }

        bis.close();
        bos.close();

        System.out.printf("Arquivo %s copiado com sucesso! Cópia com %d bytes", fCopy.getName(), fCopy.length());
    }
}
