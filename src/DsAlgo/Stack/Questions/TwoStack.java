package DsAlgo.Stack.Questions;

import java.util.Arrays;

class TwoStackInOneArray{
    int[] arr;
    int top1 = -1;
    int top2;
    int size1 = 0;
    int size2 = 0;

    TwoStackInOneArray(int size){
        arr = new int[size];
        top2 = size;
    }

    public void push1(int element){
        if (top2-top1>1){
            size1++;
            arr[++top1] = element;
        }else{
            System.out.println("Stack1 is full");
        }
    }

    public  void push2(int element){
        if (top2-top1>1){
            size2++;
            arr[--top2] = element;
        }else{
            System.out.println("Stack2 is full");
        }
    }

    public  int pop1(){
        if (top1<0){
            System.out.println("Stack is Empty");
            return -1;
        }else{
            size1--;
            return arr[top1--];
        }
    }

    public  int pop2(){
        if (top2==arr.length){
            System.out.println("Stack is Empty");
            return -1;
        }else{
            size2--;
            return arr[top2++];
        }
    }

//    public  boolean isEmpty1(){
////        if (top1 == -1){
//////            if ()
////        }
//    }

//    public  boolean isEmpty2(){
//
//    }
//
//    public boolean isFull1(){
//        if(top1!=-1){
//            return top1 == top2;
//        }
//        else if(top1 == top2){
//            return true;
//        }
//
//        return false;
//    }
//    public boolean isFull2(){
//        if(top2!=-1){
//            return top1 == top2;
//        }
//        else if(top1 == top2){
//            return true;
//        }
//
//        return false;
//    }
}

public class TwoStack {
    public static void main(String[] args) {
        TwoStackInOneArray stacks = new TwoStackInOneArray(4);
        stacks.pop1();
        stacks.push1(2);
        stacks.push2(7);
        stacks.push2(1);
        stacks.push2(6);
        stacks.push1(9);
        System.out.println(stacks.size1);
        System.out.println(stacks.size2);
        stacks.pop1();
        stacks.pop2();
        System.out.println(stacks.size1);
        System.out.println(stacks.size2);
        System.out.println(stacks.top1);
        System.out.println(stacks.top2);
        System.out.println(Arrays.toString(stacks.arr));
        System.out.println(stacks.arr[stacks.top2]);
    }
}
