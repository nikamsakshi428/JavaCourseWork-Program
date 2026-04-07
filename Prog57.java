public class Prog57 {
    public static void main(String[] args) {
        GCExample obj = new GCExample();
        obj = null; // Remove reference

        System.gc(); 

        System.out.println("Garbage Collection called.");
    }
}