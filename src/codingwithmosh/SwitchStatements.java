package codingwithmosh;

public class SwitchStatements {

    public static void main(String[] args) {
        String role = "admin";

        switch (role) {
            case "admin":
                System.out.println("you are admin");
                break;

            case  "mod":
                    System.out.println("you are mod");
                    break;

            default:
                System.out.println("you are a guest");
        }
        // differnt way
        if (role == "admin")
            System.out.println("you are admin");
        else if (role == "mod")
            System.out.println("you are mod");
        else
            System.out.println("you are a guest");
    }
}
