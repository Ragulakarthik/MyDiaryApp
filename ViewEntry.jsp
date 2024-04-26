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
            <div id="ViewEntryDiv">
            	<b style="font-size:30px; float:left;">Welcome <span style="color:SteelBlue">${user.username}</span></b> 
            	<br>
				<a style="font-size:30px;color:red; float:right;" href="./Logout">Logout</a>
                <b style="font-size: 40px; color:orangered; margin-left: 25%; margin-top: 5%; float: left;">View Your Entry Here</b>
                <form action="./Welcome">
                    <table style="font-size: 30px; margin-left: 10%; margin-top: 5%; float: left;">
                        <tr>
                            <td>
                                <label for="Date">Date</label>
                            </td>
                            <td>
                                <div id="ViewDateDiv">${ent.entrydate}</div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label for="Description">Description</label> 
                            </td>
                            <td>
                                <div style="height: 150px; width: 400px; font-size: 20px; border: 1px solid black">${ent.description}</div>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <input style="float:left; margin-left:26%;" type="submit" value="Back to Home">
                            </td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
    </body>
</html>