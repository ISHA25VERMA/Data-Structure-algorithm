package DsAlgo.Recursions.Arrays;

import java.util.ArrayList;

public class LinearSearchOfMultipleOccurrences {
    public static void main(String[] args) {
        int []arr = {2, 3,2, 56, 2, 34,2 ,2, 78, 98, 2};
        searchMultiple(arr, 2,0);
        System.out.println(list);
        ArrayList<Integer> ListOfIndex = new ArrayList<>();
        System.out.println(searchMultiple(arr, 2, 0, ListOfIndex));
        System.out.println(searchMultipleWithoutListArgumet(arr, 2, 0));
    }
    static ArrayList<Integer> list = new ArrayList<>();
    public static void searchMultiple(int []arr, int target,int index){

        if (arr[index] == target){
            list.add(index);
        }
        if (index == arr.length-1){
            return;
        }
        searchMultiple(arr, target, index+1);
    }

    public static ArrayList<Integer> searchMultiple(int []arr, int target,int index, ArrayList<Integer> list){
        if(arr[index] == target){
            list.add(index);
        }
        if (index == arr.length-1){
            return list;
        }
        return searchMultiple(arr,target,index+1,list);
    };

    public static ArrayList<Integer> searchMultipleWithoutListArgumet(int []arr, int target , int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (arr[index] == target){
            list.add(index);
        }
        if (index == arr.length -1){
            return list;
        }
        list.addAll(searchMultipleWithoutListArgumet(arr, target, index+1));
        return list;
    }
}
