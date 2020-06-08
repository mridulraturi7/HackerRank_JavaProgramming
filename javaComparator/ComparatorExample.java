package javaComparator;

import java.util.*;
import java.lang.Integer;

// Write your Checker class here
class Checker implements Comparator<Player>
{
    public int compare(Player a, Player b)
    {
        int s1 = a.score;
        int s2 = b.score;

        String str1 = a.name;
        String str2 = b.name;

        int sCompare = Integer.compare(s2,s1);

        if(sCompare == 0)
        {
            return str1.compareTo(str2);
        }

        else 
        {
            return sCompare;
        }

    }
}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class ComparatorExample {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
    
}