
package views.html.users

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
object createForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Form[User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(userForm: Form[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.39*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main(title)/*7.13*/ {_display_(Seq[Any](format.raw/*7.15*/("""
    
    <h1>Add a user</h1>
    
    """),_display_(Seq[Any](/*11.6*/form(routes.Users.save())/*11.31*/ {_display_(Seq[Any](format.raw/*11.33*/("""
        
         """),_display_(Seq[Any](/*13.11*/if(userForm.hasErrors)/*13.33*/ {_display_(Seq[Any](format.raw/*13.35*/("""
		    <p class="error">
		        <ul>
		        	"""),_display_(Seq[Any](/*16.13*/userForm/*16.21*/.errors.map/*16.32*/ { case(key, value) =>_display_(Seq[Any](format.raw/*16.54*/("""
		        		
		        		<li style="color:#9d261d;"> """),_display_(Seq[Any](/*18.42*/key)),format.raw/*18.45*/(""" : """),_display_(Seq[Any](/*18.49*/value/*18.54*/.map/*18.58*/ { v =>_display_(Seq[Any](format.raw/*18.65*/(""" """),_display_(Seq[Any](/*18.67*/v/*18.68*/.message)),format.raw/*18.76*/(""" """)))})),format.raw/*18.78*/("""   </li>
		        	""")))})),format.raw/*19.13*/("""
		        </ul>
		    </p>
		""")))})),format.raw/*22.4*/("""
		
        <fieldset>
        
            """),_display_(Seq[Any](/*26.14*/inputText(userForm("email"), '_label -> "Email"))),format.raw/*26.62*/("""
            """),_display_(Seq[Any](/*27.14*/inputPassword(userForm("password"), '_label -> "Password"))),format.raw/*27.72*/("""
            <div class="clearfix  " id="repeatPassword_field">
			    <label for="repeatPassword">Repeat password</label>
			    <div class="input">

			    <input type="password" id="repeatPassword" name="repeatPassword" value=""""),_display_(Seq[Any](/*32.81*/userForm("password")/*32.101*/.value)),format.raw/*32.107*/("""">

			        <span class="help-inline"></span>
			        <span class="help-block">Please repeat your password again.</span> 
			    </div>
			</div>
            """),_display_(Seq[Any](/*38.14*/inputText(userForm("fullname"), '_label -> "Fullname"))),format.raw/*38.68*/(""" 
            
            """),_display_(Seq[Any](/*40.14*/select(
                userForm("userGroup.id"), 
                options(UserGroup.options), 
                '_label -> "UserGroup", '_default -> "-- Choose a group --",
                '_showConstraints -> false
            ))),format.raw/*45.14*/("""           

        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Create this user" class="btn primary"> or 
            <a href=""""),_display_(Seq[Any](/*51.23*/routes/*51.29*/.Users.list())),format.raw/*51.42*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*54.6*/("""
    
""")))})))}
    }
    
    def render(title:String,userForm:Form[User]): play.api.templates.HtmlFormat.Appendable = apply(title)(userForm)
    
    def f:((String) => (Form[User]) => play.api.templates.HtmlFormat.Appendable) = (title) => (userForm) => apply(title)(userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 04 09:30:04 CAT 2015
                    SOURCE: /home/zigama/workspace/rmts/app/views/users/createForm.scala.html
                    HASH: 3f0cf7e26dbbe62200811fd315c5e5a497524428
                    MATRIX: 796->1|935->59|967->83|1051->38|1079->57|1107->137|1145->141|1164->152|1203->154|1278->194|1312->219|1352->221|1408->241|1439->263|1479->265|1567->317|1584->325|1604->336|1664->358|1755->413|1780->416|1820->420|1834->425|1847->429|1892->436|1930->438|1940->439|1970->447|2004->449|2057->470|2119->501|2200->546|2270->594|2320->608|2400->666|2667->897|2697->917|2726->923|2927->1088|3003->1142|3067->1170|3318->1399|3531->1576|3546->1582|3581->1595|3667->1650
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|41->13|41->13|41->13|44->16|44->16|44->16|44->16|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|47->19|50->22|54->26|54->26|55->27|55->27|60->32|60->32|60->32|66->38|66->38|68->40|73->45|79->51|79->51|79->51|82->54
                    -- GENERATED --
                */
            