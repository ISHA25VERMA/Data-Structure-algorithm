package DsAlgo.PBLJ_LAB;

import java.util.Scanner;

public class EXP1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Employee details
        int[] employeeID = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
        String[] employeeName = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
        String[] joiningDate = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013","16/07/2005","1/1/2000", "12/06/2006" };
        char[] designCode = {'e', 'c','k','r','m', 'e', 'c'};
        String[] dept = {"R&D", "PM", "Acct", "Front Desk", "Ëngg", "Manufacturing", "PM"};
        int[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000 };
        int[] HRA = {8000, 12000, 8000,6000, 20000, 9000, 12000 };
        int[] IT = {3000, 9000, 1000, 2000,20000, 4400, 10000};


        while(true){
            System.out.println();
            System.out.println("Enter the employee code to get details \n OR \nPress '0' to exit ");
            int input = scan.nextInt();
            if (input == 0 ){
                break;
            }

            //find index of input employee id using linear search
            int index = -1;
            for (int i = 0; i<employeeID.length; i++){
                if (employeeID[i] == input){

                    System.out.println("Employee with eid : "+input+" found !");
                    index = i;
                    System.out.println(index+"i");
                }
            }

            if (index == -1){
                System.out.println("Employee with eid : "+input+" not found !");
                continue;
            }

            //finding details
            int number = input;
            String name = employeeName[index];
            String doj = joiningDate[index];
            String department = dept[index];
            char dcode = designCode[index];
            String designation = "";
            int DA = 0;

            //finding salary and designation
            switch (dcode){
                case 'e': {
                    designation = "Engineer";
                    DA = 20000;
                    break;
                }
                case 'c' :{
                    designation = "Consultant";
                    DA = 32000;
                    break;
                }
                case 'k' :{
                    designation = "Clerk";
                    DA = 12000;
                    break;
                }
                case 'r' :{
                    designation = "Receptionist";
                    DA = 15000;
                    break;
                }
                case 'm' :{
                    designation = "Manager";
                    DA = 40000;
                }
            }

            int salary = basic[index]+HRA[index]+DA-IT[index];
            System.out.println();
            System.out.println("Emp No. | Emp Name | Department | Designation | Salary");
            System.out.println(input + " | " + name  + " | " + department + " | " + designation + " | " + salary);
            System.out.println();
        }
    }
}
