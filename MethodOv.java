class Calculator
    {
        //this add only take two parameters
        public int add(int num1, int num2)
        {
            return num1 + num2;
        } 

        //this add only take three parameters
        public int add(int num1, int num2 ,int num3)
        {
            return num1 + num2 + num3;
        }

        //in methord Overloading there are different number of paramiters in same method or same number of parameters different types using same name 
    }
    

public class MethodOv 
{
    public static void main(St[] args) 
    {

        Calculator obj = new Calculator();
        int r1 = obj.add(4, 7);
        System.out.println(r1);

    
    }
}
