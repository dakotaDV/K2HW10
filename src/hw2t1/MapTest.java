package hw2t1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MapTest {
    private static final Map<String, List<Integer>>mapFrom = new HashMap<>();
    private static final Map<String, Integer>mapTo = new HashMap<>();


    public static void main(String[] args) {
        Random random = new Random();
        var listOne = new java.util.ArrayList<>(List.of(1,4,5,6,18));
        for (int i = 0; i < 15 ; i++) {
        listOne.add(random.nextInt(10));
        }
        var listTwo = new java.util.ArrayList<>(List.of(1,4,5,6,18));
        for (int i = 0; i < 15 ; i++) {
            listTwo.add(random.nextInt(10));
        }
        var listThree = new java.util.ArrayList<>(List.of(1,4,5,6,18));
        for (int i = 0; i < 15 ; i++) {
            listThree.add(random.nextInt(10));
        }
        mapFrom.put("List1",listOne);
        mapFrom.put("List2",listTwo);
        mapFrom.put("List3",listThree);
        System.out.println(mapFrom);

        for(var keySet : mapFrom.keySet()){
            Integer sum = 0;
            List<Integer>tempList = mapFrom.get(keySet);
            for(Integer integerSum : tempList){
                sum += integerSum;
            }
            mapTo.put(keySet, sum);
        }
        System.out.println(mapTo);

    }
}

