package group.msg.courses.kotlin_course.scope_fun;

public class UserRepository {

    public static void main(String[] args) {
        System.out.println(createHomerSimpson());
    }

    private static User createHomerSimpson() {
        Address simpsonsAddress = new Address();
        simpsonsAddress.setStreet("742, Evergreen Terrace");
        simpsonsAddress.setZipCode("58008");
        simpsonsAddress.setCity("Springfield");

        User homerSimpsonUser = new User();
        homerSimpsonUser.setName("Simpson");
        homerSimpsonUser.setFirstName("Homer");
        homerSimpsonUser.setAddress(simpsonsAddress);
        return homerSimpsonUser;
    }
}
