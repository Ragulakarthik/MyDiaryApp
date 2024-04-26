<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
    <head>
        <link rel="stylesheet" href="/css/index.css">    
        </head>
    <body>
        <div id="MainDiv">
            <div id="HeadDiv">
                <img src="https://pngimg.com/d/book_PNG2121.png" alt="MyDiaryImage" style="width: 100px; float: left; margin-left: 34%;">
                <b style="font-size: 50px; color: orangered;float: left; margin-top: 0%;">MyDiaryApp</b>
            </div>
            <div id="ImageDiv">
                <img src="https://i.pinimg.com/originals/1a/87/20/1a87201f6b23caa0d27b7e537b74fb72.jpg" alt="MyDiaryImage" style="width: 60%; float: left; margin-top: 10%; margin-left: 20%;">
            </div>
            <div id="RegisterDiv">
                <b style="font-size: 40px; color:orangered; margin-left: 35%; margin-top: 15%; float: left;">Register Here</b>
                <form action="./saveUser" method="POST">
                    <table style="font-size: 30px; margin-left: 10%; margin-top: 5%; float: left;">
                        <tr>
                            <td>
                                <label for="UserName">UserName</label>
                            </td>
                            <td>
                                <input type="text" name="username" placeholder="Enter UserName" required>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label for="Password">Password</label> 
                            </td>
                            <td>
                                <input type="password" name="password" placeholder="Enter Password" required>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" align="center">
                                <input type="submit" value="Register">
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" align="center">
                                <b style="font-size: 20px;">Already a User? <a href="./Login" style="cursor: pointer; color: blue;">Login Here</a></b>
                            </td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
    </body>
</html>