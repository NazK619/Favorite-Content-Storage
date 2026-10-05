public class Content {
    private String name;
    private String description;
    private String location;
    private int id;

    private static int nextID = 1;
    
    public Content(String name, String description, String location) {
        this.id = id;
        setName(name);
        setDescription(description);
        setLocation(location);
}

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    @Override 
    public String toString() {
        return "#" + id + ": " + name + "\n"
                +description + "\n"
                + location;
    }

}
