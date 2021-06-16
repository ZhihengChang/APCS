public class Unit1 {
    public static void main(String[] args){
        //int, double, string
        //type name = value;
        int num1 = 1;
        double d = 2.2;
        String s = "3";

        // 1. ()
        // 2. * / %
        // 3. + -

        System.out.println(1+2);
        System.out.println(  (1+2)*3  );
        System.out.println(  1+2*3  );
        System.out.println(  4*1+2*3  );
        System.out.println(  4/2/2+2  );
        System.out.println(  10-6/3+2  );
        System.out.println(  10%2  );
        System.out.println(  10/2%2  );
        System.out.println(  10/3.0  );

        System.out.println(  17 / 5.0 % 3 + 17 * 5 % 3  );
        String str1 = "hello ";
        int str2 = 13; // "13"; Integer.toString()

        String n1 = "11";
        String n2 = "4";
        System.out.println(n1 + n2);

        double x = 2.5;
        double y = 1.99;
        System.out.println((int)(x/y) + (int)(x*y));

//        String x = "123";
//        Integer x = "123";
//        Object x = "123";
//        String[] x = {"123"};
//        all of the above will compile with no error;
    }
}
