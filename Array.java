public class Array 
{

    public static void main(String[] args) 
    {
        //int st [] = {3,7,2,4}; //print the specific number from the array we need to call the index number of the array
        //st[3] = 10;// change the number of specific index
        int st [] = new int[4]; //create a empty array
         st [0] = 4;
         st [1] = 6;
         st [2] = 10;
         st [3] = 12;

        for(int a = 0 ; a <4; a++)
        {
            System.out.println(st[a]);
        }
    }
}