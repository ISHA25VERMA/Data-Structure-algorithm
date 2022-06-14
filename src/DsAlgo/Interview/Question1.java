package DsAlgo.Interview;

class Zoo{
    public int lionCount;
    public int monkeyCount;
    public int parrotCount;
    public int peacockCount;

    Zoo(){
        lionCount = 0;
        monkeyCount = 0;
        parrotCount = 0;
        peacockCount = 0;
    }
    class Lion {
        Lion(){
            lionCount++;
        }
    }

    class Monkey {
        Monkey(){
            monkeyCount++;
        }
    }

    class Parrot {
        Parrot(){
            parrotCount++;
        }
    }

    class Peacock {
        Peacock(){
            peacockCount++;
        }
    }
}



public class Question1 {
    public static void main(String[] args) {
        Zoo my_zoo = new Zoo();
        Zoo.Lion lion1 = my_zoo.new Lion();
        Zoo.Lion lion2 = my_zoo.new Lion();
        Zoo.Monkey monkey1 = my_zoo.new Monkey();
        Zoo.Monkey monkey2 = my_zoo.new Monkey();
        Zoo.Monkey monkey3 = my_zoo.new Monkey();
        Zoo.Parrot parrot1 = my_zoo.new Parrot();
        Zoo.Parrot parrot2 = my_zoo.new Parrot();
        Zoo.Parrot parrot3 = my_zoo.new Parrot();
        Zoo.Peacock peacock1 = my_zoo.new Peacock();
        Zoo.Peacock peacock2 = my_zoo.new Peacock();

        int countLion = my_zoo.lionCount;
        int countMonkey = my_zoo.monkeyCount;
        int countParrot = my_zoo.parrotCount;
        int countPeacock = my_zoo.peacockCount;
        System.out.println("Lion in my_zoo : "+ countLion);
        System.out.println("Monkey in my_zoo : "+ countMonkey);
        System.out.println("Parrot in my_zoo : "+ countParrot);
        System.out.println("Peacock in my_zoo : "+ countPeacock);

    }
}
