<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <table>
            <tr>
                <td>
            <canvas id="myCanvas" width="150" height="150" style="border:1px solid #000000;"></canvas>
        </td>
        <td>
            <form name="inputForm">
                <table>
                    <tr>
                        <th>Color</th>
                        <td><input type="radio" name="color" value="#FF0000" checked="true">Red</td>
                        <td><input type="radio" name="color" value="#0000FF">Blue</td>
                        <td><input type="radio" name="color" value="#FF9900">Orange</td>
                        <td><input type="radio" name="color" value="#33CC33">Green</td>
                    </tr>
                    <tr>
                        <th>Shape</th>
                        <td><input type="radio" name="shape" value="square" checked="true">Square</td>
                        <td><input type="radio" name="shape" value="circle">Circle</td>
                        <td> </td>
                        <td> </td>
                    </tr>
                </table>
            </form>
        </td>
    </tr>
</table>
<div id="output"></div>
<script type="text/javascript" src="websocket.js"></script>
<script type="text/javascript" src="whiteboard.js"></script>
</body>
</html>
