package naveenAutomationLabsJavaInterview;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CountNoOfWordsFromAFile {

	public static void main(String[] args) throws IOException {
		
		countNoOfWords("C:\\Users\\tummj\\Desktop\\chinna\\code practise\\code_practice\\sample.txt");
	}
	
	public static void countNoOfWords(String filePath) throws IOException {
		
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		
		String currentLine = reader.readLine();
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		while(currentLine != null) {
			
			String[] words = currentLine.split(" ");
			for(String word : words) {
				if(wordMap.containsKey(word)) {
					wordMap.put(word, wordMap.get(word)+1);
				}else {
					wordMap.put(word, 1);
				}
			}
			currentLine = reader.readLine();
		}
		
		wordMap.forEach((k,v) -> System.out.println(k+":"+v));
		Map<String, Integer> maxWord = new HashMap<String, Integer>();
		wordMap
			.entrySet()
			.stream()
			.filter(entry -> entry.getValue() == Collections.max(wordMap.values()))
			.forEach(e -> maxWord.put(e.getKey(), e.getValue()));
	
		System.out.println(maxWord);
		
	}
}
