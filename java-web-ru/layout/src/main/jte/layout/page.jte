<!-- BEGIN -->
@import gg.jte.Content
@param Content content

<%--@param Page page--%>



<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <title>Hexlet JTE Layout</title>
        <%--<a href="/">Главная страница</a>
        <a href="/users">Список пользователей</a>--%>
    </head>
    <body>
    <p>
        <a href="/">Главная страница</a>
        <a href="/users">Список пользователей</a>
    </p>
    ${content}
    <div>
        <a href="https://ru.hexlet.io/">Обучение на Hexlet</a>
    </div>
    </body>
</html>

<!-- END -->
