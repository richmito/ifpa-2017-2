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
            cadastro.setNome(request.getParameter("nome"));
            cadastro.setIdade(Integer.parseInt(request.getParameter("idade")));
            cadastro.setSexo(request.getParameter("sexo"));
            cadastro.setEnd(request.getParameter("end"));
            cadastro.setTelefone(request.getParameter("telefone"));
            
            try
            {
                CadastroDAO.save(cadastro);
                
                response.sendRedirect("../view/index.jsp");
            } catch (Exception e)
            { 
                throw e;
            }
        %>
    </body>
</html>
