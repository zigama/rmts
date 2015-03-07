
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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Long,Form[User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(id: Long, userForm: Form[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.49*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main(title)/*7.13*/ {_display_(Seq[Any](format.raw/*7.15*/("""
    
    <h1>Edit user</h1>
    
    """),_display_(Seq[Any](/*11.6*/form(routes.Users.update(id))/*11.35*/ {_display_(Seq[Any](format.raw/*11.37*/("""
 
        """),_display_(Seq[Any](/*13.10*/if(userForm.hasErrors)/*13.32*/ {_display_(Seq[Any](format.raw/*13.34*/("""
		    <p class="error">
		        <ul>
		        	"""),_display_(Seq[Any](/*16.13*/userForm/*16.21*/.errors.map/*16.32*/ { case(key, value) =>_display_(Seq[Any](format.raw/*16.54*/("""
		        		
		        		<li style="color:#9d261d;"> """),_display_(Seq[Any](/*18.42*/key)),format.raw/*18.45*/(""" : """),_display_(Seq[Any](/*18.49*/value/*18.54*/.map/*18.58*/ { v =>_display_(Seq[Any](format.raw/*18.65*/(""" """),_display_(Seq[Any](/*18.67*/v/*18.68*/.message)),format.raw/*18.76*/(""" """)))})),format.raw/*18.78*/("""   </li>
		        	""")))})),format.raw/*19.13*/("""
		        </ul>
		    </p>
		""")))})),format.raw/*22.4*/("""
        
        <fieldset>
        
            """),_display_(Seq[Any](/*26.14*/inputText(userForm("email"), '_label -> "User Email" ))),format.raw/*26.68*/("""
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
            
            """),_display_(Seq[Any](/*40.14*/inputText(userForm("dob"),
            						'_label -> "Date Of Birth",
            						'_id -> "dob"
			  
            						))),format.raw/*44.20*/("""
            
            """),_display_(Seq[Any](/*46.14*/inputRadioGroup(
                userForm("gender"), 
                options(MalariaEnum.Gender.values().toList.map(_.toString)), 
                '_label -> "Gender", '_default -> "-- Choose a Gender --",
                '_showConstraints -> false
            ))),format.raw/*51.14*/("""
           
            """),_display_(Seq[Any](/*53.14*/select(
                userForm("userGroup.id"), 
                options(UserGroup.options), 
                '_label -> "UserGroup", '_default -> "-- Choose a group --",
                '_showConstraints -> false
            ))),format.raw/*58.14*/("""
            
        
        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Save this User" class="btn primary"> or 
            <a href=""""),_display_(Seq[Any](/*65.23*/routes/*65.29*/.Users.list())),format.raw/*65.42*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*68.6*/("""
    
    """),_display_(Seq[Any](/*70.6*/form(routes.Users.delete(id), 'class -> "topRight")/*70.57*/ {_display_(Seq[Any](format.raw/*70.59*/("""
        <input type="submit" value="Delete this user" class="btn danger">
    """)))})),format.raw/*72.6*/("""
    
    
""")))})),format.raw/*75.2*/("""
"""))}
    }
    
    def render(title:String,id:Long,userForm:Form[User]): play.api.templates.HtmlFormat.Appendable = apply(title)(id,userForm)
    
    def f:((String) => (Long,Form[User]) => play.api.templates.HtmlFormat.Appendable) = (title) => (id,userForm) => apply(title)(id,userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 04 09:30:04 CAT 2015
                    SOURCE: /home/zigama/workspace/rmts/app/views/users/editForm.scala.html
                    HASH: ccc0d08ae93e1086e1bc5c7032e38048ecbc47c0
                    MATRIX: 799->1|948->69|980->93|1064->48|1092->67|1120->147|1158->151|1177->162|1216->164|1290->203|1328->232|1368->234|1416->246|1447->268|1487->270|1575->322|1592->330|1612->341|1672->363|1763->418|1788->421|1828->425|1842->430|1855->434|1900->441|1938->443|1948->444|1978->452|2012->454|2065->475|2127->506|2214->557|2290->611|2340->625|2420->683|2687->914|2717->934|2746->940|2947->1105|3023->1159|3097->1197|3249->1327|3312->1354|3597->1617|3659->1643|3910->1872|4131->2057|4146->2063|4181->2076|4267->2131|4313->2142|4373->2193|4413->2195|4524->2275|4567->2287
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|41->13|41->13|41->13|44->16|44->16|44->16|44->16|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|47->19|50->22|54->26|54->26|55->27|55->27|60->32|60->32|60->32|66->38|66->38|68->40|72->44|74->46|79->51|81->53|86->58|93->65|93->65|93->65|96->68|98->70|98->70|98->70|100->72|103->75
                    -- GENERATED --
                */
            