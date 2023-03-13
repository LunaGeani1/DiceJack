import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int roll1= rollDice();
        int roll2=rollDice();
        int roll3=rollDice();
        System.out.println("Enter 3 numbers between 1 and 6:");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int num3=scan.nextInt();

        if(num1<1 || num2<1 || num3<1 || num1>6 || num2>6 || num3>6){
            System.out.println("Numerele introduse sunt invalide!");
            System.exit(0);
        }
        int sumNumbers=num1+num2+num3;
        int sumDiceRolls=roll1+roll2+roll3;
        System.out.println("Dice sum= "+sumDiceRolls+". Number sum= "+sumNumbers+".");
        if(checkWin(sumDiceRolls, sumNumbers)){
            System.out.println("You win!");
        }else System.out.println("You lose!");
        scan.close();
        }
    

    
    public static int rollDice(){
        double randomNumber=Math.random()*6;
        randomNumber+=1;
        return (int)randomNumber;
       } 
       public static boolean checkWin(int sumDiceRolls,int sumNumbers){
        return(sumNumbers>sumDiceRolls && sumNumbers - sumDiceRolls<3);
       }  
}
