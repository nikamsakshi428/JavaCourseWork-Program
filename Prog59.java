public class Prog59 {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec("notepad");
            System.out.println("Notepad opened.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}