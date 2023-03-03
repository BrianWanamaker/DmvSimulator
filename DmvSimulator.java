import java.util.Random;
import java.util.Scanner;

public class DmvSimulator
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        Random ran = new Random();

        System.out.println("Weclome to the DMV!");
        
        int num = (ran.nextInt(199)+1);
        System.out.println("Your number is: " + num );

        int numCalled = num+1;
        
        while(numCalled!=num)
        {
            System.out.println("Number " + numCalled + " please come to the front!");
            numCalled++;
            System.out.println("Press enter to continue");
            in.nextLine();
            if(numCalled==201)
            {
                numCalled=1;
            }
        }
        System.out.println("Number " + numCalled + " please come to the front!");
        System.out.println("Press enter to continue");
        in.nextLine();
        System.out.println("HEY GET OUT OF MY OFFICE YOU DONT HAVE UR DOCUMENTATION!!!");
        System.out.println("HAHAHHAHAHAHAH HEHEHE HAAHAHHA HEEHAW");
        

    }
}