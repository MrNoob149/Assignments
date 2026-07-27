package model;

import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> Listwords = new HashMap<>();

    public Dictionary() {

        Listwords.put("Apple", "a round fruit with firm, white flesh and a green, red, or yellow skin:");
        Listwords.put("Banana", "a long, curved fruit with a yellow skin and soft, sweet, white flesh inside:");
        Listwords.put("Orange", "a round sweet fruit that has a thick orange skin and an orange centre divided into many parts, or the tree that this fruit comes from");
    }


    public String addword(String names, String meaning) {
        Listwords.put(names, meaning);
        return names;
    }

    public String getWord(String word) {
        return Listwords.get(word);
    }


}
