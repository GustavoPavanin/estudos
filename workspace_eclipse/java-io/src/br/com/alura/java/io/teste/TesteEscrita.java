package br.com.alura.java.io.teste;

//CRTL + SHIT + O organiza os imports no eclipse
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	public static void main(String[] args) throws IOException {

		//fluxo de sa�da com Arquivo
		OutputStream fos = new FileOutputStream("loren2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
		bw.newLine();
		bw.newLine();
		bw.write("Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.");
		
		bw.close();
		 
	}
}
