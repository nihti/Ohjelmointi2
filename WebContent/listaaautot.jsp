<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<table id="listaus">
	<thead>				
		<tr>
			<th>Rekisterinumero</th>
			<th>Merkki</th>
			<th>Malli</th>
			<th>Vuosi</th>							
		</tr>
	</thead>
	<tbody>
	</tbody>
</table>
<script>
$(document).ready(function(){
	// osa sivusta voidaan ladata uudelleen AJAX
	$.ajax({ 
		url:"autot", 
		type:"GET", 
		dataType:"json", 
		success: function(result) { // funktio palauttaa tiedot json-objektina
			console.log(result);
		}});
	
	$.ajax({url:"autot", type:"GET", dataType:"json", success:function(result){//Funktio palauttaa tiedot json-objektina		
		$.each(result.autot, function(i, field){  
        	var htmlStr;
        	htmlStr+="<tr>";
        	htmlStr+="<td>"+field.rekno+"</td>";
        	htmlStr+="<td>"+field.merkki+"</td>";
        	htmlStr+="<td>"+field.malli+"</td>";
        	htmlStr+="<td>"+field.vuosi+"</td>";  
        	htmlStr+="</tr>";
        	$("#listaus tbody").append(htmlStr);
        });	
    }});
});	

</script>
</body>
</html>