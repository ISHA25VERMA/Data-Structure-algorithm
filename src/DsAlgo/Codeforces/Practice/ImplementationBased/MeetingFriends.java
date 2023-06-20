package DsAlgo.Codeforces.Practice.ImplementationBased;

import java.util.Scanner;

public class MeetingFriends {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int meetingPoint = 0;
        if((a<b && a>c) || (a<c && a>b)){
            meetingPoint = a;
        }else if((b<a && b>c) || (b<c && b>a)){
            meetingPoint = b;
        }else {
            meetingPoint = c;
        }

        int ans = 0;
        ans += Math.abs(meetingPoint - a);
        ans += Math.abs(meetingPoint - b);
        ans += Math.abs(meetingPoint - c);

        System.out.println(ans);
    }


}
