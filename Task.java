public class Task {

    private final String id;
    private String name;
    private String description;


    public Task( String id, String name, String description) {
        if (id == null || id.length() > 10) {
            throw new IllegalArgumentException("Must not be blank and must be at most 10 characters.");
        }
        if (name == null || name.length() > 20) {
            throw new IllegalArgumentException("Must not be blank and must be at most 20 characters.");
        }
        if (description == null || description.length() > 50) {
            throw new IllegalArgumentException("Must not be blank and at most 20 characters.");
        }
        this.id = id;
        this.name = name;
        this.description = description;
    }

    //getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    //setters
    public void setName(String name) {
        if (name == null || name.length() > 20) {
            throw new IllegalArgumentException("Invalid name.");
        }
        this.name = name;
    }

    public void setDescription(String description) {
        if (description == null || description.length() > 50) {
            throw new IllegalArgumentException("Invalid name.");
        }
        this.description = description;
    }

}    

