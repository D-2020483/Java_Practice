class Bank
{
    //inside of the same class can access the data cannot access outside of the class directly 
    //every time that instance variable created make it private  
    private int passwords;
    private String accHolder;

    //the way to access those private data using methods it mens some one need to be ask for the data to access
    public int getPassword()
    {
        return passwords;
    }

    public String getAccholder()
    {
        return accHolder;
    }

    //to set data to the variable we can use set method
    public void SetPassword(int x)
    {
        passwords = x;
    }

    public void SetAccountholder(String y)
    {
        accHolder = y;
    }
}
public class Encap 
{
    public static void main(String[] args) 
    {
        Bank bank = new Bank();
        bank.SetAccountholder("Dinithi"); 
        bank.SetPassword(11); 

        System.out.println(bank.getPassword() + " : " + bank.getAccholder());
    }
}
