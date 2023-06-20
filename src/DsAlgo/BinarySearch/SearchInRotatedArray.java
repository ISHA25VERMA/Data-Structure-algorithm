package DsAlgo.BinarySearch;

import java.rmi.MarshalException;

public class SearchInRotatedArray {
    public static void main(String[] args) {

    }

    public static int search(int[] arr, int target){
        int pivot = findPivotElement(arr);
        int first = binarySearch(arr, target, 0, pivot);
        int second = binarySearch(arr, target, pivot+1, arr.length-1);

        return Math.max(first, second);
    }

    public static int binarySearch(int[] arr, int target, int start, int end){
        while (start<=end){
            int mid = start + (end-start)/2;
            if (arr[mid] == target){
                return mid;
            }else if(arr[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static int findPivotElement(int[]arr){
        int st = 0;
        int ed = arr.length-1;
        while (st<ed){
            int mid = st + (ed-st)/2;
            if (mid<arr.length-1 && arr[mid+1]<arr[mid]){
                return mid;
            }else if (mid >0 && arr[mid]<arr[mid-1]){
                return mid-1;
            }else if(arr[st]<=arr[mid]){
                st = mid+1;
            }else {
                ed = mid-1;
            }
        }
        return -1;
    }

    public static int findPivotElementWithDuplicateElements(int[]arr){
        int st = 0;
        int ed = arr.length-1;
        while (st<ed){
            int mid = st + (ed-st)/2;
            if (mid<arr.length-1 && arr[mid+1]<arr[mid]){
                return mid;
            }else if (mid >0 && arr[mid]<arr[mid-1]){
                return mid-1;
            } else if (arr[st]==arr[ed] && arr[ed]== arr[mid]) {
                //check if st and ed are pivot, check
                //if they are then return them, return
                //else ignore them ++, --
                if (arr[st]>arr[st+1]){
                    return st;
                }
                st++;

                if (arr[ed-1]<arr[ed]){
                    return ed-1;
                }
                ed--;
            } else if(arr[st]<arr[mid] || ((arr[st] == arr[mid]) && (arr[mid]>arr[ed]) )){
                st = mid+1;
            }else {
                ed = mid-1;
            }
        }
        return -1;
    }
}
