package DsAlgo.PBLJ_LAB.UNIT2;

import java.io.*;
import java.util.Scanner;

class Employee{
    String name;
    int id;
    int age;
    int salary;

    Employee(String name, int id, int age, int salary){
        this.name = name;
        this.id = id;
        this.age = age;
        this.salary = salary;
    }

    public String toString(){
        return (id+ " "+ name+" "+" "+age+" "+salary);
    }

    public void appendToFile(String fileName, String str){
        try{
            BufferedWriter out = new BufferedWriter(
                    new FileWriter(fileName, true));

            out.write("\n"+str);

            out.close();
        }catch (IOException e){
            System.out.println("Exception Occurred" + e);
        }
    }
}



public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String filename = "employee.txt";
        while (true){
            System.out.println("1. Add an Employee\n" + "2. Display All\n" + "3. Exit");
            int n = scan.nextInt();
            scan.nextLine();
            if(n == 1){
                System.out.print("Enter id : ");
                int id = scan.nextInt();
                scan.nextLine();
                System.out.print("Enter employee name : ");
                String name = scan.nextLine();
                System.out.println();
                System.out.print("Enter age : ");
                int age = scan.nextInt();
                System.out.println();
                System.out.print("Enter salary : ");
                int salary = scan.nextInt();
                System.out.println();


                Employee e = new Employee(name, id, age, salary);
                System.out.println(e.toString());
                e.appendToFile(filename, e.toString());
            }else if (n==2){
                System.out.println("----Report-----");
                try {
                    BufferedReader in = new BufferedReader(
                            new FileReader("employee.txt"));

                    String mystring;

                    while ((mystring = in.readLine()) != null) {
                        System.out.println(mystring);
                    }
                }
                catch (IOException e) {
                    System.out.println("Exception Occurred" + e);
                }
                System.out.println("----End of Report-----");
            } else if (n == 3) {
                System.out.println("Exiting the System, .." +
                        ". bye");
                break;
            }else{
                System.out.println("Invalid input");
            }
        }
    }
}
