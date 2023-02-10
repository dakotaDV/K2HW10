package hw2t2;

import java.util.*;

public class MapTest2 {
    private static final Map<String, List<Integer>> mapFrom = new LinkedHashMap<>();
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
        mapFrom.put("List4",listOne);
        mapFrom.put("List5",listTwo);
        mapFrom.put("List6",listThree);
        mapFrom.put("List7",listThree);
        mapFrom.put("List8",listOne);
        mapFrom.put("List9",listTwo);
        mapFrom.put("List10",listThree);

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



