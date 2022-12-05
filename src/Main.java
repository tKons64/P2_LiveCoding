public class Main {
    public static void main(String[] args) {

        String exampleString = "1234";
        System.out.println("Это строка - " + exampleString + ", полидром?, " + thisStringPolydrom(exampleString));
    }

    public static boolean thisStringPolydrom(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}