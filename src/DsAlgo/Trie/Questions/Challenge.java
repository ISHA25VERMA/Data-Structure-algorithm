package DsAlgo.Trie.Questions;

import DsAlgo.Trie.Trie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int id;
    int point;


    Student(int id, int point){
        this.id = id;
        this.point = point;
    }

}
public class Challenge {
    private static void order(List<Student> students) {

        Collections.sort(students, new Comparator() {

            public int compare(Object o1, Object o2) {

                Integer x1 = ((Student) o1).point;
                Integer x2 = ((Student) o2).point;
                int sComp = x1.compareTo(x2);

                if (sComp != 0) {
                    return sComp;
                }

                Integer n1 = ((Student) o1).id;
                Integer n2 = ((Student) o2).id;
                return n1.compareTo(n2);
            }});
    }



    public static List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
        List<Integer> ans = new ArrayList<>();
        Trie positive = new Trie();
        for(String word: positive_feedback){
            positive.insert(word);
        }
        Trie negative = new Trie();
        for(String word: negative_feedback){
            negative.insert(word);
        }


        List<Student> student  = new ArrayList<>();
        for(int m = 0; m<report.length; m++){
            String comments = report[m];
            int j= 0;
            int i = 0;
            int marks = 0;
            while(j<comments.length()){
                while(j<comments.length() && comments.charAt(j) != (char)32 ){
                    j++;
                }
                if(positive.search(comments.substring(i, j))){
                    marks+=3;
                }
                else if(negative.search(comments.substring(i, j))){
                    marks -=1;
                }
                j++;
                i = j;
            }
            student.add(new Student(student_id[m], marks));
        }

        order(student);

        for(int i = 0;i<k; i++){
            ans.add(student.get(i).id);
        }

        return ans;
    }

    public static void main(String[] args) {
        String[] pos = {"smart","brilliant","studious"};
        String[] neg = {"not"};
        String[] report = {"this student is studious","the student is smart"};
        int[] student_id = {1,2};
        topStudents(pos, neg, report, student_id, 2);
    }
}
