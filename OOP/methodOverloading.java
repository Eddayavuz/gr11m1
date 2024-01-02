 /*
  * Each sum method has a different method signature
  * At least one of the following is true for any two sum methods:
  * 1. The types of parameters are different
  * 2. The ordering of the parameters are different
  * 3. The total number of parameters are different
  */

 public class methodOverloading {
    public static void main(String[] args) {
        int intValue = 3;
        double doubleValue = 2.5;
        System.out.println(sum(intValue, intValue));
        System.out.println(sum(intValue, doubleValue));
        System.out.println(sum(doubleValue, intValue));
        System.out.println(sum(doubleValue, doubleValue));
        System.out.println(sum(intValue, intValue, intValue));
    }

    public static int sum(int one, int two)
    {
        return one + two;
    }

    public static double sum(int one, double two)
    {
        return one + two;
    }

    public static double sum(double one, int two)
    {
        return one + two;
    }

    public static double sum(double one, double two)
    {
        return one + two;
    }

    public static int sum(int one, int two, int three)
    {
        return one + two + three;
    }

}