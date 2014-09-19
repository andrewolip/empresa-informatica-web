package main;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import folha.generica.Funcionario;
import folha.informatica.Analista;
import folha.informatica.Diretor;
import folha.informatica.EmpresaInformatica;
import folha.informatica.Gerente;
import folha.informatica.Programador;

public class Teste {
	public static void main(String[] args) {
		EmpresaInformatica glt = new EmpresaInformatica("GLTb");
		glt.inserirProgramador(new Programador("Flavio", 1, 30, 40));
		glt.inserirAnalista(new Analista("Christian", 2, 40, 30));
		glt.inserirGerente(new Gerente("Andrew", 3, 10000));
		glt.inserirDiretor(new Diretor("Isis", 4, 20000));
		glt.gerarFolha();
		
		Writer writer = null;
		
		try {
			
			FileOutputStream os = new FileOutputStream("EmpresaInformatica.txt");
			writer = new BufferedWriter(new OutputStreamWriter(os));
			
			for (Funcionario funcionario : glt.funcionarios) {
				if ((funcionario instanceof Programador)) {
					writer.write("Código: " + String.valueOf(funcionario.getCodigo() + "\n"));
					writer.write("Nome: " + String.valueOf(funcionario.getNome() + "\n"));
					writer.write("Valor Hora: " + String.valueOf(((Programador) funcionario).getValorHora() + "\n"));
					writer.write("Número de Horas: " + String.valueOf(((Programador) funcionario).getNumeroHoras() + "\n\n"));
				} else if (funcionario instanceof Analista) {
					writer.write("Código: " + String.valueOf(funcionario.getCodigo() + "\n"));
					writer.write("Nome: " + String.valueOf(funcionario.getNome() + "\n"));
					writer.write("Valor Hora:" + String.valueOf(((Analista) funcionario).getValorHora() + "\n"));
					writer.write("Número de Horas: " + String.valueOf(((Analista) funcionario).getNumeroHoras() + "\n\n"));
				} else if(funcionario instanceof Gerente) {
					writer.write("Código: " + String.valueOf(funcionario.getCodigo() + "\n"));
					writer.write("Nome: " + String.valueOf(funcionario.getNome() + "\n"));
					writer.write("Salário: " + String.valueOf(((Gerente) funcionario).getSalarioMensal() + "\n\n"));
				} else if(funcionario instanceof Diretor) {
					writer.write("Código: " + String.valueOf(funcionario.getCodigo() + "\n"));
					writer.write("Nome: " + String.valueOf(funcionario.getNome() + "\n"));
					writer.write("Salário: " + String.valueOf(((Diretor) funcionario).getSalarioMensal() + "\n\n"));
				}
			}
			
		} catch (FileNotFoundException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {writer.close();} 
			catch (Exception ex) {}
		}
	}
}
