import java.util.TreeMap;

public class RomanNunber {
    private final static TreeMap<Integer,String> map = new TreeMap<Integer,String>();
    static {
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
        map.put(0,"O");

    } public static final String toROman(int a){
        int l = map.floorKey(a);
        if(a==l){
            return map.get(a);
        }else
            return map.get(a)+toROman(a-l);
    }

}
