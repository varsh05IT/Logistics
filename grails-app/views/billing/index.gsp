<!doctype html>
<html>
<head>
    <title>
    logistic Mangement
    </title>
    <style>
    body {
        background-color: navy;
        text-align:center;
        color:White;
        }
    </style>
</head>
<body>
</div>
<form>
 <h2>Logistics Management</h2>
  <label>User Name</label><br>
  <input type="text" name="name" placeholder="Enter your username"><br>
  <label>Password</label><br>
  <input type="password" name="password" placeholder="Enter your password"><br>
   <button type="submit" value="Submit">
   <%-- <g:if name="sowmiya"> --%>
  <g:link controller="Billing" action="login" params="${[username:name,password:password]}">Login
  </g:link><br>
  <%-- <g:if> --%>
 </button><br><br>
</form>
</div>
</body>
</html>
<%-- params="${[username:name,password:password]}" --%>