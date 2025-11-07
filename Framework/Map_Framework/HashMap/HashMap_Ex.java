package Framework.Map_Framework.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_Ex {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<String,Integer>();
        m.put("Rama",28);
        m.put("Sita",24);
        m.put("Ravan",25);
        m.put("Laxman",30);

        Set<String> s = m.keySet();
        for(String str : s) System.out.println(str+"="+m.get(str));
        
    }
    
}
