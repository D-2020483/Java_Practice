public class CondSt 
{
    public static void main(String[] args) 
    {
        //the condin is i need to print "Helow" as the output when the x variable value is gretter than 20

        int x = 25;

        // condition is true then the output is "Helow"
        if(x > 20 || x >= 30 )
        
            System.out.println("Helow");
        else
            System.out.println("bye");


        /*  the w value is 5  and z value is 7 i need to print maximum of this two if w is grether than z 
        i need to print w value if not i need to print z value     */ 

        int w = 5;
        int z = 7;

        //inside of a condition have multiple statements need to use {}
        if(w > z )
            System.out.println(w);
        else    
            System.out.println(z);

        // need to check the gretest value those 3 variables
        int a = 8;
        int b = 7;
        int c = 6;

        if(a > b && a > c)

            System.out.println(a);

        else if(b > c)

            System.out.println(b);
        else 
             
             System.out.println(c);
        
    }
}
