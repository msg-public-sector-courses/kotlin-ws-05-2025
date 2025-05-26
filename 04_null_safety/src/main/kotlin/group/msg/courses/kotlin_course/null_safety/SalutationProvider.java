package group.msg.courses.kotlin_course.null_safety;

public class SalutationProvider {

    public String buildSalutationFor(User user) {
        var prefix = switch (user.getGender()) {
            case MALE -> "Guten Tag, Herr";
            case FEMALE -> "Guten Tag, Frau";
            case DIV -> "Hallo,";
        };

        var title = "";
        if (user.getTitle() != null) {
            title = user.getTitle() + " ";
        }

        return prefix + " " + title + user.getFirstName() + " " + user.getLastName();
    }
}
