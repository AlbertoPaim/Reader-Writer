package br.com.albertopaim.util.Writer;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("src/arquivo.txt", true);
        BufferedWriter fileFinal = new BufferedWriter(fileWriter);

        fileFinal.append("\nTeste");
        fileFinal.close();


    }
}
