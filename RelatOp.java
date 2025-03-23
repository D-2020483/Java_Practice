public class RelatOp 
{
    public static void main(String[] args) 
    {
        // Relational Operaters we use to compare values 
        /*  "<" = less than
         *  ">" = greterthsn
         *  "==" = double equal to compare two values
         *  "!=" = not equals to
         * 
        */
         int x = 4;
         int y = 6;
         int z =6;

         double a = 12.345;
         double b = 13.456;

         //intiger
         boolean result = x < y;
         boolean ans = x > y;   
         boolean ans1 = y == z;
         boolean ans2 = x != y;

         //double
         boolean res = a <= b;
         boolean res1 = a > b;

         //intiger
         System.out.println(result);
         System.out.println(ans);
         System.out.println(ans1);
         System.out.println(ans2);

         //double
         System.out.println(res);
         System.out.println(res1);
    }
}
