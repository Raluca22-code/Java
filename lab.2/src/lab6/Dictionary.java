package lab6;

import java.util.HashMap;
import java.util.Iterator;
public class Dictionary {
    HashMap hashMap = new HashMap();
    public Dictionary(){

    }
    public void addWord(Word word, Definition definition) {
        hashMap.put(word, definition);
    }

    public Definition getDefinition(Word word) {

        return (Definition) hashMap.get(word);
    }

    public void getAllWords() {
        Iterator iterator = hashMap.keySet().iterator();

        }

    public void getAllDefinitions() {
        Iterator iterator = hashMap.entrySet().iterator();

        }
    }
