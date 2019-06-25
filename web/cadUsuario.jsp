<%-- 
    Document   : cadUsuario
    Created on : 19/06/2019, 22:09:48
    Author     : cyms8
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro do usuário</title>

        <!-- Bootstrap -->
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
        <link href="css/styleUser.css" rel="stylesheet" type="text/css">
    </head>
    <body class="fundoUser">
        <div class="container">
            <div class="col-lg-6 formulario">
                <h3>Cadastrar usuário</h3>
                <form method="post" action="CadastrarUsuario">
                    <div class="form-group">
                        <label>Nome</label>
                        <input type="text" class="form-control" name="nome" id="nome" required>
                    </div>
                    <div class="form-group">
                        <label>Login</label>
                        <input type="text" class="form-control" name="login" id="login" required>
                    </div>
                    <div class="form-group">
                        <label>Senha</label>
                        <input type="text" class="form-control" name="senha" id="senha" required>
                    </div>
                    <div class="botoesPretos">
                        <input id="submit" type="submit" class="btn btn-adm btn-preto" value="Cadastrar">
                        <a href="index.jsp" class="btn btn-adm btn-preto">Cancelar</a>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
