package Framework.Map_Framework.LinkedHashMap;

 
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap_Ex {
    public static void main(String[] args) {
        Map<Character, String> m = new LinkedHashMap<Character, String> ();
        m.put('O',"Killing");
        m.put('G',"It");
        m.put('M',"Up");
        m.put('I',"Brutal");

        Set<Entry<Character,String>> s = m.entrySet();

        for(Entry<Character,String> str : s) System.out.println(str);
        
    
}
}

