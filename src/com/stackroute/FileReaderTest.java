package com.stackroute;

import static org.junit.Assert.*;

import java.io.FileReader;
import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FileReaderTest {

	fileReader fl;
	@Before
	public void setUp() {
		fl = new fileReader();
	}

	@After
	public void tearDown() {
		fl = null;
	}

	@Test
	public void testFileIsEmpty() {
		String fileName = "/home/meghana/workspace/java/text3.txt";
		assertNull("File is not empty",fl.countWords(fileName));
	}
	
	@Test
	public void testCountWords() {
		String fileName = "/home/meghana/workspace/java/text2.txt";
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		wordCount.put("twinkle", 2);
		wordCount.put("little", 1);
		wordCount.put("the", 2);
		wordCount.put("star", 1);
		wordCount.put("how", 1);
		wordCount.put("I", 1);
		wordCount.put("wonder", 1);
		wordCount.put("what", 1);
		wordCount.put("you", 1);
		wordCount.put("are", 1);
		assertEquals("Word count failed.", wordCount, 
				fl.countWords(fileName));
	}
	
	@Test
	public void testCountWordsFailure() {
		String fileName = "/home/meghana/workspace/java/text.txt";
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		wordCount.put("twinkle", 2);
		wordCount.put("little", 1);
		wordCount.put("the", 2);
		wordCount.put("star", 1);
		wordCount.put("how", 1);
		wordCount.put("I", 1);
		wordCount.put("wonder", 1);
		wordCount.put("what", 1);
		wordCount.put("you", 1);
		wordCount.put("are", 1);
		assertNotEquals("Word count failed.", wordCount, 
				fl.countWords(fileName));
	}

}
