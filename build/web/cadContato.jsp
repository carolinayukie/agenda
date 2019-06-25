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
        <title>Cadastrar contato</title>

        <!-- Bootstrap -->
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
        <link href="css/styleUser.css" rel="stylesheet" type="text/css">
    </head>
    <body class="fundoContato">
        <div class="container">
            <div class="col-lg-9 formularioContato">
                <h3>Cadastrar contato</h3>
                <form>
                    <div class="form-group">
                        <label>Nome</label>
                        <input type="text" class="form-control" name="nome" id="nome" required>
                    </div>

                    <div class="row">
                        <div class="col-lg-4">
                            <div class="form-group">
                                <label for="cargo">Cargo</label>
                                <input type="text" class="form-control" id="cargo" name ="cargo" required>
                            </div>
                        </div>
                        <div class="col-lg-4">
                            <div class="form-group">
                                <label for="empresa">Empresa</label>
                                <input type="text" class="form-control" id="empresa" name ="empresa" required>
                            </div>
                        </div>
                        <div class="col-lg-4">
                            <div class="form-group">
                                <label for="dataAniversario">Data de aniversário</label>
                                <input type="date" class="form-control" id="dataAniversario" name ="dataAniversario" required>
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>Tipo de contato</label>
                        <input type="text" class="form-control" name="tipoContato" id="tipoContato" required>
                    </div>

                    <div class="form-group">
                        <label>Conteúdo</label>
                        <input type="text" class="form-control" name="conteudo" id="conteudo" required>
                    </div>

                    <div class="row">
                        <div class="col-lg-9">
                            <div class="form-group">
                                <label for="endereco">Endereço</label>
                                <input type="text" class="form-control" id="endereco" name ="endereco" required>
                            </div>
                        </div>
                        <div class="col-lg-3">
                            <div class="form-group">
                                <label for="numero">Número</label>
                                <input type="text" class="form-control" id="numero" name ="numero" required>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-lg-9">
                            <div class="form-group">
                                <label for="complemento">Complemento</label>
                                <input type="text" class="form-control" id="complemento" name ="complemento" required>
                            </div>
                        </div>
                        <div class="col-lg-3">
                            <div class="form-group">
                                <label for="bairro">Bairro</label>
                                <input type="text" class="form-control" id="bairro" name ="bairro" required>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-lg-4">
                            <div class="form-group">
                                <label for="cidade">Cidade</label>
                                <input type="text" class="form-control" id="cidade" name ="cidade" required>
                            </div>
                        </div>
                        <div class="col-lg-4">
                            <div class="form-group">
                                <label for="uf">UF</label>
                                <input type="text" class="form-control" id="uf" name ="uf" required>
                            </div>
                        </div>
                        <div class="col-lg-4">
                            <div class="form-group">
                                <label for="tipoEndereco">Tipo de endereço</label>
                                <input type="text" class="form-control" id="tipoEndereco" name ="tipoEndereco" required>
                            </div>
                        </div>
                    </div>

                    <div class="botoesPretos">
                        <input id="submit" type="submit" class="btn btn-adm btn-preto" value="Cadastrar">
                        <a href="menu.jsp" class="btn btn-adm btn-preto">Cancelar</a>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
