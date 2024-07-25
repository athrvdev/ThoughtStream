<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Blog Post</title>
</head>
<body>
    <h1>Edit Blog Post</h1>
    <form action="/blog/edit" method="post">
        <input type="hidden" name="id" value="${post.id}">
        <label for="title">Title:</label>
        <input type="text" id="title" name="title" value="${post.title}">
        <br>
        <label for="content">Content:</label>
        <textarea id="content" name="content">${post.content}</textarea>
         <br>
        <label for="author">Author:</label>
        <input type="text" id="author" name="author" value="${post.author}">
        <br>
        <button type="submit">Update</button>
    </form>
     <a href="/blog">Back to all posts</a>
</body>
</html>