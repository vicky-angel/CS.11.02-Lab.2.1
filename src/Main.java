/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {

        int a = 25;
        int b = 4;
        int sum = add(a, b);
        System.out.println(sum);
        int c = 32;
        int d = 100;
        double e = -50.6;
        double f = 50.3;
        int sum2 = add(a, b, c, d);
        System.out.println(sum2);
        String name = "Bird";
        String morning = morningGreeting(name);
        System.out.println(morning);
        String afternoon = afternoonGreeting(name);
        System.out.println(afternoon);
        String text = "hehehaha";
        String tripletext = triple(text);
        System.out.println(tripletext);
        double halfvalue = half(a);
        System.out.println(halfvalue);
        int positiveint = roundPositiveValueToNearestInteger(f);
        System.out.println(positiveint);
        int negativeint = roundNegativeValueToNearestInteger(e);
        System.out.println(negativeint);
    }

    // 1. add

    public static int add (int a, int b){
        return a+b;
    }

    // 2. add
    public static int add (int a, int b, int c, int d){
        return a+b+c+d;
    }

    // 3. morningGreeting
    public static String morningGreeting(String name){
        return "Good Morning, " + name + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
        return "Good Afternoon, " + name + "!";
    }

    // 5. triple
    public static String triple(String text){
        return text + text + text;
    }

    // 6. half
    public static double half(int a){
        return (double) a / 2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double f) {
        return (int) (f + 0.5);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double e){
        return (int) (e-0.5);
    }
}

