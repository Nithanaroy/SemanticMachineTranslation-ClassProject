package kparser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONException;
import org.json.simple.parser.ParseException;

import tester.EfficiencyChecker;

public class Runner {

	public static void main(String[] args) throws IOException, JSONException, ParseException {

		HashMap<String, ArrayList<Integer>> diffLines = EfficiencyChecker.test(
				"/Volumes/350GB/Projects/NLP/SemanticMachineTranslation/data/europarl-v7.de-en.en",
				"/Volumes/350GB/Projects/NLP/SemanticMachineTranslation/data/europarl-v7.de-en.de", 2);
		System.out.println(diffLines);
		System.out.println("Done");
	}

	private static void translate() throws IOException, JSONException, ParseException {
		GermanTranslator t = GermanTranslator.getInstance();

		// TODO: Doesn't work for due to KParser: System.out.println(t.getRawGermanSetence("i ate an apple today"));
		System.out.println("With Stemming");
		System.out.println(t.getRawGermanSentence("John loves Mia", true));

		System.out.println("\nWithout Stemming");
		System.out.println(t.getRawGermanSentence("John loves Mia", false));
	}

}
