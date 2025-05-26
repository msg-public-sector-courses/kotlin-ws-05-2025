package group.msg.courses.kotlin_course.scope_fun;

public class User {

    private String name;
    private String firstName;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + getName() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", address=" + getAddress() +
                '}';
    }
}
