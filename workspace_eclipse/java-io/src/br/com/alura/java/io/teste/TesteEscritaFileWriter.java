package br.com.alura.java.io.teste;

//CRTL + SHIT + O organiza os imports no eclipse
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {
	public static void main(String[] args) throws IOException {

		//fluxo de sa�da com Arquivo
		//OutputStream fos = new FileOutputStream("loren2.txt");
		//Writer osw = new OutputStreamWriter(fos);
		//BufferedWriter bw = new BufferedWriter(osw);
		
		//BufferedWriter bw = new BufferedWriter(new FileWriter("loren2.txt"));
		//PrintStream ps = new PrintStream("loren2.txt");
		
		PrintWriter ps = new PrintWriter("loren2.txt");
		
		ps.println("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
		ps.println();
		ps.println("Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.");
		ps.close();
		
		 
	}
}
