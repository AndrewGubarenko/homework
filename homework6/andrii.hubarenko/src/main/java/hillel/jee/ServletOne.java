package hillel.jee;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

public class ServletOne extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Writer writer = response.getWriter();
        writer.write("<!doctype html>\n" +
                "<html>\n" +
                "<head>\n" +
                "\t<meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\">\n" +
                "\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\">\n" +
                "\t<title>Whitesquare</title>\n" +
                "\t<style type=\"text/css\">\n" +
                "\tbody {\tcolor: #8f8f8f;\tfont: 12px Tahoma, sans-serif;\tbackground: #f8f8f8 url(../images/bg.png);\tborder-top: 5px solid #7e7e7e;\tmargin: 0;}img {\tborder: 0;}input[type=\"text\"] {\tbackground-color: #f3f3f3;\tborder: 1px solid #e7e7e7;\theight: 30px;\tcolor: #b2b2b2;\tpadding: 0 10px;\tvertical-align: top;}button {\tcolor: #fff;\tbackground-color: #29c5e6;\tborder: none;\theight: 32px;\tfont-family: 'Oswald', sans-serif;}nav {\tbackground: #f3f3f3;\tborder: 1px solid #e7e7e7;}#heading {\tbackground: transparent url(../images/h1-bg.png);\tmargin: 30px 0;\tpadding-left: 20px;}h1 {\tdisplay: inline-block;\tcolor: #7e7e7e;\tfont: 40px/40px 'Oswald', sans-serif;\tbackground: url(../images/bg.png);\tmargin: 0;\tpadding: 0 10px;}#wrapper {\tmax-width: 960px;\tmargin: auto;}header {\tpadding: 20px 0;}aside {\tfloat: left;\twidth: 250px;}aside > h2 {\tbackground: #29c5e6;\tfont: 14px 'Oswald', sans-serif;\tcolor: #fff;\tpadding: 10px;\tmargin: 30px 0 0 0;}aside > p {\tbackground: #f3f3f3;\tborder: 1px solid #e7e7e7;\tpadding: 10px;\tmargin: 0;}section {\tmargin-left: 280px;\tpadding-bottom: 50px;}form[name=\"search\"] {\tfloat: right;}footer {\tbackground-color: #7e7e7e;}nav a {\ttext-decoration: none;}nav ul {\tmargin: 0;\tpadding: 0;}nav li {\tlist-style-position: inside;\tfont: 14px 'Oswald', sans-serif;\tpadding: 10px;}.top-menu li {\tdisplay: inline-block;\tpadding: 10px 30px;\tmargin: 0;}.top-menu li.active {\tbackground: #29c5e6;\tcolor: #fff;}.top-menu a {\tcolor: #b2b2b2;}.aside-menu li {\tfont-weight: 300;\tlist-style-type: square;\tborder-top: 1px solid #e7e7e7;}.aside-menu li:first-child {\tborder: none;}.aside-menu li.active {\tcolor: #29c5e6;}.aside-menu a {\tcolor: #8f8f8f;}blockquote {\tmargin: 0;\tbackground: #29c5e6;\tpadding: 10px 20px;\tfont-family: 'Oswald', sans-serif;\tfont-weight: 300;}blockquote p {\tcolor: #fff;\tfont-style: italic;\tfont-size: 33px;\tmargin: 0;}blockquote cite {\tdisplay: block;\tfont-size: 20px;\tfont-style: normal;\tcolor: #1d8ea6;\tmargin: 0;\ttext-align: right;}figure {\tdisplay: inline-block;\tmargin: 0;\tfont-family: 'Oswald', sans-serif;\tfont-weight: 300;}figure img {\tdisplay: block;\tborder: 1px solid #fff;\toutline: 1px solid #c9c9c9;}section > figure + figure {\tmargin-left: 28px;}p {\tmargin: 20px 0;}section > h2 {\tbackground: #29c5e6;\tfont: 30px 'Oswald', sans-serif;\tfont-weight: 300;\tcolor: #fff;\tpadding: 0 10px;\tmargin: 30px 0 0 0;}figure figcaption {\tfont-size: 16px;\tfont-weight: 300;\tmargin-top: 5px;}figure figcaption span {\tdisplay: block;\tfont-size: 14px;\tcolor: #29c5e6;}.team-row figure {\tmargin-top: 20px;}.team-row figure + figure {\tmargin-left: 43px;}footer {\tbackground: #7e7e7e;\tcolor: #dbdbdb;\tfont-size: 11px;}#footer {\tmax-width: 960px;\tmargin: auto;\tpadding: 10px 0;\theight: 90px;}footer h3 {\tfont: 14px 'Oswald', sans-serif;\tcolor: #fff;\tborder-bottom: 1px solid #919191;\tmargin: 0 0 10px 0;}footer a {\tcolor: #dbdbdb;}#twitter time a {\tcolor: #b4aeae;}footer p {\tmargin: 5px 0;}#twitter {\tfloat: left;\twidth: 300px;}#twitter p {\tpadding-right: 15px;}#sitemap {\twidth: 150px;\tfloat: left;\tmargin-left: 20px;\tpadding-right: 15px;}#sitemap div {\tdisplay: inline-block;}#sitemap div + div {\tmargin-left: 40px;}#sitemap a {\tdisplay: block;\ttext-decoration: none;\tfont-size: 12px;\tmargin-bottom: 5px;}#sitemap a:hover {\ttext-decoration: underline;}#social {\tfloat: left;\tmargin-left: 20px;\twidth: 130px;}.social-icon {\twidth: 30px;\theight: 30px;\tbackground: url(../images/social.png) no-repeat;\tdisplay: inline-block;\tmargin-right: 10px;}.social-icon-small  {\twidth: 16px;\theight: 16px;\tbackground: url(../images/social-small.png) no-repeat;\tdisplay: inline-block;\tmargin: 5px 6px 0 0;}.twitter {\tbackground-position: 0 0;}.facebook {\tbackground-position: -30px 0;}.google-plus {\tbackground-position: -60px 0;}.vimeo {\tbackground-position: 0 0;}.youtube {\tbackground-position: -16px 0;}.flickr {\tbackground-position: -32px 0;}.instagram {\tbackground-position: -48px 0;}.rss {\tbackground-position: -64px 0;}#footer-logo {\tfloat: right;\tmargin-top: 20px;\tfont-size: 10px;\ttext-align: right;}\n" +
                "\n" +
                "</style>" +
                "\t<!--[if lt IE 9]>\n" +
                "\t<script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\"></script>\n" +
                "\t<![endif]-->\n" +
                "</head>\n" +
                "<body>\n" +
                "\t<div id=\"wrapper\">\n" +
                "\t\t<header>\n" +
                "\t\t\t<a href=\"/\"><img src=\"images/logo.png\" alt=\"Whitesquare logo\"></a>\n" +
                "\t\t\t<form name=\"search\" action=\"#\" method=\"get\">\n" +
                "\t\t\t\t<input type=\"text\" name=\"q\" placeholder=\"Search\"><button type=\"submit\">GO</button>\n" +
                "\t\t\t</form>\n" +
                "\t\t</header>\n" +
                "\t\t<nav>\n" +
                "\t\t\t<ul class=\"top-menu\">\n" +
                "\t\t\t\t<li><a href=\"/home/\">HOME</a></li>\n" +
                "\t\t\t\t<li class=\"active\">ABOUT US</li>\n" +
                "\t\t\t\t<li><a href=\"/services/\">SERVICES</a></li>\n" +
                "\t\t\t\t<li><a href=\"/partners/\">PARTNERS</a></li>\n" +
                "\t\t\t\t<li><a href=\"/customers/\">CUSTOMERS</a></li>\n" +
                "\t\t\t\t<li><a href=\"/projects/\">PROJECTS</a></li>\n" +
                "\t\t\t\t<li><a href=\"/careers/\">CAREERS</a></li>\n" +
                "\t\t\t\t<li><a href=\"/contact/\">CONTACT</a></li>\n" +
                "\t\t\t</ul>\n" +
                "\t\t</nav>\n" +
                "\t\t<div id=\"heading\">\n" +
                "\t\t\t<h1>ABOUT US</h1>\n" +
                "\t\t</div>\n" +
                "\t\t<aside>\n" +
                "\t\t\t<nav>\n" +
                "\t\t\t\t<ul class=\"aside-menu\">\n" +
                "\t\t\t\t\t<li class=\"active\">LOREM IPSUM</li>\n" +
                "\t\t\t\t\t<li><a href=\"/donec/\">DONEC TINCIDUNT LAOREET</a></li>\n" +
                "\t\t\t\t\t<li><a href=\"/vestibulum/\">VESTIBULUM ELIT</a></li>\n" +
                "\t\t\t\t\t<li><a href=\"/etiam/\">ETIAM PHARETRA</a></li>\n" +
                "\t\t\t\t\t<li><a href=\"/phasellus/\">PHASELLUS PLACERAT</a></li>\n" +
                "\t\t\t\t\t<li><a href=\"/cras/\">CRAS ET NISI VITAE ODIO</a></li>\n" +
                "\t\t\t\t</ul>\n" +
                "\t\t\t</nav>\n" +
                "\t\t\t<h2>OUR OFFICES</h2>\n" +
                "\t\t\t<p>\n" +
                "\t\t\t\t<img src=\"images/sample.png\" width=\"230\" height=\"180\" alt=\"Our offices\">\n" +
                "\t\t\t</p>\n" +
                "\t\t</aside>\n" +
                "\t\t<section>\n" +
                "\t\t\t<blockquote>\n" +
                "\t\t\t\t<p>\n" +
                "\t\t\t\t\t&ldquo;QUISQUE IN ENIM VELIT, AT DIGNISSIM EST.\n" +
                "\t\t\t\t\tNULLA UL CORPER, DOLOR AC PELLENTESQUE PLACERAT, JUSTO TELLUS GRAVIDA ERAT, VEL PORTTITOR LIBERO ERAT.&rdquo;\n" +
                "\t\t\t\t</p>\n" +
                "\t\t\t\t<cite>John Doe, Lorem Ipsum</cite>\n" +
                "\t\t\t</blockquote>\n" +
                "\n" +
                "\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean non neque ac sem accumsan rhoncus ut ut turpis. In hac habitasse platea dictumst. Proin eget nisi erat, et feugiat arcu. Duis semper porttitor lectus, ac pharetra erat imperdiet nec. Morbi interdum felis nulla. Aenean eros orci, pellentesque sed egestas vitae, auctor aliquam nisi. Nulla nec libero eget sem rutrum iaculis. Quisque in enim velit, at dignissim est. Nulla ullamcorper, dolor ac pellentesque placerat, justo tellus gravida erat, vel porttitor libero erat condimentum metus. Donec sodales aliquam orci id suscipit. Proin sed risus sit amet massa ultrices laoreet quis a erat. Aliquam et metus id erat vulputate egestas. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.</p>\n" +
                "\t\t\t<p>Donec vel nisl nibh. Aenean quam tortor, tempus sit amet mattis dapibus, egestas tempor dui. Duis vestibulum imperdiet risus pretium pretium. Nunc vitae porta ligula. Vestibulum sit amet nulla quam. Aenean lacinia, ante vitae sodales sagittis, leo felis bibendum neque, mattis sagittis neque urna vel magna. Sed at sem vitae lorem blandit feugiat.</p>\n" +
                "\t\t\t<p>Donec vel orci purus, ut ornare orci. Aenean rutrum pellentesque quam. Quisque gravida adipiscing augue, eget commodo augue egestas varius. Integer volutpat, tellus porta tincidunt sodales, lacus est tempus odio, fringilla blandit tortor lectus ut sem. Pellentesque nec sem lacus, sit amet consequat neque. Etiam varius urna quis arcu cursus in consectetur dui tincidunt. Quisque arcu orci, lacinia eget pretium vel, iaculis pellentesque nibh. Etiam cursus lacus eget neque viverra vestibulum. Aliquam erat volutpat. Duis pulvinar tellus ut urna facilisis mollis. Maecenas ac pharetra dui. Pellentesque neque ante, luctus eget congue eget, rhoncus vel mauris. Duis nisi magna, aliquet a convallis non, venenatis at nisl. Nunc at quam eu magna malesuada dignissim. Duis bibendum iaculis felis, eu venenatis risus sodales non. In ligula mi, faucibus eu tristique sed, vulputate rutrum dolor.</p>\n" +
                "\n" +
                "\t\t\t<figure>\n" +
                "\t\t\t\t<img src=\"images/sample.png\" width=\"320\" height=\"175\" alt=\"\">\n" +
                "\t\t\t</figure>\n" +
                "\t\t\t<figure>\n" +
                "\t\t\t\t<img src=\"images/sample.png\" width=\"320\" height=\"175\" alt=\"\">\n" +
                "\t\t\t</figure>\n" +
                "\n" +
                "\t\t\t<h2>OUR TEAM</h2>\n" +
                "\t\t\t<div class=\"team-row\">\n" +
                "\t\t\t\t<figure>\n" +
                "\t\t\t\t\t<img src=\"images/sample.png\" width=\"96\" height=\"96\" alt=\"\">\n" +
                "\t\t\t\t\t<figcaption>John Doe<span>ceo</span></figcaption>\n" +
                "\t\t\t\t</figure>\n" +
                "\t\t\t\t<figure>\n" +
                "\t\t\t\t\t<img src=\"images/sample.png\" width=\"96\" height=\"96\" alt=\"\">\n" +
                "\t\t\t\t\t<figcaption>Saundra Pittsley<span>team leader</span></figcaption>\n" +
                "\t\t\t\t</figure>\n" +
                "\t\t\t\t<figure>\n" +
                "\t\t\t\t\t<img src=\"images/sample.png\" width=\"96\" height=\"96\" alt=\"\">\n" +
                "\t\t\t\t\t<figcaption>Julio Simser<span>senior developer</span></figcaption>\n" +
                "\t\t\t\t</figure>\n" +
                "\t\t\t\t<figure>\n" +
                "\t\t\t\t\t<img src=\"images/sample.png\" width=\"96\" height=\"96\" alt=\"\">\n" +
                "\t\t\t\t\t<figcaption>Margery Venuti<span>senior developer</span></figcaption>\n" +
                "\t\t\t\t</figure>\n" +
                "\t\t\t\t<figure>\n" +
                "\t\t\t\t\t<img src=\"images/sample.png\" width=\"96\" height=\"96\" alt=\"\">\n" +
                "\t\t\t\t\t<figcaption>Fernando Tondrea<span>developer</span></figcaption>\n" +
                "\t\t\t\t</figure>\n" +
                "\t\t\t</div>\n" +
                "\t\t\t<div class=\"team-row\">\n" +
                "\t\t\t\t<figure>\n" +
                "\t\t\t\t\t<img src=\"images/sample.png\" width=\"96\" height=\"96\" alt=\"\">\n" +
                "\t\t\t\t\t<figcaption>Ericka Nobriga<span>art director</span></figcaption>\n" +
                "\t\t\t\t</figure>\n" +
                "\t\t\t\t<figure>\n" +
                "\t\t\t\t\t<img src=\"images/sample.png\" width=\"96\" height=\"96\" alt=\"\">\n" +
                "\t\t\t\t\t<figcaption>Cody Rousselle<span>senior ui designer</span></figcaption>\n" +
                "\t\t\t\t</figure>\n" +
                "\t\t\t\t<figure>\n" +
                "\t\t\t\t\t<img src=\"images/sample.png\" width=\"96\" height=\"96\" alt=\"\">\n" +
                "\t\t\t\t\t<figcaption>Erik Wollman<span>senior ui designer</span></figcaption>\n" +
                "\t\t\t\t</figure>\n" +
                "\t\t\t\t<figure>\n" +
                "\t\t\t\t\t<img src=\"images/sample.png\" width=\"96\" height=\"96\" alt=\"\">\n" +
                "\t\t\t\t\t<figcaption>Dona Shoff<span>ux designer</span></figcaption>\n" +
                "\t\t\t\t</figure>\n" +
                "\t\t\t\t<figure>\n" +
                "\t\t\t\t\t<img src=\"images/sample.png\" width=\"96\" height=\"96\" alt=\"\">\n" +
                "\t\t\t\t\t<figcaption>Darryl Brunton<span>ui designer</span></figcaption>\n" +
                "\t\t\t\t</figure>\n" +
                "\t\t\t</div>\n" +
                "\t\t</section>\n" +
                "\t</div>\n" +
                "\t<footer>\n" +
                "\t\t<div id=\"footer\">\n" +
                "\t\t\t<div id=\"twitter\">\n" +
                "\t\t\t\t<h3>TWITTER FEED</h3>\n" +
                "\t\t\t\t<time datetime=\"2012-10-23\"><a href=\"#\">23 oct</a></time>\n" +
                "\t\t\t\t<p>In ultricies pellentesque massa a porta. Aliquam ipsum enim, hendrerit ut porta nec, ullamcorper et nulla. In eget mi dui, sit amet scelerisque nunc. Aenean aug</p>\n" +
                "\t\t\t</div>\n" +
                "\t\t\t<div id=\"sitemap\">\n" +
                "\t\t\t\t<h3>SITEMAP</h3>\n" +
                "\t\t\t\t<div>\n" +
                "\t\t\t\t\t<a href=\"/home/\">Home</a>\n" +
                "\t\t\t\t\t<a href=\"/about/\">About</a>\n" +
                "\t\t\t\t\t<a href=\"/services/\">Services</a>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t\t<div>\n" +
                "\t\t\t\t\t<a href=\"/partners/\">Partners</a>\n" +
                "\t\t\t\t\t<a href=\"/customers/\">Support</a>\n" +
                "\t\t\t\t\t<a href=\"/contact/\">Contact</a>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t</div>\n" +
                "\t\t\t<div id=\"social\">\n" +
                "\t\t\t\t<h3>SOCIAL NETWORKS</h3>\n" +
                "\t\t\t\t<a href=\"http://twitter.com/\" class=\"social-icon twitter\"></a>\n" +
                "\t\t\t\t<a href=\"http://facebook.com/\" class=\"social-icon facebook\"></a>\n" +
                "\t\t\t\t<a href=\"http://plus.google.com/\" class=\"social-icon google-plus\"></a>\n" +
                "\t\t\t\t<a href=\"http://vimeo.com/\" class=\"social-icon-small vimeo\"></a>\n" +
                "\t\t\t\t<a href=\"http://youtube.com/\" class=\"social-icon-small youtube\"></a>\n" +
                "\t\t\t\t<a href=\"http://flickr.com/\" class=\"social-icon-small flickr\"></a>\n" +
                "\t\t\t\t<a href=\"http://instagram.com/\" class=\"social-icon-small instagram\"></a>\n" +
                "\t\t\t\t<a href=\"/rss/\" class=\"social-icon-small rss\"></a>\n" +
                "\t\t\t</div>\n" +
                "\t\t\t<div id=\"footer-logo\">\n" +
                "\t\t\t\t<a href=\"/\"><img src=\"images/footer-logo.png\" alt=\"Whitesquare logo\"></a>\n" +
                "\t\t\t\t<p>Copyright &copy; 2012 Whitesquare. A <a href=\"http://pcklab.com\">pcklab</a> creation </p>\n" +
                "\t\t\t</div>\n" +
                "\t\t</div>\n" +
                "\t</footer>\n" +
                "</body>\n" +
                "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        super.doPost(request, response);
    }
}
