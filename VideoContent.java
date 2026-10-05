public class VideoContent extends DynamicContent {
    private int resolution;

    public VideoContent(String name, String description, String location, int duration, int resolution) {
        super(name, description, location, duration);
        setResolution(resolution);
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        if (resolution == 240 || resolution == 320 || resolution == 480 ||
            resolution == 1080 || resolution == 1440 || resolution == 1920 || resolution == 2048) {
            this.resolution = resolution;
        } else {
            this.resolution = -1;
        }
    }

    @Override
    public String toString() {
        String resString = (resolution == -1) ? "Unknown resolution" : String.valueOf(resolution);
        return super.toString() + "\nResolution: " + resString;
    }
}