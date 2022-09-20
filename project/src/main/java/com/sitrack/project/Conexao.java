package com.sitrack.project;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Conexao {
	public Document conexao (String link) throws IOException {
		Document doc = Jsoup.connect(link).get();
		return doc;
	}
}
