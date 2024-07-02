<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logout</title>
<style>
body {
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    height: 100vh;
    margin: 0;
     background-color: #84bedf;
     background-image: url('background.png');
     background-size: cover; /* or 'contain' based on your preference */
     background-position: center center;
     background-repeat: no-repeat;
            
}

.container {
	width: 80%;
    max-width: 400px;
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 1, 0.5);
    background-color: #84bedf;
    text-align: center; /* Center the content */
}

h1 {
    font-weight: bold;
    text-align: center;
    color: #333;
}

label {
    display: block;
    margin: 10px 0;
    color: #555;
}

input {
    width: 100%;
    padding: 10px;
    margin-bottom: 15px;
    box-sizing: border-box;
    border: 1px solid #ccc;
    border-radius: 5px;
    font-size: 16px;
}

button {
    width: 100%;
    padding: 12px;
    cursor: pointer;
    background-color: #007BFF;
    color: #fff;
    border: none;
    border-radius: 5px;
    font-size: 16px;
    transition: background-color 0.3s ease, transform 0.3s ease;
}

button:hover {
    background-color: #0056b3;
    transform: scale(1.05);
}

a {
    text-decoration: none;
    color: #007BFF;
    font-weight: bold;
}

a:hover {
    color: #0056b3;
}
</style>
</head>
<body>
<div class="container">
<h1>Logout</h1>
<form action="LoginServlet" method="post">

<button type="submit">Logout</button>

</form>
<p><a href="index.html">Back to Home</a></p>
</div>
</body>
</html>