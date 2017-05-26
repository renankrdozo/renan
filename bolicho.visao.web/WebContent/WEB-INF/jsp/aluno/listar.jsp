<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
                                             prefix="c" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Alunos</title>
<jsp:include page="../../../importacoes.jsp"/>

<script type="text/javascript">
   $(function(){
	   
	   $('table').dataTable({
	        "language": {
	            "lengthMenu": "Mostrando _MENU_ registros por página",
	            "zeroRecords": "Nenhuma ocorrencia",
	            "info": "pág _PAGE_ de _PAGES_",
	            "infoEmpty": "Sem registros",
	            "infoFiltered": "(duscando de _MAX_ registros)",
	            "search" : "buscar"
	        }
	    });
   })

</script>


</head>
<body>
<div class="container">
	<h2> Listagem de Alunos </h2>
	<table>
	  <thead>
		   <tr>
		      <th> Matricula </th>
		      <th> Nome </th>
		      <th> Data Nascimento </th>
		   </tr>
	   </thead>   
	   <tbody>
		   <c:forEach items="${alunos}" var="cli" >
		     <tr>
		        <td> ${cli.matricula } </td>
		        <td> ${cli.nome } </td>
		     </tr>
		   </c:forEach>
	   </tbody>
	</table>
	   
	<a class="btn btn-primary" href="cadastrar">
	  <span class="glyphicon glyphicon-plus"></span>
	  Adicionar
	</a>
</div>
</body>

</html>