package SwapTest;

public class SwapMain {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        SwapMain sw = new SwapMain();
        a = sw.method(a,10);
        b = sw.method(b,10);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
    public int method(int a1, int b1){
        return a1*b1;
    }
}
