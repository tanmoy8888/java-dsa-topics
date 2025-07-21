package topics.basics.loops;

public class SumOfDigit {
    public static void main(String[] args) {
        int number = 123;
        int sum = 0;
        int reminder = 0;
        while (number != 0) {
           if(number < 10){
               System.out.println("In if....");
               sum = sum+number;
               break;
           }else {
               sum = number%10;
               System.out.println("sum = " + sum);
               sum = sum+number;
               number /=10;
               System.out.println("number = " + number);
           }
        }
        System.out.println("sum = " + sum);
    }
}
