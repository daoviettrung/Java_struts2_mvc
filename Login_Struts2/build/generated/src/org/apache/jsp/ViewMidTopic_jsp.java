package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ViewMidTopic_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_p_property_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_p_form_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_p_submit_value_method_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_p_textfield_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_p_iterator_var_value;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_p_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_p_form_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_p_submit_value_method_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_p_textfield_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_p_iterator_var_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_p_property_value_nobody.release();
    _jspx_tagPool_p_form_method_action.release();
    _jspx_tagPool_p_submit_value_method_nobody.release();
    _jspx_tagPool_p_textfield_name_nobody.release();
    _jspx_tagPool_p_iterator_var_value.release();
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

      out.write("<!doctype html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"assets/img/favicon.ico\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("\n");
      out.write("        <title>Light Bootstrap Dashboard by Creative Tim</title>\n");
      out.write("\n");
      out.write("        <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS     -->\n");
      out.write("        <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("        <!-- Animation library for notifications   -->\n");
      out.write("        <link href=\"assets/css/animate.min.css\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("        <!--  Light Bootstrap Table core CSS    -->\n");
      out.write("        <link href=\"assets/css/light-bootstrap-dashboard.css?v=1.4.0\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--  CSS for Demo Purpose, don't include it in your project     -->\n");
      out.write("        <link href=\"assets/css/demo.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--     Fonts and icons     -->\n");
      out.write("        <link href=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href=\"assets/css/pe-icon-7-stroke.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <div class=\"sidebar\" data-color=\"purple\" data-image=\"assets/img/sidebar-5.jpg\">\n");
      out.write("\n");
      out.write("                <!--   you can change the color of the sidebar using: data-color=\"blue | azure | green | orange | red | purple\" -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"sidebar-wrapper\">\n");
      out.write("                    <div class=\"logo\">\n");
      out.write("                        <a href=\"http://www.creative-tim.com\" class=\"simple-text\">\n");
      out.write("                            Creative Tim\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <ul class=\"nav\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"dashboard.html\">\n");
      out.write("                                <i class=\"pe-7s-graph\"></i>\n");
      out.write("                                <p>Dashboard</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"active\">\n");
      out.write("                            <a href=\"user.html\">\n");
      out.write("                                <i class=\"pe-7s-user\"></i>\n");
      out.write("                                <p>User Profile</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"table.html\">\n");
      out.write("                                <i class=\"pe-7s-note2\"></i>\n");
      out.write("                                <p>Table List</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"typography.html\">\n");
      out.write("                                <i class=\"pe-7s-news-paper\"></i>\n");
      out.write("                                <p>Typography</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"icons.html\">\n");
      out.write("                                <i class=\"pe-7s-science\"></i>\n");
      out.write("                                <p>Icons</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"maps.html\">\n");
      out.write("                                <i class=\"pe-7s-map-marker\"></i>\n");
      out.write("                                <p>Maps</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"notifications.html\">\n");
      out.write("                                <i class=\"pe-7s-bell\"></i>\n");
      out.write("                                <p>Notifications</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"active-pro\">\n");
      out.write("                            <a href=\"upgrade.html\">\n");
      out.write("                                <i class=\"pe-7s-rocket\"></i>\n");
      out.write("                                <p>Upgrade to PRO</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"main-panel\">\n");
      out.write("                <nav class=\"navbar navbar-default navbar-fixed\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"navbar-header\">\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#navigation-example-2\">\n");
      out.write("                                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <a class=\"navbar-brand\" href=\"#\">User</a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"collapse navbar-collapse\">\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-left\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                        <i class=\"fa fa-dashboard\"></i>\n");
      out.write("                                        <p class=\"hidden-lg hidden-md\">Dashboard</p>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"dropdown\">\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                        <i class=\"fa fa-globe\"></i>\n");
      out.write("                                        <b class=\"caret hidden-sm hidden-xs\"></b>\n");
      out.write("                                        <span class=\"notification hidden-sm hidden-xs\">5</span>\n");
      out.write("                                        <p class=\"hidden-lg hidden-md\">\n");
      out.write("                                            5 Notifications\n");
      out.write("                                            <b class=\"caret\"></b>\n");
      out.write("                                        </p>\n");
      out.write("                                    </a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        <li><a href=\"#\">Notification 1</a></li>\n");
      out.write("                                        <li><a href=\"#\">Notification 2</a></li>\n");
      out.write("                                        <li><a href=\"#\">Notification 3</a></li>\n");
      out.write("                                        <li><a href=\"#\">Notification 4</a></li>\n");
      out.write("                                        <li><a href=\"#\">Another notification</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_p_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"\">\n");
      out.write("                                        <p>Account</p>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"dropdown\">\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                        <p>\n");
      out.write("                                            Dropdown\n");
      out.write("                                            <b class=\"caret\"></b>\n");
      out.write("                                        </p>\n");
      out.write("\n");
      out.write("                                    </a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        <li><a href=\"#\">Action</a></li>\n");
      out.write("                                        <li><a href=\"#\">Another action</a></li>\n");
      out.write("                                        <li><a href=\"#\">Something</a></li>\n");
      out.write("                                        <li><a href=\"#\">Another action</a></li>\n");
      out.write("                                        <li><a href=\"#\">Something</a></li>\n");
      out.write("                                        <li class=\"divider\"></li>\n");
      out.write("                                        <li><a href=\"#\">Separated link</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <p>Log out</p>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"separator hidden-lg hidden-md\"></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-8\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"header\">\n");
      out.write("                                        <h4 class=\"title\">View Trainee in course</h4>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"content\">\n");
      out.write("                                        <div id=\"page-inner\"> \n");
      out.write("                                            <form>\n");
      out.write("                                                <table Border=\"1\" width=\"60%\" align=\"centter\">\n");
      out.write("                                                    <tr> \n");
      out.write("                                                        <td>ID Topic</td>\n");
      out.write("                                                        <td>ID trainer</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                    </tr>\n");
      out.write("                                                    ");
      if (_jspx_meth_p_iterator_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <a href=\"addTrainee.jsp\">Add</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            </form>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-4\">\n");
      out.write("                                <div class=\"card card-user\">\n");
      out.write("                                    <div class=\"image\">\n");
      out.write("                                        <img src=\"https://ununsplash.imgix.net/photo-1431578500526-4d9613015464?fit=crop&fm=jpg&h=300&q=75&w=400\" alt=\"...\"/>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"content\">\n");
      out.write("                                        <div class=\"author\">\n");
      out.write("                                            <a href=\"#\">\n");
      out.write("                                                <img class=\"avatar border-gray\" src=\"assets/img/faces/face-3.jpg\" alt=\"...\"/>\n");
      out.write("\n");
      out.write("                                                <h4 class=\"title\">Mike Andrew<br />\n");
      out.write("                                                    <small>michael24</small>\n");
      out.write("                                                </h4>\n");
      out.write("                                            </a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <p class=\"description text-center\"> \"Lamborghini Mercy <br>\n");
      out.write("                                            Your chick she so thirsty <br>\n");
      out.write("                                            I'm in that two seat Lambo\"\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <hr>\n");
      out.write("                                    <div class=\"text-center\">\n");
      out.write("                                        <button href=\"#\" class=\"btn btn-simple\"><i class=\"fa fa-facebook-square\"></i></button>\n");
      out.write("                                        <button href=\"#\" class=\"btn btn-simple\"><i class=\"fa fa-twitter\"></i></button>\n");
      out.write("                                        <button href=\"#\" class=\"btn btn-simple\"><i class=\"fa fa-google-plus-square\"></i></button>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <footer class=\"footer\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <nav class=\"pull-left\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        Home\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        Company\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        Portfolio\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        Blog\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </nav>\n");
      out.write("                        <p class=\"copyright pull-right\">\n");
      out.write("                            &copy; <script>document.write(new Date().getFullYear())</script> <a href=\"http://www.creative-tim.com\">Creative Tim</a>, made with love for a better web\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </footer>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <!--   Core JS Files   -->\n");
      out.write("    <script src=\"assets/js/jquery.3.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("    <!--  Charts Plugin -->\n");
      out.write("    <script src=\"assets/js/chartist.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!--  Notifications Plugin    -->\n");
      out.write("    <script src=\"assets/js/bootstrap-notify.js\"></script>\n");
      out.write("\n");
      out.write("    <!--  Google Maps Plugin    -->\n");
      out.write("    <script type=\"text/javascript\" src=\"https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE\"></script>\n");
      out.write("\n");
      out.write("    <!-- Light Bootstrap Table Core javascript and methods for Demo purpose -->\n");
      out.write("    <script src=\"assets/js/light-bootstrap-dashboard.js?v=1.4.0\"></script>\n");
      out.write("\n");
      out.write("    <!-- Light Bootstrap Table DEMO methods, don't include it in your project! -->\n");
      out.write("    <script src=\"assets/js/demo.js\"></script>\n");
      out.write("\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_p_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_p_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_p_form_method_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_p_form_0.setPageContext(_jspx_page_context);
    _jspx_th_p_form_0.setParent(null);
    _jspx_th_p_form_0.setAction("searchMidCourse");
    _jspx_th_p_form_0.setMethod("post");
    int _jspx_eval_p_form_0 = _jspx_th_p_form_0.doStartTag();
    if (_jspx_eval_p_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p_form_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_p_textfield_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_p_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_p_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_p_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_p_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_form_method_action.reuse(_jspx_th_p_form_0);
      return true;
    }
    _jspx_tagPool_p_form_method_action.reuse(_jspx_th_p_form_0);
    return false;
  }

  private boolean _jspx_meth_p_textfield_0(javax.servlet.jsp.tagext.JspTag _jspx_th_p_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_p_textfield_0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_p_textfield_name_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_p_textfield_0.setPageContext(_jspx_page_context);
    _jspx_th_p_textfield_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_p_form_0);
    _jspx_th_p_textfield_0.setName("id");
    int _jspx_eval_p_textfield_0 = _jspx_th_p_textfield_0.doStartTag();
    if (_jspx_th_p_textfield_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_textfield_name_nobody.reuse(_jspx_th_p_textfield_0);
      return true;
    }
    _jspx_tagPool_p_textfield_name_nobody.reuse(_jspx_th_p_textfield_0);
    return false;
  }

  private boolean _jspx_meth_p_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_p_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_p_submit_0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _jspx_tagPool_p_submit_value_method_nobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_p_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_p_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_p_form_0);
    _jspx_th_p_submit_0.setMethod("searchAction");
    _jspx_th_p_submit_0.setValue("Search");
    int _jspx_eval_p_submit_0 = _jspx_th_p_submit_0.doStartTag();
    if (_jspx_th_p_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_submit_value_method_nobody.reuse(_jspx_th_p_submit_0);
      return true;
    }
    _jspx_tagPool_p_submit_value_method_nobody.reuse(_jspx_th_p_submit_0);
    return false;
  }

  private boolean _jspx_meth_p_iterator_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_p_iterator_0 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_p_iterator_var_value.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_p_iterator_0.setPageContext(_jspx_page_context);
    _jspx_th_p_iterator_0.setParent(null);
    _jspx_th_p_iterator_0.setVar("p");
    _jspx_th_p_iterator_0.setValue("midTopic");
    int _jspx_eval_p_iterator_0 = _jspx_th_p_iterator_0.doStartTag();
    if (_jspx_eval_p_iterator_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p_iterator_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p_iterator_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                                        <tr>\n");
        out.write("                                                            <td>");
        if (_jspx_meth_p_property_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_p_iterator_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                                                            <td>");
        if (_jspx_meth_p_property_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_p_iterator_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                                                            <td ><a href=\"editTraineeInCourse?id=");
        if (_jspx_meth_p_property_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_p_iterator_0, _jspx_page_context))
          return true;
        out.write("\">Edit</a></td>\n");
        out.write("                                                            <td ><a href=\"deleteTraineeInCourse?id=");
        if (_jspx_meth_p_property_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_p_iterator_0, _jspx_page_context))
          return true;
        out.write("\">Delete</a></td>\n");
        out.write("                                                        </tr>\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_p_iterator_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p_iterator_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_iterator_var_value.reuse(_jspx_th_p_iterator_0);
      return true;
    }
    _jspx_tagPool_p_iterator_var_value.reuse(_jspx_th_p_iterator_0);
    return false;
  }

  private boolean _jspx_meth_p_property_0(javax.servlet.jsp.tagext.JspTag _jspx_th_p_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_p_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_p_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_p_property_0.setPageContext(_jspx_page_context);
    _jspx_th_p_property_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_p_iterator_0);
    _jspx_th_p_property_0.setValue("#p.topicid");
    int _jspx_eval_p_property_0 = _jspx_th_p_property_0.doStartTag();
    if (_jspx_th_p_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_property_value_nobody.reuse(_jspx_th_p_property_0);
      return true;
    }
    _jspx_tagPool_p_property_value_nobody.reuse(_jspx_th_p_property_0);
    return false;
  }

  private boolean _jspx_meth_p_property_1(javax.servlet.jsp.tagext.JspTag _jspx_th_p_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_p_property_1 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_p_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_p_property_1.setPageContext(_jspx_page_context);
    _jspx_th_p_property_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_p_iterator_0);
    _jspx_th_p_property_1.setValue("#p.trainerid");
    int _jspx_eval_p_property_1 = _jspx_th_p_property_1.doStartTag();
    if (_jspx_th_p_property_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_property_value_nobody.reuse(_jspx_th_p_property_1);
      return true;
    }
    _jspx_tagPool_p_property_value_nobody.reuse(_jspx_th_p_property_1);
    return false;
  }

  private boolean _jspx_meth_p_property_2(javax.servlet.jsp.tagext.JspTag _jspx_th_p_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_p_property_2 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_p_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_p_property_2.setPageContext(_jspx_page_context);
    _jspx_th_p_property_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_p_iterator_0);
    _jspx_th_p_property_2.setValue("#p.id");
    int _jspx_eval_p_property_2 = _jspx_th_p_property_2.doStartTag();
    if (_jspx_th_p_property_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_property_value_nobody.reuse(_jspx_th_p_property_2);
      return true;
    }
    _jspx_tagPool_p_property_value_nobody.reuse(_jspx_th_p_property_2);
    return false;
  }

  private boolean _jspx_meth_p_property_3(javax.servlet.jsp.tagext.JspTag _jspx_th_p_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_p_property_3 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_p_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_p_property_3.setPageContext(_jspx_page_context);
    _jspx_th_p_property_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_p_iterator_0);
    _jspx_th_p_property_3.setValue("#p.id");
    int _jspx_eval_p_property_3 = _jspx_th_p_property_3.doStartTag();
    if (_jspx_th_p_property_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_property_value_nobody.reuse(_jspx_th_p_property_3);
      return true;
    }
    _jspx_tagPool_p_property_value_nobody.reuse(_jspx_th_p_property_3);
    return false;
  }
}
