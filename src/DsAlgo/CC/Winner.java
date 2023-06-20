package DsAlgo.CC;

public class Winner {
    public static void main(String[] args) {
        int[] nums = {1,2,3};

        System.out.println(books(nums));
    }
    public static String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        String str = countAndSay(n-1);

        String ans = "";
        int i = 0;
        while(i<str.length()){
            int count = 0;
            char ch = str.charAt(i);
            while(i<str.length() && str.charAt(i) == ch){
                count++;
                i++;
            }
            ans += ""+count+ch;
        }

        return ans;
    }


    public static int books (int[] arr){
        int sum = 0;
        int n = arr.length;

        for(int num : arr){
            sum += num;
        }

        if(sum%n == 0){
            int m = sum/n;

            int ans = 0;

            for(int num : arr){
                if(num < m){
                    ans+= m-num;
                }
            }

            return ans;
        }

        return -1;
    }
}
