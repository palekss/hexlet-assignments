package exercise.dto.users;

import exercise.model.User;

import lombok.AllArgsConstructor;
import lombok.Getter;

// BEGIN
@AllArgsConstructor
@Getter

public final class UserPage {

    /*private long id;
    private String firstName;
    private String lastName;
    private String email;

    public UserPage (long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }*/
    private User user;

    /*@AllArgsConstructor
    public class User {
        private long id;
        private String firstName;
        private String lastName;
        private String email;
    }*/
}
// END
