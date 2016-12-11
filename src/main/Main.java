package main;

import interpretation.InterpretationTexte;

import java.util.Arrays;

import relations.Implements;
import types.Classe;
import types.Interface;
import classe.Methode;
import classe.Variable;
import diagramme.Diagramme;

/**
 * Classe Main, afin de tester les fonctions implémentées
 * 
 *
 */
public class Main {
	public static void main(String[] args) {
		// creation d'une classe nommée Classe1, il faut d'abord créer ses
		// variables d'instance (2 pour l'exemple)
		Variable v1 = new Variable("int", "v1");
		Variable v2 = new Variable("String", "v2");

		// il faut ensuite modéliser les méthodes de cette classe (par exemple
		// un getter et un setter, ce dernier a une variable en parametre
		Methode m1 = new Methode("int", "getV1");

		Variable param = new Variable("int", "argument");
		Methode m2 = new Methode("void", "getV2", Arrays.asList(param));

		// Enfin on modelise la classe, en mettant les variables et les methodes
		// dans une liste.. 10 represente l'epaisseur du trait, et bleu la
		// couleur de la classe
		Classe Classe1 = new Classe(10, "BLEU", "Classe1",
				Arrays.asList(v1, v2), Arrays.asList(m1, m2));

		// On créer une interface de la même maniere (sans variable d'instance,
		// juste une méthode que l'on nommera "methodeInterface"

		Methode m3 = new Methode("void", "methodeInterface");
		Interface Interface = new Interface(12, "ROUGE", "I1",
				Arrays.asList(m3));

		// On définit enfin des relations entre deux types comme cela
		Implements i = new Implements("ROUGE", 3, Classe1, Interface);

		// On crée un diagramme prenant dans l'ordre la liste des relation,
		// celle des classes et enfin celle des interfaces
		Diagramme d = new Diagramme(Arrays.asList(i), Arrays.asList(Classe1),
				Arrays.asList(Interface));

		// On crée un interpretateur de texte
		InterpretationTexte inter = new InterpretationTexte(d);
		inter.interpretation();

	}
}
