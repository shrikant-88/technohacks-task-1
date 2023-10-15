package Mini_Calculator;

import java.util.Scanner;

public class mini_Calculator {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter first number : ");
    float a = sc.nextFloat();
    System.out.print("enter operator(+ , - , / , * ): ");
    String oprt = sc.next();
    System.out.print("enter second number : ");
    float b = sc.nextFloat();

    sc.close();

    if(oprt.equals("+")){
        System.out.println("sum = "+ (a+b));
    }
    else if(oprt.equals("-")){
        System.out.println("sub = "+(a-b));
    }
    else if(oprt.equals("*")){
        System.out.println("multiply = "+(a*b));
    }
    else if(oprt.equals("/")){
        System.out.println("divide = "+(a/b));
    }
    else{
        System.out.println("enter correct operator (+,-,*,/)--> you entered a wrong operator");
    }
   }
}
