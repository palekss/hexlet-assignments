package exercise;

import io.javalin.Javalin;
import java.util.List;
import io.javalin.http.NotFoundResponse;
import exercise.model.User;
import exercise.dto.users.UserPage;
import exercise.dto.users.UsersPage;
import java.util.Collections;

public final class App {

    // Каждый пользователь представлен объектом класса User
    private static final List<User> USERS = Data.getUsers();

    public static Javalin getApp() {

        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });

        // BEGIN
        app.get("/users", ctx -> {
            var page = new UsersPage(USERS);

            ctx.render("users/index.jte", Collections.singletonMap("page", page));
        });

        app.get("/users/{id}", ctx -> {
            var userNumber = ctx.pathParamAsClass("id", Integer.class).get();

            if (userNumber >= USERS.size() || userNumber < 0) {
                throw new NotFoundResponse("User not found");
            }



            var userNumberId = 0;

            for (var i = 0; i < USERS.size(); i++) {
                if (userNumber == USERS.get(i).getId()) {
                    userNumberId = i;
                }
            }

            var user = USERS.get(userNumberId);

            var page = new UserPage(user);

            ctx.render("users/show.jte", Collections.singletonMap("page", page));
        });

        app.get("/", ctx -> {
            ctx.render("index.jte");
        });

        // END

        return app;
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
