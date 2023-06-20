package DsAlgo.PBLJ_LAB.UNIT2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


class Card{
    char symbol;
    int value;

    public Card(char symbol, int value){
        this.symbol = symbol;
        this.value = value;
    }

    @Override
    public int hashCode() {
        return this.symbol;
    }

    @Override
    public boolean equals(Object obj) {
        Card card = (Card) obj;
        if(this.symbol == card.symbol){
            return true;
        }
        return false;
    }
}
public class CardCollection{
    public static void main(String[] args) {

        Set<Card> collection = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total no. of cards: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            System.out.println("Enter a card:");
            char ch = sc.next().charAt(0);
            int num = sc.nextInt();
            collection.add(new Card(ch, num));
        }


        for (Card card : collection){
            System.out.println(card.symbol+" "+card.value);
        }
    }
}
