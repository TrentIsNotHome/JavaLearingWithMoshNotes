//conditions
//===========
// if temp is grater that 30
// it's a hot day
// drink plenty of water
//otherwise, if it's between 20 and 30
// it's a nice day
// otherwise
// it's cold
package codingwithmosh;

public class IfStatements {

    public static void main(String[] args) {
        int temp = 32;
        if (temp > 30) {
            System.out.println("it's a hot day");
            System.out.println("Drink water :)");
        }
        else if (temp > 20)
            System.out.println("It's a nice  day");
        else
            System.out.println("cold day");

    }
}
