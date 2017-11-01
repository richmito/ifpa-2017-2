package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.CadastroDAO;

public final class cadastro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Eventos</title>        \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>        \n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"content left\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <legend>Inscreva-se</legend>\n");
      out.write("                    <form class=\"form-content\" method=\"POST\" action=\"../controller/controleCadastro.jsp\">\n");
      out.write("                        <div class=\"grupo\">\n");
      out.write("                            <label for=\"txt_nome\">Nome:</label>\n");
      out.write("                            <input type=\"text\" id=\"txt_nome\" name=\"nome\" />\n");
      out.write("                        </div>        \n");
      out.write("                        <div class=\"grupo\">\n");
      out.write("                            <label for=\"txt_idade\">Idade:</label>\n");
      out.write("                            <input type=\"text\" id=\"txt_idade\" name=\"idade\" />\n");
      out.write("                        </div> \n");
      out.write("                        <div class=\"grupo\">\n");
      out.write("                            <label for=\"txt_sexo\">Gênero:</label>\n");
      out.write("                            <input type=\"text\" id=\"txt_sexo\" name=\"sexo\" />\n");
      out.write("                        </div> \n");
      out.write("                        <div class=\"grupo\">\n");
      out.write("                            <label for=\"txt_end\">Endereço:</label>\n");
      out.write("                            <input type=\"text\" id=\"txt_end\" name=\"end\" />\n");
      out.write("                        </div> \n");
      out.write("                        <div class=\"grupo\">\n");
      out.write("                            <label for=\"txt_telefone\">Telefone:</label>\n");
      out.write("                            <input type=\"text\" id=\"txt_telefone\" name=\"telefone\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"grupo\">\n");
      out.write("                            <input type=\"submit\" text=\"Salvar\" />\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </fieldset>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"content right\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
