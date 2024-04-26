<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

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
            <div id="WelcomeDiv">
                <table style="font-size: 20px; height: 30px; width: 100%;">
                    <tr>
                        <td style="color: chocolate;">Welcome to MyDiaryApp <b>${user.username}</b></td>
                        <td style="margin-left: 55%; float: left; color: chocolate;"> <a href="./Logout" style="cursor: pointer; color: chocolate; text-decoration: none;">LogOut</a></td>
                    </tr>
                </table>
                <br>
                <br>
                <b style="font-size: 30px; margin-left: 20%;">List of Past Entries</b>
                <a href="./Addentry"><button style="font-size: 30px; margin-left: 30%;background-color: burlywood; cursor: pointer;">Add Entry</button></a>
                <table border="2" style="height: 300px; width: 70%; font-size: 30px; margin-left: 15%; margin-top: 0%;">
                    <tr style="background-color: rgb(235, 137, 101); font-weight: bold;">
                        <td>Date</td>
                        <td colspan="3">Actions </td>
                    </tr>
                    <c:if test="${empty list}">
						<tr>
							<td style="font-size:30px;color:green;text-align:center;" colspan="4">${user.username} not added any Diary entries till now.</td>
						</tr>
					</c:if>
					<c:forEach items="${list}" var="e">
					<tr>
						<td>
							${e.entrydate}
						</td>
						<td><a href="viewentry?id=${e.id}">View</a></td>
						<td><a href="updateentry?id=${e.id}">Update</a></td>
						<td><a href="deleteentry?id=${e.id}">Delete</a></td>
					</tr>
					</c:forEach>
                </table>
            </div>
        </div>
    </body>
</html>