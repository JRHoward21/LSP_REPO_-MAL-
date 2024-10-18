package org.howard.edu.lsp.midterm.question4;

/*
In the example above, these two HashMaps have two key/value pairs in common, namely: "Mary"/"Ecstatic" and "Bob"/"Happy". Note that although the key "Felix" is in both HashMaps, the associated value with this key is different in the two maps (hence this does not count as a key/value pair that is common to both HashMaps). Similarly, just having the same value without the same key (such as the value "Fine" which is mapped to by different keys in the two different HashMaps) would also not count as a common key/value pair between the two HashMaps. 

Your job is to write a static method:
public class MapUtilities {
    public static int commonKeyValuePairs(
        HashMap<String, String> map1,
        HashMap<String, String> map2){
// implementation
    }
}
The above should return the number of common key/value pairs between the two HashMaps.  In addition, your implementation should return 0 if either or both maps passed in are empty.
*/

import java.util.HashMap;

public class MapUtilities {
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        // Check for empty maps and return 0
        if (map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }

        // Count the number of common key/value pairs
        int count = 0;
        for (String key : map1.keySet()) {
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                count++;
            }
        }
        return count;
    }
}
