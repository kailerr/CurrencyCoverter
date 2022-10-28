import java.util.Scanner; 
public class Currency_Converter {

public static void main(String[] args) { 

    Scanner scan = new Scanner (System.in);

    System.out.println("Which currency do you want to convert USD to?");
    System.out.println("1. USD to Japanese ¥?");
    System.out.println("2. USD to Chinese ¥?");
    System.out.println("3. USD to Korean ₩?");
    int questionNum = scan.nextInt(); 
    switch(questionNum) 
    {
        case 1: {
        System.out.print("How much USD do you want to convert to Japanese currency?");
        double usd = scan.nextDouble(); 

        if (usd>0)
        {
            System.out.println("The conversion from " + usd + "to Japanese currency is " + usd*146.73);
        }
        else
        {
            System.out.println("Please enter a valid number.");
        } 
        
        }
        break; 


        case 2: {
        System.out.print("How much USD do you want to convert to Chinese currency?");
        double usdTwo = scan.nextDouble(); 

        if (usdTwo>0)
        {
            System.out.println("The conversion from " + usdTwo + "to Japanese currency is " + usdTwo*7.24);
        }
        else
        {
            System.out.println("Please enter a valid number.");
        } 
        
        }
        break;


        case 3: {
        System.out.print("How much USD do you want to convert to Korean currency?");
        double usdThree = scan.nextDouble(); 

        if (usdThree>0)
        {
            System.out.println("The conversion from " + usdThree + "to Japanese currency is " + usdThree*1423.06);
        }
        else
        {
            System.out.println("Please enter a valid number.");
        } 
    }
        break;

    }
scan.close(); 



}
}