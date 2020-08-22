package com.prep.interview.dictionariesandhashmaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashTablesRansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mag = "give me one grand today night one";
		String not = "give one grand today";

		String[] magazine = mag.split(" ");
		String[] note = not.split(" ");
		checkMagazine(magazine, note);
	}

	static void checkMagazine(String[] magazine, String[] note) {
		Map<String, Integer> magazineMap = new HashMap<String, Integer>();
		for (int i = 0; i < magazine.length; i++) {
			if (magazineMap.containsKey(magazine[i])) {
				int count = magazineMap.get(magazine[i]);
				magazineMap.put(magazine[i], count + 1);
			} else {
				magazineMap.put(magazine[i], 1);

			}

		}
		System.out.println(checkIfNoteIsThereInMagazineMap(magazineMap, note));
	}

	private static String checkIfNoteIsThereInMagazineMap(Map<String, Integer> magazineMap, String[] note) {

		for (int i = 0; i < note.length; i++) {
			if (magazineMap.containsKey(note[i]) && magazineMap.get(note[i]) != 0) {
				int count = magazineMap.get(note[i]);
				magazineMap.put(note[i], count - 1);
			} else {
				return "No";
			}
		}
		return "Yes";
	}

}
