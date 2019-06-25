<%-- 
    Document   : menuCRUD
    Created on : 23/06/2019, 20:58:49
    Author     : cyms8
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista dos contatos</title>

        <!-- Bootstrap -->
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
        <link href="css/styleLista.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div class="container">
            <h3>Lista dos contatos</h3>
            <table class="table tabela">
                <thead>
                    <tr>
                        <th>Nome</th>
                        <th>Telefone</th>

                        <th>Opções</th>
                    </tr>
                </thead>

                <tbody>

                    <tr>

                        <td></td>
                        <td></td>
                        <td>
                            <a href="" class="btn btn-success btnOp"><span class="glyphicon glyphicon-edit"></span>Editar</a>
                            <a href="" class="btn btn-danger btnOp"><span class="glyphicon glyphicon-remove"></span>Excluir</a>
                        </td>
                    </tr>

                </tbody>
            </table>
            <div class="botoesPretos">
                <a href="cadContato.jsp" class="btn btn-adm btn-pa">Cadastrar contato</a>
                <a href="index.jsp" class="btn btn-adm btn-pa">Sair</a>
            </div>
        </div>
    </body>
</html>
