
class Computer
{
    public void playMusic()
    {
        System.out.println("music playing");
    }

    public String getMeAPen(int cost)
    {
        return"Pen";
    }
}


public class Examp {
    public static void main(String[] args) 
    {
        Computer obj = new Computer();
        obj.playMusic();
        String ss = obj.getMeAPen(100);
        System.out.println(ss);      
    }
}
