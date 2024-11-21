package br.com.albertopaim.util.Reader;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream arquivo = new FileInputStream("src/arquivo.txt");

        InputStreamReader arquivoLido = new InputStreamReader(arquivo);

        BufferedReader arquivoFinal = new BufferedReader(arquivoLido);

        String linha = arquivoFinal.readLine();

        while (linha != null) {
            System.out.println(linha);
            linha = arquivoFinal.readLine();
        }

    }
}

