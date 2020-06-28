import java.util.Scanner;
import java.io.*;

public class CountryCapitalDemo {
    public static void main(String[] args) throws IOException{
        // extracting data from file
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the filename to read from: ");
        String filename = keyboard.nextLine();

        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        CountryCapitalList sepCC = new CountryCapitalList();
        String country, capital;
        CountryCapital cc=null;

        while (inputFile.hasNext())
        {
            country = inputFile.nextLine();
            capital = inputFile.nextLine();
            cc = new CountryCapital(country,capital);
            sepCC.add(cc);
        }

        inputFile.close();

        String play, currCo, currCap, answer;
        CountryCapital currCC;
        int score = 0, total = 0;
        System.out.print("Welcome to the Country-Capital Quiz\n");
        // loops as long as the play is not "no"
        do {
            System.out.print("Play? ");
            play = keyboard.next().toLowerCase();
            // when they want to play
            if(play.equals("yes")){
                // finding a random country and capital
                currCC = sepCC.randCC((int)(Math.random() * (sepCC.size()-1) + 0));
                currCap = currCC.getCapital();
                currCo = currCC.getCountry();
                System.out.print("What is the capital of "+currCo+"?\n");
                answer = keyboard.next(); // answer to country capital
                if(answer.equals(currCap)){ // if correct
                    System.out.print("Correct. ");
                    score += 1;
                }
                else{ // if incorrect
                    System.out.print("Incorrect. The correct answer is "+currCap+". ");
                }
                total += 1;
            }
        }while(!play.equals("no"));

        // output result
        System.out.printf("\nGame over.\nGame Stats:\nQuestions played: %d; Correct answers: %d; Score: %.2f",
                total, score, ((double)score/(double)total)*100);
        System.out.print("%");

    }
}
