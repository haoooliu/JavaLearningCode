package myexception;

public class RegistScore {
    private int num;
    public void RegistScore(int i) throws MyException{
        if ( i >= 0 && i <= 100 ){
            num = i;
        }else{
            throw new MyException("Score cannot less then 0 or greater then 100!");
        }
    }
    public void showScore(){
        System.out.println("The student's score is " + num);
    }
}
