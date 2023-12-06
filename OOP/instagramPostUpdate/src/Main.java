// imagine a scenario of an instagram post. Once you send your post, instagram lets you update the caption right?
// let's demonstrate this with a simple instagram post class.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Post userPost = new Post("eda_shares", "#takemeback");

        Scanner read = new Scanner(System.in);

        userPost.getPostDetails(); // call getter method.

        System.out.print("new caption: ");
        String updatedCaption = read.nextLine(); // user input to update the caption.

        userPost.setCaption(updatedCaption); // call setter method passing the updated caption parameter.

        userPost.getPostDetails(); // call getter method.
        }
    }