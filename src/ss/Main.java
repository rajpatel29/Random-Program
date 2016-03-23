package ss;

import java.util.HashMap;
import java.util.Map;

class Main {

	   static Map<Key, Object> table = new HashMap<Key, Object>();

	   static public void addToMap(int val, Object obj) {

	       Key key = new Key(val);

	       table.put(key, obj);

	   }

	   static public Object getObj(int val) {

	       Key key = new Key(val);

	       return table.get(key);

	   }

	}
