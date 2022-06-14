package DsAlgo.Stack;

public class DynamicStack extends CustomStack{
    public DynamicStack(){super();}
    public DynamicStack(int size){super(size);}

    public boolean push(int val){
        if (this.isFull()){
            int[] temp = new int[2*data.length];
            for (int i = 0; i<data.length-1; i++){
                temp[i] = data[i];
            }

            data = temp;
        }

        data[++ptr] = val;
        return true;
    }

}
