package it.epicode.exercises.week3.giorno2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Esercizio2 {
	private static final Logger logger = LoggerFactory.getLogger(Esercizio2.class);

	public static void main(String[] args) {
		List<Integer> listaRandom = inizializzaListaRandom(5);

		stampaLista(listaRandom);

		stampaLista(listaRandom, true);

		stampaLista(listaRandom, false);

		List<Integer> listaSpeculare = listaSpeculare(listaRandom);

		stampaLista(listaSpeculare);

	}

	private static List<Integer> inizializzaListaRandom(int numElementi) {

		List<Integer> listaElementi = new ArrayList<Integer>();
		Random randomGenerator = new Random();
		for (int i = 0; i < numElementi; i++) {
			listaElementi.add(randomGenerator.nextInt(101));
		}
		return listaElementi;

	}

	private static List<Integer> listaSpeculare(List<Integer> listaOriginale) {
		// Crea una nuova lista contenente gli elementi della lista originale
		List<Integer> nuovaLista = new ArrayList<Integer>(listaOriginale);

		for (int i = listaOriginale.size() - 1; i >= 0; i--) {
			nuovaLista.add(listaOriginale.get(i));
		}

		return nuovaLista;

	}

	private static void stampaLista(List<Integer> lista, boolean pari) {
		System.out.println("****** Stampa lista" + (pari ? " PARI" : "DISPARI"));

		if (pari == true) {
			for (int i = 0; i < lista.size(); i = i + 2) {
				System.out.println("Posizione [" + i + "]: " + lista.get(i));

			}
		} else {
			for (int i = 1; i < lista.size(); i = i + 2) {
				System.out.println("Posizione [" + i + "]: " + lista.get(i));

			}

		}

	}

	private static void stampaLista(List<Integer> lista) {
		System.out.println("****** Stampa lista");
		for (Integer curInt : lista) {
			System.out.println("Posizione [" + lista.indexOf(curInt) + "]: " + curInt);
		}

	}

}
