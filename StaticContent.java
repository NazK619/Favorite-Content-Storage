public class StaticContent extends Content {
    private  String author;
    
    public StaticContent(String name, String description, String location, String author) {
        super(name, description, location);
        setAuthor(author);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
       if (author != null && !author.trim().isEmpty()) {
            this.author = author;
        } else {
            this.author = "Unknown author";
        }

    }

@Override
    public String toString() {
        return super.toString() + "\nby " + author;
    }

}
