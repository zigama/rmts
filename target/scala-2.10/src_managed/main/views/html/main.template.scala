
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import play.i18n._


Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <head>
        <title>RBC -OPD Division Malaria Tracking & Surveillance System - Home Page</title>
       <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.69*/routes/*7.75*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*7.118*/(""""> 
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*8.70*/routes/*8.76*/.Assets.at("stylesheets/main.css"))),format.raw/*8.110*/(""""> 
    	<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*9.52*/routes/*9.58*/.Assets.at("stylesheets/datepicker.css"))),format.raw/*9.98*/("""" >
    	 
    	 <script src=""""),_display_(Seq[Any](/*11.21*/routes/*11.27*/.Assets.at("bootstrap/js/jquery-2.1.1.js"))),format.raw/*11.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Assets.at("javascripts/bootstrap-datepicker.js"))),format.raw/*12.78*/("""" type="text/javascript"></script>
        

		<script type="text/javascript" charset="utf-8">
         	$(function() """),format.raw/*16.24*/("""{"""),format.raw/*16.25*/("""
					        $("#dob").datepicker("""),format.raw/*17.35*/("""{"""),format.raw/*17.36*/("""format:'yyyy-mm-dd'"""),format.raw/*17.55*/("""}"""),format.raw/*17.56*/(""");
					    """),format.raw/*18.10*/("""}"""),format.raw/*18.11*/(""");
        </script>
    </head>
    <body>
        
        <header class="topbar">
            <h1 class="fill"> <span> <img height="80px" width="250px" src=""""),_display_(Seq[Any](/*24.77*/routes/*24.83*/.Assets.at("bootstrap/img/logo.png"))),format.raw/*24.119*/("""" /></span>
                <span class="tab"> <a href=""""),_display_(Seq[Any](/*25.46*/routes/*25.52*/.Application.index())),format.raw/*25.72*/("""">
                    OPD Division &mdash; Malaria Tracking &amp; Surveillance System &mdash; Dashboard
                </a>
               </span>
               <div style="position:top; float:right; padding: 0px 0px 0px 0px;">
               	<span >
               		<a href=""""),_display_(Seq[Any](/*31.28*/routes/*31.34*/.Application.logout())),format.raw/*31.55*/("""">
               			<span class="btn primary">"""),_display_(Seq[Any](/*32.46*/session/*32.53*/.get("email"))),format.raw/*32.66*/("""
               			</br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
               			"""),_display_(Seq[Any](/*34.20*/Messages/*34.28*/.get("logout"))),format.raw/*34.42*/("""
               			</span>
               			</a>
               	</span>
               </div>
            </h1>
            
        </header>
        
        <section id="main">
            """),_display_(Seq[Any](/*44.14*/content)),format.raw/*44.21*/("""            
        </section>
        
        <section id="footer" style="background-color:#eee;">
        	<p> <strong>Copyright</strong> RBC -OPD Division &copy; 2015 </p>
        	<p> Developed by <strong>PIVOT ACCESS</strong> </p>
        </section>
        
        
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 04 09:30:03 CAT 2015
                    SOURCE: /home/zigama/workspace/rmts/app/views/main.scala.html
                    HASH: 6a0651520bbed57248e6ede5b25ec364e704ec82
                    MATRIX: 778->1|921->31|948->52|1177->246|1191->252|1256->295|1364->368|1378->374|1434->408|1524->463|1538->469|1599->509|1666->540|1681->546|1745->588|1838->645|1853->651|1924->700|2070->818|2099->819|2162->854|2191->855|2238->874|2267->875|2307->887|2336->888|2533->1049|2548->1055|2607->1091|2700->1148|2715->1154|2757->1174|3075->1456|3090->1462|3133->1483|3217->1531|3233->1538|3268->1551|3408->1655|3425->1663|3461->1677|3692->1872|3721->1879
                    LINES: 26->1|30->1|31->3|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|39->11|39->11|39->11|40->12|40->12|40->12|44->16|44->16|45->17|45->17|45->17|45->17|46->18|46->18|52->24|52->24|52->24|53->25|53->25|53->25|59->31|59->31|59->31|60->32|60->32|60->32|62->34|62->34|62->34|72->44|72->44
                    -- GENERATED --
                */
            