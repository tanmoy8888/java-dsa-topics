package topics.variables;

public class Variables {
    public static void main(String[] args) {
        int x =4;
        System.out.println(x + 7);
        // There are below rules of variables
        // 1 : variables name can not be start with a number
        // 2 : variables can start with any alphabets and _ or $
        // 3 : variables can not contain special chars like (! ,@ , # , ^ , % etc.)
        // 4 : spaces are not allowed while giving a name in a variable
        // 5 : keywords are not allowed as a variable name
        System.out.println("hello"+5+4);
        System.out.println(5+4+"hello");
        System.out.println((5+4)+"hello");
        System.out.println("hello"+(5+4));
    }
}
