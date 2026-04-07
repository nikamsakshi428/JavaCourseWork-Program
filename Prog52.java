
interface MyInterface {
    void showMessage();
}


class MyClass implements MyInterface {
    public void showMessage() {
        System.out.println("Hello gutentag!");
    }
}

public class Prog52 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showMessage(); 
    }
}