public class WrittenContent extends StaticContent {
    private int words;


    public WrittenContent(String name, String description, String location, String author) {
        super(name, description, location, author);
        setWords(words);
    }

    public int getWords() {
        return words;
    }

    public void setWords(int words) {
        if (words >= 0) {
            this.words = words;
        } else {
            this.words = 0;
        }
    }

    private String getReadingTime() {
        int minutes = Math.round((float) words / 180);
        if (minutes < 1){
            return "Less than a minute";
        } else {
            return "Around " + minutes + " minutes";
        }
     }

    @Override
    public String toString(){
        return super.toString() + "\nRead time: " + getReadingTime();
    }
} 


