package Exemplos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Principal {
	public static void main(String[] args){
		File caminho = new File("C:/Users/c108/Documents");
		if(!caminho.exists())
			caminho.mkdir();
		File arquivo = new File(caminho, "arquivo.arq");
		try {
			if(!arquivo.exists())
				arquivo.createNewFile();
			ObjectOutputStream objArquivo = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(arquivo.getAbsolutePath())));
			objArquivo.writeObject(new Pessoa("Mateus", "mateuschavesmarques@gmail.com", "51980482721", "000.000.000-00"));
			objArquivo.close();
		}
		catch(IOException e){
			System.out.println("Ocorreu um erro!");
		}		
		try {
			ObjectInputStream objArquivoLeitura = new ObjectInputStream(new BufferedInputStream(new FileInputStream(arquivo.getAbsoluteFile())));
			Pessoa p1 = (Pessoa) objArquivoLeitura.readObject();
			System.out.println(p1.getNome());
		}
		catch(IOException e) {
			System.out.println("Ocorreu um erro!");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Classe não encontrada!!");
		}
	}
}
