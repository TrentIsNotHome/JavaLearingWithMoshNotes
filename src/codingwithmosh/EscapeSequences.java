package codingwithmosh;

public class EscapeSequences {

    public static void main(String[] args) {
        // c:\windows\...
        String message = "c:\\WIndows\\...";
        String newline = "c:\nWIndows\\...";
        String tab = "c:\tWIndows\\...";
        System.out.println("1 " + message);
        System.out.println("2 " + newline);
        System.out.println("3 " + tab);
    }
}
