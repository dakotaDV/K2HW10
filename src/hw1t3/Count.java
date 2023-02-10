package hw1t3;//Создайте коллекцию Map<String, Integer>. Заполните ее произвольными значениями.
// Напишите метод, который принимает строку (ключ) и целое число (значение) и пытается добавить ее в коллекцию по логике:
//- Если такого ключа нет, то просто добавляет данные в коллекцию.
//- Если такой ключ уже есть и значения совпадают, то необходимо бросить исключение.
//- Если такой ключ уже есть, но значения разные, то обновите целое число в коллекции.

import java.util.HashMap;
import java.util.Map;

public class Count {
private static Map<String, Integer> map = new HashMap<>();


    public static void main(String[] args) {

        map.put("str1", 5);
        map.put("str2", 1);
        map.put("str1", 7);
        System.out.println(map);
    }
    public  static void addToMap(String str, Integer count){
        if(map.containsKey(str) && map.get(str).equals(count)){
            throw new RuntimeException("We cannot add this str ");
        }
        map.put(str, count);
    }
}