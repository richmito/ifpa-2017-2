<%@page import="dao.CadastroDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Controller</title>
    </head>
    <body>
        <jsp:useBean class="model.Cadastro" id="cadastro"/>
        <%
            if (request.getParameter("id") != null)
            {
                try
                {
                    int id = Integer.parseInt(request.getParameter("id"));
                    cadastro.setId(id);

                    CadastroDAO.delete(cadastro);
                    response.sendRedirect("../view/index.jsp");
                } catch (Exception e)
                {
        %>
        <h2>
            Erro ao cadastrar
            <a href="../view/index.jsp">Retornar para página inicial</a>
        </h2>
        <%
                }
            }
        %>
    </body>
</html>
