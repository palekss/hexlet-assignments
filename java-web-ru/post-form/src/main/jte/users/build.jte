@import exercise.dto.users.UsersPage
@param UsersPage page

@template.layout.page(
content = @`
    <form action="/users" method="post">
        <div>
            <label>
                Имя
                <input type="text" name="firstName" />
            </label>
        </div>
        <div>
            <label>
                Фамилия
                <input type="text" name="lastName" />
            </label>
        </div>
        <div>
            <label>
                Email
                <input type="email" required name="email" />
            </label>
        </div>
        <div>
            <label>
                Пароль
                <input type="password" required name="password" />
            </label>
        </div>
        <div>
            <label>
                Подтверждение пароля
                <input type="password" required name="passwordConfirmation" />
            </label>
        </div>
        <input type="submit" value="Зарегистрировать" />
    </form>







    <%--<h1>Пользователи</h1>

    <div class="mb-3">
        <a href="/users/build">Зарегистрировать нового пользователя</a>
    </div>

    <table class="table table-striped">
        @for(var user : page.getUsers())
            <tr>
                <td>
                    ${user.getId()}
                </td>
                <td>
                    ${user.getFirstName()} ${user.getLastName()}
                </td>
            </tr>
        @endfor
    </table>--%>
`
)