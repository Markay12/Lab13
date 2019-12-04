import java.util.*;
import java.io.*;

public class Lab13{
    public static void main(String[] args) throws FileNotFoundException {

        int evenSum = 0;
        int oddSum = 0;

        
        File data = new File("Data1.txt");

        Scanner in = new Scanner(data);

        while(in.hasNextLine()){
          
            String line = in.nextLine();
            int thisNum = Integer.parseInt(line);

            if(thisNum % 2 == 0) { evenSum += thisNum; }
            else { oddSum += thisNum; }

        }

        System.out.printf("Sum of the Odd Numbers: %d\n", oddSum);
        System.out.printf("Sum of the Even Numbers: %d\n", evenSum);
        
        System.out.printf("Difference of sum of even and sum of odd: %d\n\n", Math.abs(oddSum - evenSum));


        in.close();

    }
}