import java.util.ArrayList;
import java.util.List;

public class arrayList {
    public static void main(String[] args){
        List<String> names = new ArrayList<>();

        names.add("Kevin");
        names.add("Adam");
        names.add("Ana");

        //random indexing in O(1)
       // System.out.println(names.get(0));

        //insert item into a given index O(N)
        names.add(0, "Daniel");
        names.remove(0);

        //contains will check whether the item is present in the array
        System.out.println(names.contains("Adam"));

        //one dimensional array of objects
        Object[] o = names.toArray();

        //arrays are fast if we manipulate the last item

        //because of the iterable interface
        for(Object s : o)
            System.out.println(s);
    }
}