
<!doctype html>
<jsp:include page="index.html" />
<html>
<head>

  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.2/jquery-ui.js"></script>

  <script>
  $(function() {
    $( "#date_ex" ).datepicker();
  });
  </script>


  
</head>
<body>
 
<div>Selected Date: <input type="text" id="date_ex"></div>
 
 
</body>
</html>

