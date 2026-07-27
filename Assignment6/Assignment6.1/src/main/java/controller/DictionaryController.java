package controller;

import model.Dictionary;

import java.util.HashMap;

public class DictionaryController {
    private Dictionary dictionary = new Dictionary();

    public String searchword(String words) {
        if (words == null || words.isBlank()) {
            return "Please enter a word.";
        }

        String meaning = dictionary.getWord(words);

        if (meaning == null) {
            return "Word not found.";
        }

        return meaning;
    }
}



