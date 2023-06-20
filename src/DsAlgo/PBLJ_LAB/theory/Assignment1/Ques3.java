package DsAlgo.PBLJ_LAB.theory.Assignment1;

public class Ques3 {
    public static void main(String[] args) {
        wordSeparator("isha", "X", 3);
    }
    static void wordSeparator(String word, String separator, int count){
        for (int i = 0; i<count-1; i++){
            System.out.print(word+separator);
        }
        System.out.println(word);
    }
}
