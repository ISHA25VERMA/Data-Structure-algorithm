package DsAlgo.PBLJ_LAB.UNIT2;

import DsAlgo.BinarySearch.RotationCountInRA;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class GroupCards {
    public static void main(String[] args) {
        Map<Character, ArrayList<Card>> map = new TreeMap<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total number of cards : ");
        int n = scan.nextInt();
        for(int i=0; i<n; i++) {
            System.out.println("Enter a card:");
            char ch = scan.next().charAt(0);
            int num = scan.nextInt();

            if(map.containsKey(ch)) {
                map.get(ch).add(new Card(ch, num));
            }else{
                map.put(ch, new ArrayList<>());
                map.get(ch).add(new Card(ch, num));
            }
        }

        System.out.println("Distinct symbols are : ");
        for (Character cards : map.keySet() ){
            System.out.print(cards+" ");
        }
        System.out.println();
        for (Character cards : map.keySet() ){
            System.out.println("Cards in "+cards+" set are");
            int num = 0;
            int sum = 0;
            for (Card card : map.get(cards)){
                System.out.println(card.symbol+" "+card.value);
                num++;
                sum += card.value;
            }
            System.out.println("Number of cards : "+num);
            System.out.println("Sum of Numbers :"+sum);
        }
    }
}
