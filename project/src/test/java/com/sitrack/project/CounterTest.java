package com.sitrack.project;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Scanner;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

public class CounterTest {

	@Test
	public void testCounter() throws IOException {
		Scanner log = new Scanner(System.in, "utf-8");
		//Link a busca "https://es.wikipedia.org/wiki/Pirámides_de_Egipto"
		System.out.println("Qual link deseja buscar?");
		
		String link = log.nextLine();
		Conexao lg = new Conexao();
		Document doc = lg.conexao(link);
		//Frase a buscar "bloques de piedra"
		System.out.println("Qual frase deseja busca?");
		String frase = log.nextLine();
		Elements text = doc.getElementsMatchingOwnText(frase);
		CounterFrase contador = new CounterFrase();
		int total = contador.counter(text);
		assertEquals(2, total);
	}

}
