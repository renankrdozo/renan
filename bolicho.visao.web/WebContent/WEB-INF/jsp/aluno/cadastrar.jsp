<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro Alunos</title>

<jsp:include page="../../../importacoes.jsp"/>

 <script type="text/javascript" >
 	$(function(){
 		$('#txtmatricula').number(true,0,"","");
 	})
 
 
 </script>
 
</head>
<body>
<div class="container">
	<h2> Cadastro de Alunos </h2>
	<form action="gravar"  >
		<div class="form-group">
			<label for="txtmatricula">Matricula:</label>
			<input type="text" name="Aluno.matricula" id="txtmatricula"
		   	class="form-control"   required >
		</div>
		
		<div class="form-group">
			<label for="txtNome">Nome:</label>
			<input type="text" name="Aluno.nome" id="txtNome"
			class="form-control" required >
		</div>
		<div class="form-group">
			<input type="submit" class="btn btn-success" value="gravar" >
		</div>
	</form>
</div>

</body>
</html>