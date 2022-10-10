package codingwithmosh;

public class LogicalOperators {

    public static void main(String[] args) {
        int temp = 22;
        // && is and operators
        boolean isWarm = temp > 20 && temp < 30;
        System.out.println(isWarm);

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        // || is a "or" operators
        // && is a "and" operators
        // ! is a "not"/"false" operators
        boolean isGood = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isGood);

    }
}
