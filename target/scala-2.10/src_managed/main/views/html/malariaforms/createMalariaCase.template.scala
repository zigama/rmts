
package views.html.malariaforms

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
object createMalariaCase extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Form[MalariaCase],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(caseForm: Form[MalariaCase]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.46*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main(title)/*7.13*/ {_display_(Seq[Any](format.raw/*7.15*/("""
    
    <h1>Add New Malaria Notification Case</h1>
    
    """),_display_(Seq[Any](/*11.6*/form(routes.MalariaCases.save())/*11.38*/ {_display_(Seq[Any](format.raw/*11.40*/("""
        
         """),_display_(Seq[Any](/*13.11*/if(caseForm.hasErrors)/*13.33*/ {_display_(Seq[Any](format.raw/*13.35*/("""
		    <p class="error">
		        <ul>
		        	"""),_display_(Seq[Any](/*16.13*/caseForm/*16.21*/.errors.map/*16.32*/ { case(key, value) =>_display_(Seq[Any](format.raw/*16.54*/("""
		        		
		        		<li style="color:#9d261d;"> """),_display_(Seq[Any](/*18.42*/key)),format.raw/*18.45*/(""" : """),_display_(Seq[Any](/*18.49*/value/*18.54*/.map/*18.58*/ { v =>_display_(Seq[Any](format.raw/*18.65*/(""" """),_display_(Seq[Any](/*18.67*/v/*18.68*/.message)),format.raw/*18.76*/(""" """)))})),format.raw/*18.78*/("""   </li>
		        	""")))})),format.raw/*19.13*/("""
		        </ul>
		    </p>
		""")))})),format.raw/*22.4*/("""
		
        <fieldset>
        
            
            """),_display_(Seq[Any](/*27.14*/inputText(caseForm("houseOfHousehold"), '_label -> "Head of Household"))),format.raw/*27.85*/(""" 
            
            """),_display_(Seq[Any](/*29.14*/select(
                caseForm("country.id"), 
                options(Country.options), 
                '_label -> "Country", '_default -> "-- Choose a country --",
                '_showConstraints -> false
            ))),format.raw/*34.14*/(""" 
            
            """),_display_(Seq[Any](/*36.14*/select(
                caseForm("province.id"), 
                options(Province.options), 
                '_label -> "Province", '_default -> "-- Choose a Province --",
                '_showConstraints -> false
            ))),format.raw/*41.14*/("""
            
                        """),_display_(Seq[Any](/*43.26*/select(
                caseForm("district.id"), 
                options(District.options), 
                '_label -> "District", '_default -> "-- Choose a District --",
                '_showConstraints -> false
            ))),format.raw/*48.14*/("""      
            
            
                        """),_display_(Seq[Any](/*51.26*/select(
                caseForm("facility.id"), 
                options(Facility.options), 
                '_label -> "Facility", '_default -> "-- Choose a Facility --",
                '_showConstraints -> false
            ))),format.raw/*56.14*/(""" 
            
                        """),_display_(Seq[Any](/*58.26*/select(
                caseForm("sector.id"), 
                options(Sector.options), 
                '_label -> "Sector", '_default -> "-- Choose a Sector --",
                '_showConstraints -> false
            ))),format.raw/*63.14*/("""
            
                        """),_display_(Seq[Any](/*65.26*/select(
                caseForm("cell.id"), 
                options(Cell.options), 
                '_label -> "Cell", '_default -> "-- Choose a Cell --",
                '_showConstraints -> false
            ))),format.raw/*70.14*/("""
            
                        """),_display_(Seq[Any](/*72.26*/select(
                caseForm("village.id"), 
                options(Village.options), 
                '_label -> "Village", '_default -> "-- Choose a Village --",
                '_showConstraints -> false
            ))),format.raw/*77.14*/("""                                        

        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Create this case" class="btn primary"> or 
            <a href=""""),_display_(Seq[Any](/*83.23*/routes/*83.29*/.MalariaCases.list())),format.raw/*83.49*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*86.6*/("""
    
""")))})))}
    }
    
    def render(title:String,caseForm:Form[MalariaCase]): play.api.templates.HtmlFormat.Appendable = apply(title)(caseForm)
    
    def f:((String) => (Form[MalariaCase]) => play.api.templates.HtmlFormat.Appendable) = (title) => (caseForm) => apply(title)(caseForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 04 18:45:21 CAT 2015
                    SOURCE: /home/zigama/workspace/rmts/app/views/malariaforms/createMalariaCase.scala.html
                    HASH: 10ed0931b7871bf36d06bcb366452fc8ddb6a038
                    MATRIX: 817->1|963->66|995->90|1079->45|1107->64|1135->144|1173->148|1192->159|1231->161|1329->224|1370->256|1410->258|1466->278|1497->300|1537->302|1625->354|1642->362|1662->373|1722->395|1813->450|1838->453|1878->457|1892->462|1905->466|1950->473|1988->475|1998->476|2028->484|2062->486|2115->507|2177->538|2271->596|2364->667|2428->695|2675->920|2739->948|2990->1177|3065->1216|3316->1445|3410->1503|3661->1732|3737->1772|3980->1993|4055->2032|4290->2245|4365->2284|4612->2509|4854->2715|4869->2721|4911->2741|4997->2796
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|41->13|41->13|41->13|44->16|44->16|44->16|44->16|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|47->19|50->22|55->27|55->27|57->29|62->34|64->36|69->41|71->43|76->48|79->51|84->56|86->58|91->63|93->65|98->70|100->72|105->77|111->83|111->83|111->83|114->86
                    -- GENERATED --
                */
            