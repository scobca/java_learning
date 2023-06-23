package try4.utilities;

public class Printer {
    public static String text = "";
    public Printer(String text) {
        this.text = text;
    }

    public static String print() {
        System.out.println(text);
        return text;
    }


}
