class Student
{
    int rollno;
    St name;
    int marks;
}
public class Array 
{

    public static void main(St[] args) 
    {
        /*int st [] = {3,7,2,4}; //print the specific number from the array we need to call the index number of the array
        //st[3] = 10;// change the number of specific index
        int st [] = new int[4]; //create a empty array
         st [0] = 4;
         st [1] = 6;
         st [2] = 10;
         st [3] = 12;  */


         Student s1 = new Student();
         s1.rollno = 1;
         s1.name   = "Navin";
         s1.marks  = 55;

         Student s2 = new Student();
         s1.rollno = 2;
         s1.name   = "Dinithi";
         s1.marks  = 67;

         Student s3 = new Student();
         s1.rollno = 3;
         s1.name   = "Imalsha";
         s1.marks  = 85;

        /*for(int a = 0 ; a <st.length; a++)
        {
            System.out.println(st[a]);
        }*/

        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for(int a = 0 ; a <student.length; a++)
        {
            System.out.println(student[a].name + " : "+student[a].marks);
        }
    }
}