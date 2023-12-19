@import exercise.dto.users.UsersPage
@import exercise.model.User
@param UsersPage page

@template.layout.page(
    content = @`
        <form action="/users" method="get">
            <input type="search" name="term" value="${page.getTerm()}" />
            <input type="submit" value="Search" />
        </form>

        @for(var user : page.getUsers())
            <div>
            <tr>
                <td>
                    ${user.getId()}
                </td>
                <td>
                    ${user.getFirstName()} ${user.getLastName()}
                </td>
            </tr>
            </div>
        @endfor
    `
)