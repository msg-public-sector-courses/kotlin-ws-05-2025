package group.msg.courses.kotlin_course.null_safety;

public class User {

    private final String title;
    private final String firstName;
    private final String lastName;
    private final Gender gender;

    public User(String title, String firstName, String lastName, Gender gender) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public enum Gender { MALE, FEMALE, DIV}

    public static void main(String[] args) {
        var provider = new SalutationProviderKt();
        System.out.println(provider
                .buildSalutationFor(new User(null, "Max", "Mustermann", Gender.MALE)));
        System.out.println(provider
                .buildSalutationFor(new User("Dr.", "Maria", "Musterfrau", Gender.FEMALE)));
        System.out.println(provider
                .buildSalutationFor(new User("Prof.", "Morgan", "Cameron", Gender.DIV)));
    }
}
