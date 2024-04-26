<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
    <head>
        <link rel="stylesheet" href="/css/index.css">    </head>
    <body>
        <div id="MainDiv">
            <div id="HeadDiv">
                <img src="https://pngimg.com/d/book_PNG2121.png" alt="MyDiaryImage" style="width: 100px; float: left; margin-left: 34%;">
                <b style="font-size: 50px; color: orangered;float: left; margin-top: 0%;">MyDiaryApp</b>
            </div>
            <div id="ImageDiv">
                <img src="https://i.pinimg.com/originals/1a/87/20/1a87201f6b23caa0d27b7e537b74fb72.jpg" alt="MyDiaryImage" style="width: 60%; float: left; margin-top: 10%; margin-left: 20%;">
            </div>
            <div id="AddEntryDiv">
            	<b style="font-size:30px; float:left;">Welcome <span style="color:SteelBlue">${user.username}</span></b> 
            	<br>
				<a style="font-size:30px;color:red; float:right;" href="./Logout">Logout</a>
                <b style="font-size: 40px; color:orangered; margin-left: 25%; margin-top: 5%; float: left;">Add Your Entry Here</b>
                <form action="./saveentry" method="POST">
                    <table style="font-size: 30px; margin-left: 10%; margin-top: 5%; float: left;">
                        <tr>
                            <td>
                                <label for="Date">Date</label>
                            </td>
                            <td>
                                <input name="entrydate" type="date" required>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label for="Description">Description</label> 
                            </td>
                            <td>
                                <textarea name="description" style="height: 150px; width: 400px; font-size: 20px;" placeholder="Tell me about your Day"></textarea>
                            </td>
                        </tr>
                        <tr>
                        	<td><input type="hidden" name="userid" value="${user.id}"></td>
                            <td>
                                <input type="submit" value="Save Entry">
                            </td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
    </body>
</html>