<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>${post.title}</title>
</head>
<body>
    <h1>${post.title}</h1>
    <p>${post.content}</p>
    <p>${post.author}</p>
    <a href="/blog">Back to all posts</a>
</body>
</html>