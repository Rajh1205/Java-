<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>JSP + AJAX Example</title>
  
  <script>
   function sendRequest() {
	   var name = document.getElementById("username").value;
	   
	   var xhr = new XMLHttpRequest();
	   xhr.open("GET", "process.jsp?username=" + encodeURIComponent(name),true);
	   
	   xhr.onreadystatechange = function()
	   {
		   if(xhr.readyState == 4 && xhr.status == 200)
			   {
			   document.getElementById("result").innerHTML = xhr.responseText;
			   }
	   };
	   
	   xhr.send();
   }
  </script>
<meta charset="UTF-8">

</head>
<body>
   
    <h2>JSP AJAX Demo</h2>
    
    Enter Name:
    <input type="text" id="username"/>
    <button onclick="sendRequest()">Submit</button>
    
    Enter Contact:
    <input type="text" id="username"/>
       <button onclick="sendRequest()">Submit</button>
      
    <h3>Respones:</h3>
    <div id="result"></div>
    <div id="result"></div>
</body>
</html>