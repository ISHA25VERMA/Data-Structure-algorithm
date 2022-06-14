import java.io.*;
import java.util.Arrays;

public class answer {
    public static class Student
    {
        Student(String inputFile) throws IOException {
            FileInputStream fis = new FileInputStream(inputFile);
            DataInputStream in = new DataInputStream(fis);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String line = null;
            String ArraySpltted[] = null;
            //Reading the file line by line
            while((line = br.readLine()) != null)
            {
                //Splitting a line from spaces
                ArraySpltted = line.split(" ");

                //Initial Sort
                Arrays.sort(ArraySpltted);

                //Advanced Sort
                for (int i = 1; i<ArraySpltted.length; i++)
                {
                    for (int j = i+1; j<ArraySpltted.length; j++)
                    {
                        if ((ArraySpltted[j].startsWith(ArraySpltted[i])) && (ArraySpltted[i].length() < ArraySpltted[j].length()))
                        {
                            String temp = ArraySpltted[i];
                            ArraySpltted[i] = ArraySpltted[j];
                            ArraySpltted[j] = temp;
                        }
                    }
                }
                for (int i = 1; i<ArraySpltted.length; i++) System.out.print(ArraySpltted[i]+"");
                System.out.println();
            }
            br.close();
        }
        public static void main(String args[]) throws FileNotFoundException, IOException
        {
            new Student("student.txt");
        }
    }
}
