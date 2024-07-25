<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>ThoughtStream - Blog Posts</title>
</head>
<body>
    <h1>All Blog Posts</h1>
    <a href="/blog/new"><button>Create new Post</button></a>
    <ul>
        <c:forEach var="post" items="{$posts}">
        <li>
            <a href="/blog/${post.id}">${post.title} </a> by ${post.author}
            <a href="/blog/edit/${post.id}">Edit</a>
            <a href="/blog/delete/${post.id}">Delete</a>
        </li>
        </c:forEach>
    </ul>

</body>
</html>