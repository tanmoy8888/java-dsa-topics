package topics.basics.operators;

public class Modulas {
    public static void main(String[] args) {
        // Rule 1 : If a > b then a%b = reminder
        int a =10;
        int b =7;
        System.out.println(a%b); // 3
        // Rule 2 : if a < b a%b = reminder
        int a1 =7;
        int b1 =10;
        System.out.println(a1%b1); // 7 [Because if b is greater than a then it will always return small number which is a in this case]
        // Rule 3 : it does not matter what is the signage of b ex. a % -b = reminder
        int a2 =10;
        int b2 =-7;
        System.out.println(a2%b2); // 3 [It does not matter whether b is a negative or positive number]
        // Rule 4 : The signage if reminder matter only on a NOT ON b
        int a3 =-12;
        int b3 =-10;
        System.out.println(a3%b3); // -2

    }
}
