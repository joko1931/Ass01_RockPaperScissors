import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        String trash = "";
        int numTrash = 0;
        boolean playAgain = false;
        String yesNo = "";

        do
        {
            System.out.println("Player A enter move [R P S]: ");

            if (in.hasNextLine())
            {
                String playerA = in.nextLine();
                in.nextLine();

                System.out.println("Player B enter move [R P S]");

                if (in.hasNextLine())
                {
                    String playerB = in.nextLine();
                    in.nextLine();

                    if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("R"))
                    {
                        System.out.println("Rock vs. Rock, it's a tie!");
                    }
                    else if(playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("P"))
                    {
                        System.out.println("Paper covers Rock, player B wins!");
                    }
                    else if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S"))
                    {
                        System.out.println("Rock breaks scissors, player A wins!");
                    }
                    else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R"))
                    {
                        System.out.println("Paper covers Rock, player A wins!");
                    }
                    else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("S"))
                    {
                        System.out.println("Scissors cuts Paper, player B wins!");
                    }
                    else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("P"))
                    {
                        System.out.println("Paper vs. Paper, it's a tie!");
                    }
                    else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P"))
                    {
                        System.out.println("Scissors cuts Paper, player A wins!");
                    }
                    else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("R"))
                    {
                        System.out.println("Rock breaks Scissors , player B wins!");
                    }
                    else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("S"))
                    {
                        System.out.println("Scissors vs. Scissors, it's a tie!");
                    }
                    else
                    {
                        System.out.println("Please enter valid inputs");
                    }
                    do
                    {
                        System.out.println("Do you want to play again [Y/N]?");

                        if (in.hasNextLine())
                        {
                            yesNo = in.nextLine();
                            if (yesNo.equalsIgnoreCase("N"))
                            {
                                done = true;
                                playAgain = true;
                            }
                            else
                            {
                                playAgain = true;
                            }
                        }
                        else
                        {
                            System.out.println("Please enter correct value");
                        }
                    }while(!playAgain);
                }
                else if (in.hasNextInt())
                {
                    System.out.println("You entered " + numTrash + " which isn't a valid input");
                }
                else
                {
                    System.out.println("You entered " + trash + " which isn't a valid input");
                }
            }
        }while(!done);
    }
}