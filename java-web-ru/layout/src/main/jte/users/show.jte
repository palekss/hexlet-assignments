<!-- BEGIN -->
@import exercise.dto.users.UserPage
@import exercise.model.User
@param UserPage page



@template.layout.page(
    content = @`
        <p>${page.getUser().getFirstName() + " " + page.getUser().getLastName()}</p>
    `
)
<!-- END -->
