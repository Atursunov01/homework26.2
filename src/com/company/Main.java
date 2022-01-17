package com.company;
import java.util.Map;
import java.util.TreeMap;
public class Main {

    private static Object City;

    public static void main(String[] args) {
        // City деген класс тузунуз. (code, name, ...)
        //Эгерде code так сан болсо TreeSetke салыныз.
        //Аларды чонунан кичинесине караган тартипте чыгарыныз.

        TreeMap<Integer, City> map = new TreeMap<>();
        map.put(2, new City(523, "azho"));
        map.put(3, new City(234, "murtaz"));
        map.put(6, new City(345, "sapar"));
        map.put(1, new City(156, "jyrgal"));


        for (Map.Entry iterate : map.entrySet()) {
            System.out.println(iterate.getKey() + " " + iterate.getValue());
        }

        }

    private static TreeMap getCity() {
    }

}
//    City city = new City() {
//        @Override
//        public int compareTo(City o) {
//            return 0;
//        }
//    };
//    @Override
//    public int compareTo (Integer o1,Integer o2) {
//       // int Code = o.getCode();
//        return o2.compareTo(o1); //this.code - Code; //> o.getCode() ? 1 : -1;
//
//    }


