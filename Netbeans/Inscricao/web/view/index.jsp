<%@page import="dao.CadastroDAO"%>
<%@page import="java.util.List"%>
<%@page import="model.Cadastro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hackaton</title>
        <img src="img/IEPTB_PA.jpg" alt=""/>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <div class="main">
            <div class="content left">
                <fieldset>
                    <legend>Inscritos</legend>
                    <table>
                        <thead>
                            <tr>
                                <th>Nome</th>
                                <th>Idade</th>
                                <th>Sexo</th>
                                <th>Endereço</th>
                                <th>Telefone</th>
                                <th>Editar</th>
                                <th>Excluir</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                Cadastro cadastro = new Cadastro();
                                List<Cadastro> cadastros = CadastroDAO.getAll();

                                for (Cadastro cad : cadastros)
                                {
                            %>
                            <tr>
                                <td><% out.print(cad.getNome()); %></td>
                                <td><% out.print(cad.getIdade()); %></td>
                                <td><% out.print(cad.getSexo()); %></td>
                                <td><% out.print(cad.getEnd()); %></td>
                                <td><% out.print(cad.getTelefone()); %></td>
                                <td>
                                    <a href="../view/edicao.jsp?id=<% out.print(cad.getId()); %>">
                                        <img src="img/edit.png"/>
                                    </a>
                                </td>
                                <td>
                                    <a href="../controller/controleExclusao.jsp?id=<% out.print(cad.getId()); %>">
                                        <img src="img/delete.png"/>
                                    </a>
                                </td>
                            </tr>
                            <%
                                }
                            %>
                        </tbody>
                    </table>
                    <a href="cadastro.jsp" class="button">Cadastrar</a>
                </fieldset>
            </div>
            <div class="content right">
            </div>
        </div>
    </body>
</html>
