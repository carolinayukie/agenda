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
        <title>Login</title>

        <!-- Bootstrap -->
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
        <link href="css/styleUser.css" rel="stylesheet" type="text/css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    </head>
    <body class="fundoLogin">
        <div class="container">
            <div class="col-lg-4 formulario">                                   
                <h3>Login</h3><br>
                <form method="post" action="teste">
                    <label>Login</label>
                    <input type="text" class="form-control"
                           placeholder="Digite seu login" id="login" name="login">
                    <br><label>Senha</label>
                    <input type="password" class="form-control"
                           placeholder="Digite sua senha" id="senha" name="senha">
                    <div class="form-group">
                        <label>Ainda não possui cadastro? <a href="cadUsuario">Cadastre-se</a></label>
                    </div>
                    <div class="botoesPretos">
                        <input id="submit" type="submit" class="btn btn-adm btn-preto" value="Entrar">
                        <a href="index.jsp" class="btn btn-adm btn-preto">Cancelar</a>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
