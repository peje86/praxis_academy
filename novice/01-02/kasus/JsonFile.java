// package com.nursalim.zone.java.json;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
 
public class JsonFile {
    public static void main(String[] args) {
 
    JSONObject obj = new JSONObject();
    obj.put("nama", "Nursalim");
    obj.put("gender", "Laki-Laki");
    obj.put("umur", new Integer(20));
 
    JSONArray listHobbies = new JSONArray();
    listHobbies.add("Makan");
    listHobbies.add("Tidur");
    listHobbies.add("Jalan-Jalan");
 
    obj.put("hobi", listHobbies);
 
    try {
 
        FileWriter file = new FileWriter("d:\\json\\simplejson.json");
        file.write(obj.toJSONString());
        file.flush();
        file.close();
 
    } catch (IOException e) {
        e.printStackTrace();
    }
 
    System.out.print(obj);
 
     }
 
}