public class Main {
    public static void main(String[] args) {

        //задача №1
        String exampleString = "1234";
        System.out.println("Это строка - *" + exampleString + "*, полидром?, " + thisStringPolydrom(exampleString));

        //задача №2
        exampleString = "123 456 7890";
        System.out.println("Исходная строка - *" + exampleString + "*, и эта строка без пробелов - *" + delSpace(exampleString) + "*");

    }

    public static boolean thisStringPolydrom(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static String delSpace(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                newString = newString + s.charAt(i);
            }
        }
        return newString;
    }
}