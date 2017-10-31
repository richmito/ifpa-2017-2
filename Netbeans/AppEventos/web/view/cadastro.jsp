<%@page import="dao.CadastroDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eventos</title>        
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>        
        <div class="main">
            <div class="content left">
                <fieldset>
                    <legend>Faça sua Inscrição</legend>
                    <form class="form-content" method="POST" action="../controller/controleCadastro.jsp">
                        <div class="grupo">
                            <label for="txt_nome">Nome:</label>
                            <input type="text" id="txt_nome" name="nome" />
                        </div>        
                        <div class="grupo">
                            <label for="txt_idade">Idade:</label>
                            <input type="text" id="txt_idade" name="idade" />
                        </div> 
                        <div class="grupo">
                            <label for="txt_sexo">Gênero:</label>
                            <input type="text" id="txt_sexo" name="sexo" />
                        </div> 
                        <div class="grupo">
                            <label for="txt_end">Endereço:</label>
                            <input type="text" id="txt_end" name="end" />
                        </div> 
                        <div class="grupo">
                            <label for="txt_telefone">Telefone:</label>
                            <input type="text" id="txt_telefone" name="telefone" />
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