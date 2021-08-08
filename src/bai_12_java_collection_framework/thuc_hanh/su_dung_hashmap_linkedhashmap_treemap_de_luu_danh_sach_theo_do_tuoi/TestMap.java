package bai_12_java_collection_framework.thuc_hanh.su_dung_hashmap_linkedhashmap_treemap_de_luu_danh_sach_theo_do_tuoi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Khoa", 21);
        hashMap.put("Kien", 20);
        hashMap.put("Nhung", 25);
        hashMap.put("Hoa", 26);
        hashMap.put("Binh", 28);
        System.out.println("Display entries in HashMap:");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.57f, true);
        linkedHashMap.put("Khoa", 21);
        linkedHashMap.put("Kien", 20);
        linkedHashMap.put("Nhung", 25);
        linkedHashMap.put("Hoa", 26);
        linkedHashMap.put("Binh", 28);
        System.out.println("\nThe age for " + "Binh is " + linkedHashMap.get("Binh"));


    }
}
