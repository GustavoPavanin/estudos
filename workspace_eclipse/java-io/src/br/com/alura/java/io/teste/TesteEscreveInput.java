package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteEscreveInput {

public static void main(String[] args) throws IOException {
		
		//fluxo de entrada com Arquivo
		InputStream fis = System.in;
		Reader ist = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(ist);
		
		//fluxo de sa�da com arquivo
		OutputStream fos = new FileOutputStream("TextoEscrito.txt"); 
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			
			linha = br.readLine();
			if (linha != null) {
				bw.newLine();
			}
		}
		
		bw.close();
		br.close();
	}

}
