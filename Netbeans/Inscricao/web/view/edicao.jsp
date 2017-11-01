<%@page import="dao.CadastroDAO"%>
<%@page import="model.Cadastro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eventos</title>        
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <%
            Cadastro cadastro = new Cadastro();
            
            if (request.getParameter("id") != null)
            {
                try
                {
                    int id = Integer.parseInt(request.getParameter("id"));                    
                                        
                    cadastro = CadastroDAO.getById(id);
                } catch (Exception e)
                {
                    %>
                    <h2>
                        Erro desconhecido!
                    </h2>
                    <%
                    return;
                }
            }
        %>
        <div class="main">
            <div class="content left">
                <fieldset>
                    <legend>Faça sua Inscrição</legend>
                    <form class="form-content" method="POST" action="../controller/controleEdicao.jsp">
                        <input type="hidden" name="id" value="<%out.print(cadastro.getId());%>" />
                        <div class="grupo">
                            <label for="txt_nome">Nome:</label>
                            <input type="text" id="txt_nome" name="nome" value="<%out.print(cadastro.getNome());%>" />
                        </div>        
                        <div class="grupo">
                            <label for="txt_idade">Idade:</label>
                            <input type="text" id="txt_idade" name="idade" value="<%out.print(cadastro.getIdade());%>" />
                        </div> 
                        <div class="grupo">
                            <label for="txt_sexo">Sexo:</label>
                            <input type="text" id="txt_sexo" name="sexo" value="<%out.print(cadastro.getSexo());%>" />
                        </div> 
                        <div class="grupo">
                            <label for="txt_end">Endereço:</label>
                            <input type="text" id="txt_end" name="end" value="<%out.print(cadastro.getEnd());%>" />
                        </div> 
                        <div class="grupo">
                            <label for="txt_telefone">Telefone:</label>
                            <input type="text" id="txt_telefone" name="telefone" value="<%out.print(cadastro.getTelefone());%>" />
                        </div>
                        <div class="grupo">
                            <input type="submit" text="Salvar" />
                        </div>
                    </form>
                </fieldset>
            </div>
            <div class="content right">

            </div>
        </div>
    </body>
</html> 