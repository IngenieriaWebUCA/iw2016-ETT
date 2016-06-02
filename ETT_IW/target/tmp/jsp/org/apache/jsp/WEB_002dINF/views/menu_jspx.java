package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/tags/menu/menu.tagx");
    _jspx_dependants.add("/WEB-INF/tags/menu/category.tagx");
    _jspx_dependants.add("/WEB-INF/tags/menu/item.tagx");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sec_authorize_access;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_sec_authorize_access = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_sec_authorize_access.release();
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
      response.setContentType("text/xml;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<div version=\"2.0\" id=\"menu\">");
      if (_jspx_meth_menu_menu_0(_jspx_page_context))
        return;
      out.write("</div>");
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

  private boolean _jspx_meth_menu_menu_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:menu
    org.apache.jsp.tag.web.menu.menu_tagx _jspx_th_menu_menu_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.menu_tagx.class) : new org.apache.jsp.tag.web.menu.menu_tagx();
    _jspx_th_menu_menu_0.setJspContext(_jspx_page_context);
    _jspx_th_menu_menu_0.setZ("user-managed");
    _jspx_th_menu_menu_0.setId("_menu");
    _jspx_th_menu_menu_0.setJspBody(new menu_jspxHelper( 0, _jspx_page_context, _jspx_th_menu_menu_0, null));
    _jspx_th_menu_menu_0.doTag();
    return false;
  }

  private boolean _jspx_meth_sec_authorize_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_authorize_0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_sec_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_authorize_0.setPageContext(_jspx_page_context);
    _jspx_th_sec_authorize_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_sec_authorize_0.setAccess("hasAnyRole('ROLE_EMPRESA',,'ROLE_DEMANDANTE','ROLE_ANONYMOUS', 'ROLE_ADMIN','ROLE_GESTOR')");
    int _jspx_eval_sec_authorize_0 = _jspx_th_sec_authorize_0.doStartTag();
    if (_jspx_eval_sec_authorize_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_meth_menu_category_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sec_authorize_0, _jspx_page_context))
        return true;
    }
    if (_jspx_th_sec_authorize_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_0);
    return false;
  }

  private boolean _jspx_meth_menu_category_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_authorize_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_0.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_0.setParent(_jspx_th_sec_authorize_0);
    _jspx_th_menu_category_0.setZ("hAFpA26H1SoEOzHx9qIuh9xoiFY=");
    _jspx_th_menu_category_0.setId("c_oferta");
    _jspx_th_menu_category_0.setJspBody(new menu_jspxHelper( 1, _jspx_page_context, _jspx_th_menu_category_0, null));
    _jspx_th_menu_category_0.doTag();
    return false;
  }

  private boolean _jspx_meth_sec_authorize_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_authorize_1 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_sec_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_authorize_1.setPageContext(_jspx_page_context);
    _jspx_th_sec_authorize_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_sec_authorize_1.setAccess("hasAnyRole('ROLE_EMPRESA', 'ROLE_ADMIN','ROLE_GESTOR')");
    int _jspx_eval_sec_authorize_1 = _jspx_th_sec_authorize_1.doStartTag();
    if (_jspx_eval_sec_authorize_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_meth_menu_item_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sec_authorize_1, _jspx_page_context))
        return true;
    }
    if (_jspx_th_sec_authorize_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_1);
    return false;
  }

  private boolean _jspx_meth_menu_item_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_authorize_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_0.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_0.setParent(_jspx_th_sec_authorize_1);
    _jspx_th_menu_item_0.setZ("XL2la3mMU88KBAljrX+q6go8ogw=");
    _jspx_th_menu_item_0.setUrl("/ofertas?form");
    _jspx_th_menu_item_0.setMessageCode("global_menu_new");
    _jspx_th_menu_item_0.setId("i_oferta_new");
    _jspx_th_menu_item_0.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_1.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_1.setParent(_jspx_parent);
    _jspx_th_menu_item_1.setZ("YFpuok8se1icruycVP1Ngny6x3c=");
    _jspx_th_menu_item_1.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/ofertas?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_1.setMessageCode("global_menu_list");
    _jspx_th_menu_item_1.setId("i_oferta_list");
    _jspx_th_menu_item_1.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_2.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_2.setParent(_jspx_parent);
    _jspx_th_menu_item_2.setZ("zm1TgkQaCA7A5vmrF3bq/uOkkrA=");
    _jspx_th_menu_item_2.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/ofertas?find=ByEstado&form&page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_2.setMessageCode("global_menu_find");
    _jspx_th_menu_item_2.setId("fi_oferta_estado");
    _jspx_th_menu_item_2.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_3.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_3.setParent(_jspx_parent);
    _jspx_th_menu_item_3.setZ("8u+tfhPfTfBpvk2P1VPAe/vkH5g=");
    _jspx_th_menu_item_3.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/ofertas?find=ByLocalizacion&form&page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_3.setMessageCode("global_menu_find");
    _jspx_th_menu_item_3.setId("fi_oferta_localizacion");
    _jspx_th_menu_item_3.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_4.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_4.setParent(_jspx_parent);
    _jspx_th_menu_item_4.setZ("ZNlcq9D77F7ElQfuj15xom4ej+I=");
    _jspx_th_menu_item_4.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/ofertas?find=ByPuestotrabajo&form&page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_4.setMessageCode("global_menu_find");
    _jspx_th_menu_item_4.setId("fi_oferta_puestotrabajo");
    _jspx_th_menu_item_4.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_5.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_5.setParent(_jspx_parent);
    _jspx_th_menu_item_5.setZ("0EiU/wZeN5qfhLTxXgqp8BQCxDg=");
    _jspx_th_menu_item_5.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/ofertas?find=ByTitulaciones&form&page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_5.setMessageCode("global_menu_find");
    _jspx_th_menu_item_5.setId("fi_oferta_titulaciones");
    _jspx_th_menu_item_5.doTag();
    return false;
  }

  private boolean _jspx_meth_sec_authorize_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_authorize_2 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_sec_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_authorize_2.setPageContext(_jspx_page_context);
    _jspx_th_sec_authorize_2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_sec_authorize_2.setAccess("hasAnyRole('ROLE_DEMANDANTE', 'ROLE_ADMIN')");
    int _jspx_eval_sec_authorize_2 = _jspx_th_sec_authorize_2.doStartTag();
    if (_jspx_eval_sec_authorize_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_meth_menu_category_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_sec_authorize_2, _jspx_page_context))
        return true;
    }
    if (_jspx_th_sec_authorize_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_2);
    return false;
  }

  private boolean _jspx_meth_menu_category_1(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_authorize_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_1.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_1.setParent(_jspx_th_sec_authorize_2);
    _jspx_th_menu_category_1.setZ("IeUE1qUB60SvsVjUpyu3CKjAwcQ=");
    _jspx_th_menu_category_1.setId("c_formacion");
    _jspx_th_menu_category_1.setJspBody(new menu_jspxHelper( 2, _jspx_page_context, _jspx_th_menu_category_1, null));
    _jspx_th_menu_category_1.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_6.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_6.setParent(_jspx_parent);
    _jspx_th_menu_item_6.setZ("J5LIhWh+qugo3BonD7DqT+MNhdk=");
    _jspx_th_menu_item_6.setUrl("/formacions?form");
    _jspx_th_menu_item_6.setMessageCode("global_menu_new");
    _jspx_th_menu_item_6.setId("i_formacion_new");
    _jspx_th_menu_item_6.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_7.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_7.setParent(_jspx_parent);
    _jspx_th_menu_item_7.setZ("HUwg6eWuyi/+bXE5Mnr+igrwIkc=");
    _jspx_th_menu_item_7.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/formacions?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_7.setMessageCode("global_menu_list");
    _jspx_th_menu_item_7.setId("i_formacion_list");
    _jspx_th_menu_item_7.doTag();
    return false;
  }

  private boolean _jspx_meth_sec_authorize_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_authorize_3 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_sec_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_authorize_3.setPageContext(_jspx_page_context);
    _jspx_th_sec_authorize_3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_sec_authorize_3.setAccess("hasAnyRole('ROLE_DEMANDANTE', 'ROLE_ADMIN')");
    int _jspx_eval_sec_authorize_3 = _jspx_th_sec_authorize_3.doStartTag();
    if (_jspx_eval_sec_authorize_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_meth_menu_category_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_sec_authorize_3, _jspx_page_context))
        return true;
    }
    if (_jspx_th_sec_authorize_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_3);
      throw new SkipPageException();
    }
    _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_3);
    return false;
  }

  private boolean _jspx_meth_menu_category_2(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_authorize_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_2.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_2.setParent(_jspx_th_sec_authorize_3);
    _jspx_th_menu_category_2.setZ("QezE9KDE8z1/Cf8qoH7oMZL9Imw=");
    _jspx_th_menu_category_2.setId("c_titulaciones");
    _jspx_th_menu_category_2.setJspBody(new menu_jspxHelper( 3, _jspx_page_context, _jspx_th_menu_category_2, null));
    _jspx_th_menu_category_2.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_8.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_8.setParent(_jspx_parent);
    _jspx_th_menu_item_8.setZ("iWUr5eyJw+FntqLd1I1rQjQh4Sw=");
    _jspx_th_menu_item_8.setUrl("/titulacioneses?form");
    _jspx_th_menu_item_8.setMessageCode("global_menu_new");
    _jspx_th_menu_item_8.setId("i_titulaciones_new");
    _jspx_th_menu_item_8.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_9(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_9.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_9.setParent(_jspx_parent);
    _jspx_th_menu_item_9.setZ("v0HyixSyFciGHrNajorDw346gyU=");
    _jspx_th_menu_item_9.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/titulacioneses?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_9.setMessageCode("global_menu_list");
    _jspx_th_menu_item_9.setId("i_titulaciones_list");
    _jspx_th_menu_item_9.doTag();
    return false;
  }

  private boolean _jspx_meth_sec_authorize_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_authorize_4 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_sec_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_authorize_4.setPageContext(_jspx_page_context);
    _jspx_th_sec_authorize_4.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_sec_authorize_4.setAccess("hasAnyRole('ROLE_DEMANDANTE', 'ROLE_ADMIN')");
    int _jspx_eval_sec_authorize_4 = _jspx_th_sec_authorize_4.doStartTag();
    if (_jspx_eval_sec_authorize_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_meth_menu_category_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_sec_authorize_4, _jspx_page_context))
        return true;
    }
    if (_jspx_th_sec_authorize_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_4);
      throw new SkipPageException();
    }
    _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_4);
    return false;
  }

  private boolean _jspx_meth_menu_category_3(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_authorize_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_3.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_3.setParent(_jspx_th_sec_authorize_4);
    _jspx_th_menu_category_3.setZ("/kYnujHesO7pz7ZhgACbsQWUGUY=");
    _jspx_th_menu_category_3.setId("c_experiencialaboral");
    _jspx_th_menu_category_3.setJspBody(new menu_jspxHelper( 4, _jspx_page_context, _jspx_th_menu_category_3, null));
    _jspx_th_menu_category_3.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_10(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_10.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_10.setParent(_jspx_parent);
    _jspx_th_menu_item_10.setZ("VCGM1SfAGKp5guKBMmAUVldXXvQ=");
    _jspx_th_menu_item_10.setUrl("/experiencialaborals?form");
    _jspx_th_menu_item_10.setMessageCode("global_menu_new");
    _jspx_th_menu_item_10.setId("i_experiencialaboral_new");
    _jspx_th_menu_item_10.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_11(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_11.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_11.setParent(_jspx_parent);
    _jspx_th_menu_item_11.setZ("KO3333t4C0fI0NpOor1wzfud1dw=");
    _jspx_th_menu_item_11.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/experiencialaborals?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_11.setMessageCode("global_menu_list");
    _jspx_th_menu_item_11.setId("i_experiencialaboral_list");
    _jspx_th_menu_item_11.doTag();
    return false;
  }

  private boolean _jspx_meth_sec_authorize_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_authorize_5 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_sec_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_authorize_5.setPageContext(_jspx_page_context);
    _jspx_th_sec_authorize_5.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_sec_authorize_5.setAccess("hasAnyRole('ROLE_ADMIN','ROLE_EMPRESA','ROLE_GESTOR' )");
    int _jspx_eval_sec_authorize_5 = _jspx_th_sec_authorize_5.doStartTag();
    if (_jspx_eval_sec_authorize_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_meth_menu_category_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_sec_authorize_5, _jspx_page_context))
        return true;
    }
    if (_jspx_th_sec_authorize_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_5);
      throw new SkipPageException();
    }
    _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_5);
    return false;
  }

  private boolean _jspx_meth_menu_category_4(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_authorize_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_4.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_4.setParent(_jspx_th_sec_authorize_5);
    _jspx_th_menu_category_4.setZ("ap7hcwTTE7QpwHyV1OnSKrPHdQc=");
    _jspx_th_menu_category_4.setId("c_demandante");
    _jspx_th_menu_category_4.setJspBody(new menu_jspxHelper( 5, _jspx_page_context, _jspx_th_menu_category_4, null));
    _jspx_th_menu_category_4.doTag();
    return false;
  }

  private boolean _jspx_meth_sec_authorize_6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_authorize_6 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_sec_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_authorize_6.setPageContext(_jspx_page_context);
    _jspx_th_sec_authorize_6.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_sec_authorize_6.setAccess("hasAnyRole('ROLE_ADMIN')");
    int _jspx_eval_sec_authorize_6 = _jspx_th_sec_authorize_6.doStartTag();
    if (_jspx_eval_sec_authorize_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_meth_menu_item_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_sec_authorize_6, _jspx_page_context))
        return true;
    }
    if (_jspx_th_sec_authorize_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_6);
      throw new SkipPageException();
    }
    _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_6);
    return false;
  }

  private boolean _jspx_meth_menu_item_12(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_authorize_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_12 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_12.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_12.setParent(_jspx_th_sec_authorize_6);
    _jspx_th_menu_item_12.setZ("8+S2ulD0VSXmoyyhDfXJ+CNxgh8=");
    _jspx_th_menu_item_12.setUrl("/demandantes?form");
    _jspx_th_menu_item_12.setMessageCode("global_menu_new");
    _jspx_th_menu_item_12.setId("i_demandante_new");
    _jspx_th_menu_item_12.doTag();
    return false;
  }

  private boolean _jspx_meth_sec_authorize_7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_authorize_7 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_sec_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_authorize_7.setPageContext(_jspx_page_context);
    _jspx_th_sec_authorize_7.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_sec_authorize_7.setAccess("hasAnyRole('ROLE_ADMIN','ROLE_EMPRESA','ROLE_GESTOR')");
    int _jspx_eval_sec_authorize_7 = _jspx_th_sec_authorize_7.doStartTag();
    if (_jspx_eval_sec_authorize_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_meth_menu_item_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_sec_authorize_7, _jspx_page_context))
        return true;
    }
    if (_jspx_th_sec_authorize_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_7);
      throw new SkipPageException();
    }
    _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_7);
    return false;
  }

  private boolean _jspx_meth_menu_item_13(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_authorize_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_13 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_13.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_13.setParent(_jspx_th_sec_authorize_7);
    _jspx_th_menu_item_13.setZ("1MtvqFaAsZmIa4hZR8pApwIOdDY=");
    _jspx_th_menu_item_13.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/demandantes?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_13.setMessageCode("global_menu_list");
    _jspx_th_menu_item_13.setId("i_demandante_list");
    _jspx_th_menu_item_13.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_14(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_14 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_14.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_14.setParent(_jspx_parent);
    _jspx_th_menu_item_14.setZ("GuN1HRDItbCjjoWEhI78S+DEwNg=");
    _jspx_th_menu_item_14.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/demandantes?find=ByExperiencia&form&page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_14.setMessageCode("global_menu_find");
    _jspx_th_menu_item_14.setId("fi_demandante_experiencia");
    _jspx_th_menu_item_14.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_15(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_15 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_15.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_15.setParent(_jspx_parent);
    _jspx_th_menu_item_15.setZ("XVvzmkX61XZZ35q0YacbBWbxMvk=");
    _jspx_th_menu_item_15.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/demandantes?find=ByFormacion&form&page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_15.setMessageCode("global_menu_find");
    _jspx_th_menu_item_15.setId("fi_demandante_formacion");
    _jspx_th_menu_item_15.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_16(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_16 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_16.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_16.setParent(_jspx_parent);
    _jspx_th_menu_item_16.setZ("jISKbqc2bdJ7935CP6uVL5pWofA=");
    _jspx_th_menu_item_16.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/demandantes?find=ByPuestosInteresa&form&page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_16.setMessageCode("global_menu_find");
    _jspx_th_menu_item_16.setId("fi_demandante_puestosinteresa");
    _jspx_th_menu_item_16.doTag();
    return false;
  }

  private boolean _jspx_meth_sec_authorize_8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_authorize_8 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_sec_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_authorize_8.setPageContext(_jspx_page_context);
    _jspx_th_sec_authorize_8.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_sec_authorize_8.setAccess("hasAnyRole('ROLE_EMPRESA','ROLE_GESTOR')");
    int _jspx_eval_sec_authorize_8 = _jspx_th_sec_authorize_8.doStartTag();
    if (_jspx_eval_sec_authorize_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_meth_menu_category_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_sec_authorize_8, _jspx_page_context))
        return true;
    }
    if (_jspx_th_sec_authorize_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_8);
      throw new SkipPageException();
    }
    _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_8);
    return false;
  }

  private boolean _jspx_meth_menu_category_5(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_authorize_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_5.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_5.setParent(_jspx_th_sec_authorize_8);
    _jspx_th_menu_category_5.setZ("Xz23btBvQalu0fOfODfDsPk458k=");
    _jspx_th_menu_category_5.setId("c_localizacion");
    _jspx_th_menu_category_5.setJspBody(new menu_jspxHelper( 6, _jspx_page_context, _jspx_th_menu_category_5, null));
    _jspx_th_menu_category_5.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_17(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_17 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_17.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_17.setParent(_jspx_parent);
    _jspx_th_menu_item_17.setZ("zkpqXsv93tOCNQokTOLb8lKILmQ=");
    _jspx_th_menu_item_17.setUrl("/localizacions?form");
    _jspx_th_menu_item_17.setMessageCode("global_menu_new");
    _jspx_th_menu_item_17.setId("i_localizacion_new");
    _jspx_th_menu_item_17.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_18(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_18 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_18.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_18.setParent(_jspx_parent);
    _jspx_th_menu_item_18.setZ("InM8yKFoMAdXifon78tQEBD/Y28=");
    _jspx_th_menu_item_18.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/localizacions?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_18.setMessageCode("global_menu_list");
    _jspx_th_menu_item_18.setId("i_localizacion_list");
    _jspx_th_menu_item_18.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_6.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_6.setParent(_jspx_parent);
    _jspx_th_menu_category_6.setZ("Xy2UIEQBwGL74OghlgyDNqDXG44=");
    _jspx_th_menu_category_6.setId("c_empresa");
    _jspx_th_menu_category_6.setJspBody(new menu_jspxHelper( 7, _jspx_page_context, _jspx_th_menu_category_6, null));
    _jspx_th_menu_category_6.doTag();
    return false;
  }

  private boolean _jspx_meth_sec_authorize_9(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_authorize_9 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_sec_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_authorize_9.setPageContext(_jspx_page_context);
    _jspx_th_sec_authorize_9.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_sec_authorize_9.setAccess("hasAnyRole('ROLE_GESTOR', 'ROLE_ADMIN')");
    int _jspx_eval_sec_authorize_9 = _jspx_th_sec_authorize_9.doStartTag();
    if (_jspx_eval_sec_authorize_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_meth_menu_item_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_sec_authorize_9, _jspx_page_context))
        return true;
    }
    if (_jspx_th_sec_authorize_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_9);
      throw new SkipPageException();
    }
    _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_9);
    return false;
  }

  private boolean _jspx_meth_menu_item_19(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_authorize_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_19 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_19.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_19.setParent(_jspx_th_sec_authorize_9);
    _jspx_th_menu_item_19.setZ("TBXez8QM+aB2tzcjHN1lQJYrewc=");
    _jspx_th_menu_item_19.setUrl("/empresas?form");
    _jspx_th_menu_item_19.setMessageCode("global_menu_new");
    _jspx_th_menu_item_19.setId("i_empresa_new");
    _jspx_th_menu_item_19.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_20(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_20 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_20.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_20.setParent(_jspx_parent);
    _jspx_th_menu_item_20.setZ("/YQYlSdehDz3lrOGSSpWZYe++Zk=");
    _jspx_th_menu_item_20.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/empresas?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_20.setMessageCode("global_menu_list");
    _jspx_th_menu_item_20.setId("i_empresa_list");
    _jspx_th_menu_item_20.doTag();
    return false;
  }

  private boolean _jspx_meth_sec_authorize_10(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_authorize_10 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_sec_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_authorize_10.setPageContext(_jspx_page_context);
    _jspx_th_sec_authorize_10.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_sec_authorize_10.setAccess("hasAnyRole('ROLE_EMPRESA','ROLE_GESTOR', 'ROLE_DEMANDANTE','ROLE_ADMIN')");
    int _jspx_eval_sec_authorize_10 = _jspx_th_sec_authorize_10.doStartTag();
    if (_jspx_eval_sec_authorize_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_meth_menu_category_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_sec_authorize_10, _jspx_page_context))
        return true;
    }
    if (_jspx_th_sec_authorize_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_10);
      throw new SkipPageException();
    }
    _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_10);
    return false;
  }

  private boolean _jspx_meth_menu_category_7(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_authorize_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_7.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_7.setParent(_jspx_th_sec_authorize_10);
    _jspx_th_menu_category_7.setZ("WGH6UGn8Xk1BCQvYxOLO3zhO32w=");
    _jspx_th_menu_category_7.setId("c_inscripcion");
    _jspx_th_menu_category_7.setJspBody(new menu_jspxHelper( 8, _jspx_page_context, _jspx_th_menu_category_7, null));
    _jspx_th_menu_category_7.doTag();
    return false;
  }

  private boolean _jspx_meth_sec_authorize_11(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_authorize_11 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_sec_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_authorize_11.setPageContext(_jspx_page_context);
    _jspx_th_sec_authorize_11.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_sec_authorize_11.setAccess("hasAnyRole( 'ROLE_DEMANDANTE','ROLE_ADMIN')");
    int _jspx_eval_sec_authorize_11 = _jspx_th_sec_authorize_11.doStartTag();
    if (_jspx_eval_sec_authorize_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_meth_menu_item_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_sec_authorize_11, _jspx_page_context))
        return true;
    }
    if (_jspx_th_sec_authorize_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_11);
      throw new SkipPageException();
    }
    _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_11);
    return false;
  }

  private boolean _jspx_meth_menu_item_21(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_authorize_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_21 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_21.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_21.setParent(_jspx_th_sec_authorize_11);
    _jspx_th_menu_item_21.setZ("c/fKPa6XZ8IWr+NnUZsDmwBVAoo=");
    _jspx_th_menu_item_21.setUrl("/inscripcions?form");
    _jspx_th_menu_item_21.setMessageCode("global_menu_new");
    _jspx_th_menu_item_21.setId("i_inscripcion_new");
    _jspx_th_menu_item_21.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_22(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_22 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_22.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_22.setParent(_jspx_parent);
    _jspx_th_menu_item_22.setZ("EtJRFL7zVP9IpwmuzMtP1k1M0P0=");
    _jspx_th_menu_item_22.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/inscripcions?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_22.setMessageCode("global_menu_list");
    _jspx_th_menu_item_22.setId("i_inscripcion_list");
    _jspx_th_menu_item_22.doTag();
    return false;
  }

  private boolean _jspx_meth_sec_authorize_12(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_authorize_12 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_sec_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_authorize_12.setPageContext(_jspx_page_context);
    _jspx_th_sec_authorize_12.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_sec_authorize_12.setAccess("hasRole('ROLE_ADMIN')");
    int _jspx_eval_sec_authorize_12 = _jspx_th_sec_authorize_12.doStartTag();
    if (_jspx_eval_sec_authorize_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_meth_menu_category_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_sec_authorize_12, _jspx_page_context))
        return true;
    }
    if (_jspx_th_sec_authorize_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_12);
      throw new SkipPageException();
    }
    _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_12);
    return false;
  }

  private boolean _jspx_meth_menu_category_8(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_authorize_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_8.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_8.setParent(_jspx_th_sec_authorize_12);
    _jspx_th_menu_category_8.setZ("Ysam8XVhG5uotPoUGGxkia1RE/s=");
    _jspx_th_menu_category_8.setId("c_users");
    _jspx_th_menu_category_8.setJspBody(new menu_jspxHelper( 9, _jspx_page_context, _jspx_th_menu_category_8, null));
    _jspx_th_menu_category_8.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_23(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_23 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_23.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_23.setParent(_jspx_parent);
    _jspx_th_menu_item_23.setZ("utrdLkYms6xk5f4IDxc9zrg5FWs=");
    _jspx_th_menu_item_23.setUrl("/userses?form");
    _jspx_th_menu_item_23.setMessageCode("global_menu_new");
    _jspx_th_menu_item_23.setId("i_users_new");
    _jspx_th_menu_item_23.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_24(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_24 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_24.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_24.setParent(_jspx_parent);
    _jspx_th_menu_item_24.setZ("tqSwojZmRduyx4xtHWcJzgbgtJk=");
    _jspx_th_menu_item_24.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/userses?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_24.setMessageCode("global_menu_list");
    _jspx_th_menu_item_24.setId("i_users_list");
    _jspx_th_menu_item_24.doTag();
    return false;
  }

  private class menu_jspxHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public menu_jspxHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_sec_authorize_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_sec_authorize_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_sec_authorize_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_sec_authorize_4((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_sec_authorize_5((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_sec_authorize_8((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_6((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_sec_authorize_10((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_sec_authorize_12((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_sec_authorize_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_4((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_5((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke2( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_6((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_7((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke3( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_8((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_9((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke4( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_10((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_11((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke5( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_sec_authorize_6((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_sec_authorize_7((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_14((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_15((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_16((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke6( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_17((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_18((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke7( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_sec_authorize_9((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_20((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke8( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_sec_authorize_11((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_22((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke9( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_23((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_24((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
          case 1:
            invoke1( out );
            break;
          case 2:
            invoke2( out );
            break;
          case 3:
            invoke3( out );
            break;
          case 4:
            invoke4( out );
            break;
          case 5:
            invoke5( out );
            break;
          case 6:
            invoke6( out );
            break;
          case 7:
            invoke7( out );
            break;
          case 8:
            invoke8( out );
            break;
          case 9:
            invoke9( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
