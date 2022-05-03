package myexception;

public class CustomException {
    public static void main(String[] args) {
        try {
            System.out.println("before parseint");
            String str = "123";
            // str = "abc";
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}

