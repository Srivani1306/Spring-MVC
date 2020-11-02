<!DOCTYPE html>
<html>
<head>
<meta  charset=ISO-8859-1">
<title>Insert title here</title>
<script >
   function valodateLogin(){
   if(document.forms[0].username.value == ""){
   alert("please enter Username");
    return false;
   }
   
   if(document.forms[0].password.value == ""){
   alert("please enter Password");
    return false;
   }
     document.forms[0].submit();
   }
</script>

</head>
<body>
   
    <form action="login" method="post" onsubmit ="return valodateLogin()" >
     <h1>Login Screen</h1>
     Username: <input type="text" name="username"><br>
     Password: <input type="password" name="password"><br>
    <input type="submit" value="Login" >
    </form>
</body>
</html>