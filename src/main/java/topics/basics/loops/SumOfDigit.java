package topics.basics.loops;

public class SumOfDigit {
    public static void main(String[] args) {
        int number = 123;
        int sum = 0;
        int reminder = 0;
        while (number != 0) {
           if(number < 10){
               sum = sum+number;
               break;
           }else {
               reminder = number%10;
               sum = sum+reminder;
               number /=10;
           }
        }
        System.out.println("sum = " + sum);
    }
}
