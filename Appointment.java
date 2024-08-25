import java.util.Date;

public class Appointment {

    private final String id;
    private Date date;
    private String description;

    public Appointment(String id, Date date, String description) {

        if (id == null || id.length() > 10) {
            throw new IllegalArgumentException("Invalid id");
        }

        if (date == null || date.before(new Date())) {
            throw new IllegalArgumentException("invalid date");
        }

        if (description == null ||  description.length() > 50) {
            throw new IllegalArgumentException("invalid descriptuion");
        }

        this.id = id;
        this.date = date;
        this.description = description;
    }

    //getter

    public String getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    //setters

    public void setDate(Date date) {
        if (date == null || date.before(new Date())) {
        }
        this.date = date;
    }

    public void setDescription(String description) {
        if (description == null || description.length() > 50) {
        }
        this.description = description;
    }

 }





