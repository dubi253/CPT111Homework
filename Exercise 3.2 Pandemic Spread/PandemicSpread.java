import java.util.Scanner;

public class PandemicSpread {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int init, numInfect, population, TotalDay = 1;//init : the initial number of infected persons on day 1. numInfect : the average number of healthy people that one infected person newly infects per day. population : the total number of people in the area.
        init = Integer.parseInt(keyboard.nextLine());
        numInfect = Integer.parseInt(keyboard.nextLine());
        population = Integer.parseInt(keyboard.nextLine());
        while (init < population) {
            init *= (1 + numInfect);
            ++TotalDay;
        }
        System.out.println(TotalDay);
    }
}
