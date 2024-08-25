public class Contact {

    private String id;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    //Constructor with appropriate attributes with logic behind the 5 conditions using conditional checks.
    public Contact(String id, String firstName, String lastName, String phone, String address) {

        if (id == null || id.length() > 10) {
            throw new IllegalArgumentException("Invalid id");
        }
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid name");
        }
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid name");
        }
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Invalid number");
        }
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address");
        }
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }
    
    //GETTERS
    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    //SETTERS
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address");
        }
        this.address = address;
    }

    public void setPhone(String phone) {
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        this.phone = phone;
    }    

}

