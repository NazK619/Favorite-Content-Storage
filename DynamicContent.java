public class DynamicContent extends Content {
    private int duration; 

    public DynamicContent(String name, String description, String location, int duration) {
        super(name, description, location);
        setDuration(duration);  
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration > 0) {
            this.duration = duration;
        } else {
            this.duration = 0;
        }
    }
    @Override
    public String toString() {
        return super.toString() + "\nDuration: " + (duration / 1000) + " seconds";
    }
}
