package lesson4;

import java.util.HashMap;

public class TelBook {

    private static HashMap<String,String> hm = new HashMap<>();
    public void add(String phone, String f){hm.put(phone,f);};
    public static String get(String fio){
        if(hm.containsValue(fio)){
            String result = "Phone: ";
            for(String key: hm.keySet()){
                if(hm.get(key).equals(fio)) result += key + "; ";
            }
            return result;
        } else return "FIO not found";
    }


}
