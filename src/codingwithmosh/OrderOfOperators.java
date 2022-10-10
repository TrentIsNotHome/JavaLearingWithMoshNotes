package codingwithmosh;

public class OrderOfOperators {

    public static void main(String[] args) {
        // int x = 10 + 3 * 2;
        // System.out.println(x);

        // this will be 16 because the equation uses
        // 3 * 2 first because * and / have
        // high proitory than + and -

        // To fix this we need to add () in the equation
        // in order to add 10 + 3 first

         int x = (10 + 3) * 2;
        System.out.println(x);

        // Order of Operators
        // 1.()
        // 2.* /
        // 3.+ -
    }
}
