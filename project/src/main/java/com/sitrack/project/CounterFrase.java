package com.sitrack.project;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CounterFrase {
	public int counter(Elements text) {
		int counter = 0;
		for(Element each:text) {
			counter++;
		}
		
		return counter;
	}
}
