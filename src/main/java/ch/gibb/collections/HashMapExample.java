package ch.gibb.collections;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // import java.util.HashMap;
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Frankreich", "Paris");
        hm.put("Italien", "Rom");
        hm.put("Spanien", "Madrid");
        hm.put("Schweiz", "Bern");

        System.out.println("Rom ist Hauptstadt von: " + hm.get("Rom")); // TODO ask why not both ways.
        System.out.println("Hauptstadt der Schweiz ist " + hm.get("Schweiz"));
    }
}
