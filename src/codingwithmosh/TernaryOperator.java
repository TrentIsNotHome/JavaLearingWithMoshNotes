package codingwithmosh;

public class TernaryOperator {

    public static void main(String[] args) {
        int income = 120_000;
        // "?" if the condition is true the value will be First
        // ":" if the condition is false the vale will be Economy
        String className = income > 100_000 ? "First" : "Economy";
        System.out.println(className);
    }
}
