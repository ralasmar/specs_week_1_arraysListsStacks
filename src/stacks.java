import java.util.Stack;

public class stacks {
    public static void main(String[] args){
        //stack extends the vector class. which means stacks are inherently synchronized
        Stack<String> names = new Stack<>();

        names.push("Adam");
        names.push("Joe");
        names.push("Ana");
        names.push("Daniel");
        names.push("Katy");

        while(!names.isEmpty()){
            //remove last item
            System.out.println(names.pop());
        }
    }
}