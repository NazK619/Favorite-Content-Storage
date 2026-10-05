public class ImageContent extends StaticContent {
    private int width;
    private int height;

    public ImageContent(String name, String description, String location, String author, int[] dimensions) {
        super(name, description, location, author);
        setDimensions(dimensions);
    }

    public int[] getDimensions() {
        return new int[]{width, height};
    }

    public void setDimensions(int[] dimensions) {
        if (dimensions != null && dimensions.length == 2) {
            if (dimensions[0] > 0) {
                this.width = dimensions[0];
            } else {
                this.width = 1;
            }

            if (dimensions[1] > 0) {
                this.height = dimensions[1];
            } else {
                this.height = 1;
            }
        } else {
            this.width = 1;
            this.height = 1;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + width + "x" + height;
    }
}