<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Set the title of the HTML page -->
        <title>Mohil Mokaria</title>
        <!-- Specify the character encoding for the document -->
        <meta charset="UTF-8">
        <!-- Define the viewport settings for responsive design -->
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <!-- Display the main heading for the page -->
        <h1>Experiment 3</h1>
        <!-- Create an unordered list of links to various problems -->
        <ul>
            <!-- Link to Problem 1 -->
            <li><a href="<%= request.getContextPath() %>/Problem1">Problem 1</a></li>
            <!-- Link to Problem 2 -->
            <li><a href="<%= request.getContextPath() %>/Problem2">Problem 2</a></li>
            <!-- Link to Problem 3 -->
            <li><a href="<%= request.getContextPath() %>/Problem3">Problem 3</a></li>
            <!-- Link to Problem 4 -->
            <li><a href="<%= request.getContextPath() %>/Problem4">Problem 4</a></li>
            <!-- Link to Problem 5 -->
            <li><a href="<%= request.getContextPath() %>/Problem5">Problem 5</a></li>
        </ul>
    </body>
</html>
