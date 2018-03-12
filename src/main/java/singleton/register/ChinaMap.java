package singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ChinaMap {
    private ChinaMap(){}
    private static Map<String,Object> map = new ConcurrentHashMap<String,Object>();
    public static Object getInstance(String name){
        if(!map.containsKey(name)){
            Object obj = null;
            try {
                obj = Class.forName(name).newInstance();
                map.putIfAbsent(name,obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return obj;
        }else{
            return map.get(name);
        }
    }
}
