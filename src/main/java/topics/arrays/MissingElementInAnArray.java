package topics.arrays;

public class MissingElementInAnArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6};
        int n =6;
        int sumOfN = n*(n+1)/2;
        int sumOfArray = ((arr.length-1)*((arr.length-1)+1))/2;
        int missing = sumOfN-sumOfArray;
        System.out.println("missing = " + missing);
    }
}
