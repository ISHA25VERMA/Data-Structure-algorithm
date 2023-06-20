package DsAlgo.PBLJ_LAB;

import java.util.Scanner;
import java.util.logging.SocketHandler;

class Video {
    String title;
    boolean checkedOut; // it says the video is not checked out, it can be checked out
    int rating;

    Video(String title){
        this.title = title;
        checkedOut = false;
        rating = 0;
    }
    void checkOut(){
        if (this.checkedOut == false){
            this.checkedOut = true;
            return;
        }

        System.out.println("The video is not available to check out");

    }

    void returnVideo(){
        if (checkedOut == true){
            this.checkedOut = false;
            return;
        }

        System.out.println("You never rented this video, how can you return it!");
    }

    void rate(int rating){
        this.rating = rating;
    }


}

class VideoStore{
    Video[] store = new Video[10];
    int i  = 0;

    VideoStore(){
        store[0] = new Video("Cobra");
        store[1] = new Video("Spider Man");
        store[2] = new Video("Dragon ball");
        store[3] = new Video("Suits");
        store[4] = new Video("Bullet Train");
        i = 5;
    }

    void addVideo(String title){
        if (i == 9){
            System.out.println("No more space to have a video!");
            return;
        }
        store[i++] = new Video(title);
        System.out.println("New video, "+title+" added to the store");
    }

    void checkOut(String title){
        int index = -1;
        for (int j = 0; j<i; j++){
            if (store[j].title.equals(title)){
                index = j;
                store[j].checkOut();
                break;
            }
        }
        if (index == -1){
            System.out.println("Sorry! We do not have this video");
        }
    }

    void returnVideos(String title){
        int index = -1;
        for (int j = 0; j<i; j++){
            if (store[j].title.equals(title)){
                index = j;
                store[j].returnVideo();
                break;
            }
        }
        if (index == -1){
            System.out.println("Sorry! This video is not from our store");
        }
    }

    void receiveRating(String title, int rating){
        int index = -1;

        for (int j = 0; j<i; j++){

            if (store[j].title.equals(title)){
                index = j;
                store[j].rate(rating);
                break;
            }
        }
        if (index == -1){
            System.out.println("Sorry! You cannot rate a video that does not exist");
        }
    }

    void listInventory(){
        System.out.println("Here is the list of available videos");
        for(int j = 0; j<i; j++){
            if (!store[j].checkedOut){
                System.out.println(store[j].title+" - "+store[j].rating);
            }
        }
    }
}


public class EXP2 {
    public static void main(String[] args) {
        VideoStore ishaStore = new VideoStore();
        Scanner scan = new Scanner(System.in);

//        ishaStore.listInventory();

        while (true){
            System.out.println();
            System.out.println("Welcome to the video store\n1. To add videos\n2. List of videos\n3. Check out a particular video" +
                    "\n4. Receive rating for a video\n5. Return the video to store\n0. Exit");

            int input = scan.nextInt();

            if (input==0){
                break;
            }else if (input == 1){
                System.out.println("Enter the name of the video to add : ");
                scan.nextLine();
                String movie = scan.nextLine();
                ishaStore.addVideo(movie);
            }else if (input ==2){
                ishaStore.listInventory();
            }else if (input ==3){
                System.out.println("Enter the name of the video to checkout : ");
                scan.nextLine();
                String movie = scan.nextLine();
                ishaStore.checkOut(movie);
            }else if (input == 4){
                System.out.println("Enter the name of the video and rating e.x. (abc 2) : ");
                scan.nextLine();
                String movie = scan.nextLine();
                int rate = scan.nextInt();
                System.out.println("movie "+movie);
                System.out.println("rating "+rate);
                ishaStore.receiveRating(movie, rate);
            }else if (input == 5){
                System.out.println("Enter the name of the movie to return : ");
                scan.nextLine();
                String movie = scan.nextLine();;
                ishaStore.returnVideos(movie);
            }else{
                System.out.println("Invalid option !");
            }

        }

//        ishaStore.addVideo("Suits 2");
//        ishaStore.listInventory();
//        ishaStore.checkOut("Suits");
//        ishaStore.listInventory();
//        ishaStore.receiveRating("Suits", 5);
//        ishaStore.listInventory();
//        ishaStore.returnVideos("Suits");
//        ishaStore.listInventory();
    }
}
