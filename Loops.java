public class Loops 
{
    public static void main(String[] args) 
    {

        //repeate some statement in multiple times
        // loops - while loop, Do While Loop, For Loop

        //100 - condition 


        // i need to print this in multiple times 
        // at first we need to add the statement inside of the block
        //we need to use while keyword with the condition if the condition is ture the statement will executed

        //for additional if you need to concatinate two different things we can use + 

        //Print numbers from 1 to 10 
        //inside of each nub i need to have 3 "Hi"

        int n =1 ;

        while(n<=10)
        {
            System.out.println(n);

            int a = 1;
            while(a <= 3)
            {
              System.out.println("Hi");
              a++;
            }

            n++;//post increment
        }
    }
}
