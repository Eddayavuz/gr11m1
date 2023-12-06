public class Post
{
    private String username;
    private String caption;

    // constructor method
    public Post(String username, String caption)
    {
        this.username = username;
        this.caption = caption;
    }
    public void setCaption(String newCaption){ // setter method
        caption = newCaption;
        System.out.println("Update Successful");
        System.out.println("*****************");

    }

    public void getPostDetails(){ // getter method
        System.out.println("username: " + username);
        System.out.println("caption: " + caption);
    }
}