
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[Application.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import play.i18n._


Seq[Any](format.raw/*1.33*/("""
"""),format.raw/*3.1*/("""
<html>
    <head>
         <title>"""),_display_(Seq[Any](/*6.18*/Messages/*6.26*/.get("RBC -OPD Division - Malaria Tarcking & Surveillance System"))),format.raw/*6.92*/("""</title>
    <link rel="icon" type="image/png" href=""""),_display_(Seq[Any](/*7.46*/routes/*7.52*/.Assets.at("bootstrap/img/logo.png"))),format.raw/*7.88*/("""" />
    <link href=""""),_display_(Seq[Any](/*8.18*/routes/*8.24*/.Assets.at("bootstrap/css/bootstrap.min.css"))),format.raw/*8.69*/("""" rel="stylesheet">
    <link href=""""),_display_(Seq[Any](/*9.18*/routes/*9.24*/.Assets.at("bootstrap/font-awesome/css/font-awesome.css"))),format.raw/*9.81*/("""" rel="stylesheet">
    <link href=""""),_display_(Seq[Any](/*10.18*/routes/*10.24*/.Assets.at("bootstrap/css/animate.css"))),format.raw/*10.63*/("""" rel="stylesheet">
    <link href=""""),_display_(Seq[Any](/*11.18*/routes/*11.24*/.Assets.at("bootstrap/css/style.css"))),format.raw/*11.61*/("""" rel="stylesheet">
    </head>
    <body class="gray-bg">
 <div class="middle-box text-center loginscreen  animated fadeInDown">
        <div>
            <div>
                 <img src=""""),_display_(Seq[Any](/*17.29*/routes/*17.35*/.Assets.at("bootstrap/img/logo.png"))),format.raw/*17.71*/(""""/>
            </div>
            <div>
            	<p></br></br>
            	<h3 id=""> Malaria Tarcking & Surveillance System </h3>
            	</br></br>
            	</p>
            </div>
             """),_display_(Seq[Any](/*25.15*/helper/*25.21*/.form(routes.Application.authenticate)/*25.59*/ {_display_(Seq[Any](format.raw/*25.61*/("""
"""),_display_(Seq[Any](/*26.2*/if(flash.contains("error"))/*26.29*/ {_display_(Seq[Any](format.raw/*26.31*/("""
    <p class="success">
        """),_display_(Seq[Any](/*28.10*/flash/*28.15*/.get("error"))),format.raw/*28.28*/("""
    </p>
""")))})),format.raw/*30.2*/("""
"""),_display_(Seq[Any](/*31.2*/if(flash.contains("success"))/*31.31*/ {_display_(Seq[Any](format.raw/*31.33*/("""
    <p class="success">
        """),_display_(Seq[Any](/*33.10*/flash/*33.15*/.get("success"))),format.raw/*33.30*/("""
    </p>
""")))})),format.raw/*35.2*/("""
                  <div class="form-group">
                    <input type="email" class="form-control" name="email" placeholder="Email" value=""""),_display_(Seq[Any](/*37.103*/form("email")/*37.116*/.value)),format.raw/*37.122*/("""" required="">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control"  name="password" placeholder="Password" required="">
                </div>
             <!--   <button type="submit" class="btn btn-primary block full-width m-b">Login</button> -->
                 <button type="submit" class="btn btn-w-m btn-success full-width m-b">"""),_display_(Seq[Any](/*43.88*/Messages/*43.96*/.get("login"))),format.raw/*43.109*/("""</button>

                
            """)))})),format.raw/*46.14*/("""
            <p class="m-t"> <small>"""),_display_(Seq[Any](/*47.37*/Messages/*47.45*/.get("RBC"))),format.raw/*47.56*/("""  &copy; """),_display_(Seq[Any](/*47.66*/Messages/*47.74*/.get("2015"))),format.raw/*47.86*/("""</small> </p>
        </div>
    </div>
    <script src=""""),_display_(Seq[Any](/*50.19*/routes/*50.25*/.Assets.at("bootstrap/js/jquery-2.1.1.js"))),format.raw/*50.67*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*51.19*/routes/*51.25*/.Assets.at("bootstrap/js/bootstrap.min.js"))),format.raw/*51.68*/(""""></script>
    </body>
</html>
"""))}
    }
    
    def render(form:Form[Application.Login]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[Application.Login]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 04 09:30:04 CAT 2015
                    SOURCE: /home/zigama/workspace/rmts/app/views/login.scala.html
                    HASH: b815d552ff0643d2296c97a0d20ef80c609ac475
                    MATRIX: 791->1|935->32|962->53|1033->89|1049->97|1136->163|1225->217|1239->223|1296->259|1353->281|1367->287|1433->332|1505->369|1519->375|1597->432|1670->469|1685->475|1746->514|1819->551|1834->557|1893->594|2119->784|2134->790|2192->826|2440->1038|2455->1044|2502->1082|2542->1084|2579->1086|2615->1113|2655->1115|2725->1149|2739->1154|2774->1167|2816->1178|2853->1180|2891->1209|2931->1211|3001->1245|3015->1250|3052->1265|3094->1276|3277->1422|3300->1435|3329->1441|3777->1853|3794->1861|3830->1874|3903->1915|3976->1952|3993->1960|4026->1971|4072->1981|4089->1989|4123->2001|4217->2059|4232->2065|4296->2107|4362->2137|4377->2143|4442->2186
                    LINES: 26->1|30->1|31->3|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|45->17|45->17|45->17|53->25|53->25|53->25|53->25|54->26|54->26|54->26|56->28|56->28|56->28|58->30|59->31|59->31|59->31|61->33|61->33|61->33|63->35|65->37|65->37|65->37|71->43|71->43|71->43|74->46|75->47|75->47|75->47|75->47|75->47|75->47|78->50|78->50|78->50|79->51|79->51|79->51
                    -- GENERATED --
                */
            