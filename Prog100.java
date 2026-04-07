class A {
    void show() {
        System.out.println("A");
    }
}

class Prog100 extends A {
    void show() {
        System.out.println("Prog is working");
    }
    public static void main(String[] args) {
        A obj = new Prog();
        obj.show();
    }
}