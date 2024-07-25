<!DOCTYPE html>
<html>
<head>
    <title>Create Blog Post</title>
</head>
<body>
    <h1>Create New Blog Post</h1>
    <form action="/blog" method="post">
        <label for="title">Title:</label>
        <input type="text" id="title" name="title">
        <br>
        <label for="content">Content:</label>
        <textarea id="content" name="content"></textarea>
        <br>
        <label for="author">Author:</label>
        <input type="text" id="author" name="author">
        <br>
        <button type="submit">Create</button>
    </form>
    <a href="/blog">Back to all posts</a>
</body>
</html>
