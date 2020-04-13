package mate.academy.lesson10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapMain {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        Map<Object, String> objectHashMap = new HashMap<>();

        hashMap.put("key2", "value 2");
        hashMap.put("key3", "value 3");
        hashMap.put("key1", "value 1");
        hashMap.put("abababab", "value 1");

        Iterator<Map.Entry<String, String>> hashMapIterator = hashMap.entrySet().iterator();
        while (hashMapIterator.hasNext()) {
            Map.Entry<String, String> entry = hashMapIterator.next();
            System.out.print("key = " + entry.getKey());
            System.out.println(", value = " + entry.getValue());
        }

        for (String key: hashMap.keySet()) {
            System.out.println("Key = " + key);
        }

        for (String value: hashMap.values()) {
            System.out.println("Value = " + value);
        }
    }
}
