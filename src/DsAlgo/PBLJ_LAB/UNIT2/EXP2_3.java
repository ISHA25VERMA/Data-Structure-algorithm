package DsAlgo.PBLJ_LAB.UNIT2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EXP2_3 {
    static void insert_element(List<String> list, String element){
        list.add(element);
        System.out.println("Item inserted successfully!");
    }
    static void search_element(List<String> list, String element){
        if(list.contains(element)){
            System.out.println("Item found in list");
        }else{
            System.out.println("Item not found in list");
        }
    }
    static void delete_element(List<String> list, String element){
        boolean result = false;
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            String x = (String) itr.next();
            if (x.equals(element)){
                itr.remove();
                result = true;
                break;
            }
        }

        if(result){
            System.out.println(element+" deleted !!");
        }else {
            System.out.println(element+"does not exist");
        }
    }
    static void display_element(List<String> list){
        System.out.println("Items in the list are : ");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            String x = (String) itr.next();
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (true){
            System.out.println("Select operation : \n1. Insert\n2. Search\n3. Delete\n4. Display\n5. Exit");
            int input = scan.nextInt();
            if (input == 1){
                System.out.println("Enter item to insert : ");
                String gh = scan.nextLine();
                String element = scan.nextLine();
                insert_element(list, element);
            }else if (input == 2){
                System.out.println("Enter item to search : ");
                String gh = scan.nextLine();
                String element = scan.nextLine();
                search_element(list, element);
            } else if (input == 3) {
                System.out.println("Enter item to delete : ");
                String gh = scan.nextLine();
                String element = scan.nextLine();
                delete_element(list, element);
            } else if (input == 4) {
                display_element(list);
            } else if (input == 5) {
                break;
            }else {
                System.out.println("Invalid input !!");
            }
        }

    }
}
