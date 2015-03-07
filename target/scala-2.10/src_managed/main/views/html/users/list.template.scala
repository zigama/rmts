
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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[String,com.avaje.ebean.Page[User],String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(currentPage: com.avaje.ebean.Page[User], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*32.2*/header/*32.8*/(key:String, title:String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*32.38*/("""
    <th class=""""),_display_(Seq[Any](/*33.17*/key/*33.20*/.replace(".","_"))),format.raw/*33.37*/(""" header """),_display_(Seq[Any](/*33.46*/if(currentSortBy == key){/*33.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*33.136*/("""">
        <a href=""""),_display_(Seq[Any](/*34.19*/link(0, key))),format.raw/*34.31*/("""">"""),_display_(Seq[Any](/*34.34*/title)),format.raw/*34.39*/("""</a>
    </th>
""")))};def /*6.2*/link/*6.6*/(newPage:Int, newSortBy:String) = {{
    
    var sortBy = currentSortBy
    var order = currentOrder
    
    if(newSortBy != null) {
        sortBy = newSortBy
        if(currentSortBy == newSortBy) {
            if(currentOrder == "asc") {
                order = "desc"
            } else {
                order = "asc"
            }
        } else {
            order = "asc"
        }
    }
    
    // Generate the link
    routes.Users.list(newPage, sortBy, order, currentFilter)
    
}};
Seq[Any](format.raw/*1.126*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq[Any](/*38.2*/main(title)/*38.13*/ {_display_(Seq[Any](format.raw/*38.15*/("""
    
    <h1 id="homeTitle">"""),_display_(Seq[Any](/*40.25*/Messages("users.list.title", currentPage.getTotalRowCount))),format.raw/*40.83*/("""</h1>

    """),_display_(Seq[Any](/*42.6*/if(flash.containsKey("success"))/*42.38*/ {_display_(Seq[Any](format.raw/*42.40*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*44.37*/flash/*44.42*/.get("success"))),format.raw/*44.57*/("""
        </div>
    """)))})),format.raw/*46.6*/(""" 

    <div id="actions">
        
        <form action=""""),_display_(Seq[Any](/*50.24*/link(0, "email"))),format.raw/*50.40*/("""" method="GET">
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*51.66*/currentFilter)),format.raw/*51.79*/("""" placeholder="Filter by user email...">
            <input type="submit" id="searchsubmit" value="Filter by email" class="btn primary">
        </form>
        
        <a class="btn success" id="add" href=""""),_display_(Seq[Any](/*55.48*/routes/*55.54*/.Users.create())),format.raw/*55.69*/("""">Add a new user</a>
        
    </div>
    
    """),_display_(Seq[Any](/*59.6*/if(currentPage.getTotalRowCount == 0)/*59.43*/ {_display_(Seq[Any](format.raw/*59.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*65.7*/else/*65.12*/{_display_(Seq[Any](format.raw/*65.13*/("""
        
        <table class="users zebra-striped">
            <thead>
                <tr>
                    """),_display_(Seq[Any](/*70.22*/header("email", "Email"))),format.raw/*70.46*/("""
                    """),_display_(Seq[Any](/*71.22*/header("fullname", "Fullname"))),format.raw/*71.52*/("""
                    """),_display_(Seq[Any](/*72.22*/header("dob", "Date of Birth"))),format.raw/*72.52*/("""
                    """),_display_(Seq[Any](/*73.22*/header("gender", "Gender"))),format.raw/*73.48*/("""
                    """),_display_(Seq[Any](/*74.22*/header("userGroup.title", "Group"))),format.raw/*74.56*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*79.18*/for(user <- currentPage.getList) yield /*79.50*/ {_display_(Seq[Any](format.raw/*79.52*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*81.39*/routes/*81.45*/.Users.edit(user.id))),format.raw/*81.65*/("""">"""),_display_(Seq[Any](/*81.68*/user/*81.72*/.email)),format.raw/*81.78*/("""</a></td>
                        <td>
                            """),_display_(Seq[Any](/*83.30*/if(user.fullname == null)/*83.55*/ {_display_(Seq[Any](format.raw/*83.57*/("""
                                <em>-</em>
                            """)))}/*85.31*/else/*85.36*/{_display_(Seq[Any](format.raw/*85.37*/("""
                                """),_display_(Seq[Any](/*86.34*/user/*86.38*/.fullname)),format.raw/*86.47*/("""
                            """)))})),format.raw/*87.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*90.30*/if(user.dob == null)/*90.50*/ {_display_(Seq[Any](format.raw/*90.52*/("""
                                <em>-</em>
                            """)))}/*92.31*/else/*92.36*/{_display_(Seq[Any](format.raw/*92.37*/("""
                                """),_display_(Seq[Any](/*93.34*/user/*93.38*/.dob.format("yyyy-MM-dd"))),format.raw/*93.63*/("""
                            """)))})),format.raw/*94.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*97.30*/if(user.gender == null)/*97.53*/ {_display_(Seq[Any](format.raw/*97.55*/("""
                                <em>-</em>
                            """)))}/*99.31*/else/*99.36*/{_display_(Seq[Any](format.raw/*99.37*/("""
                                """),_display_(Seq[Any](/*100.34*/user/*100.38*/.gender)),format.raw/*100.45*/("""
                            """)))})),format.raw/*101.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*104.30*/if(user.userGroup == null)/*104.56*/ {_display_(Seq[Any](format.raw/*104.58*/("""
                                <em>-</em>
                            """)))}/*106.31*/else/*106.36*/{_display_(Seq[Any](format.raw/*106.37*/("""
                                """),_display_(Seq[Any](/*107.34*/user/*107.38*/.userGroup.title)),format.raw/*107.54*/("""
                            """)))})),format.raw/*108.30*/("""
                        </td>
                    </tr>
                """)))})),format.raw/*111.18*/("""

            </tbody>
        </table>

        <div id="pagination" class="pagination">
            <ul>
                """),_display_(Seq[Any](/*118.18*/if(currentPage.hasPrev)/*118.41*/ {_display_(Seq[Any](format.raw/*118.43*/("""
                    <li class="prev">
                        <a href=""""),_display_(Seq[Any](/*120.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*120.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*122.19*/else/*122.24*/{_display_(Seq[Any](format.raw/*122.25*/("""
                    <li class="prev disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*126.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*128.36*/currentPage/*128.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*128.80*/("""</a>
                </li>
                """),_display_(Seq[Any](/*130.18*/if(currentPage.hasNext)/*130.41*/ {_display_(Seq[Any](format.raw/*130.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*132.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*132.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*134.19*/else/*134.24*/{_display_(Seq[Any](format.raw/*134.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*138.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*142.6*/("""
        
""")))})),format.raw/*144.2*/("""

            """))}
    }
    
    def render(title:String,currentPage:com.avaje.ebean.Page[User],currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.HtmlFormat.Appendable = apply(title)(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((String) => (com.avaje.ebean.Page[User],String,String,String) => play.api.templates.HtmlFormat.Appendable) = (title) => (currentPage,currentSortBy,currentOrder,currentFilter) => apply(title)(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 04 09:30:04 CAT 2015
                    SOURCE: /home/zigama/workspace/rmts/app/views/users/list.scala.html
                    HASH: edac3c8565f7ec68fc0d966dfd453053f236cc27
                    MATRIX: 827->1|1029->865|1043->871|1154->901|1207->918|1219->921|1258->938|1303->947|1337->973|1425->1037|1482->1058|1516->1070|1555->1073|1582->1078|1620->254|1631->258|2157->125|2186->252|2214->753|2244->863|2272->1094|2310->1097|2330->1108|2370->1110|2436->1140|2516->1198|2563->1210|2604->1242|2644->1244|2761->1325|2775->1330|2812->1345|2864->1366|2958->1424|2996->1440|3113->1521|3148->1534|3393->1743|3408->1749|3445->1764|3531->1815|3577->1852|3617->1854|3741->1961|3754->1966|3793->1967|3945->2083|3991->2107|4049->2129|4101->2159|4159->2181|4211->2211|4269->2233|4317->2259|4375->2281|4431->2315|4549->2397|4597->2429|4637->2431|4737->2495|4752->2501|4794->2521|4833->2524|4846->2528|4874->2534|4978->2602|5012->2627|5052->2629|5144->2703|5157->2708|5196->2709|5266->2743|5279->2747|5310->2756|5372->2786|5497->2875|5526->2895|5566->2897|5658->2971|5671->2976|5710->2977|5780->3011|5793->3015|5840->3040|5902->3070|6027->3159|6059->3182|6099->3184|6191->3258|6204->3263|6243->3264|6314->3298|6328->3302|6358->3309|6421->3339|6547->3428|6583->3454|6624->3456|6717->3530|6731->3535|6771->3536|6842->3570|6856->3574|6895->3590|6958->3620|7065->3694|7226->3818|7259->3841|7300->3843|7410->3916|7473->3956|7558->4022|7572->4027|7612->4028|7783->4166|7893->4239|7914->4250|7970->4283|8051->4327|8084->4350|8125->4352|8235->4425|8298->4465|8379->4527|8393->4532|8433->4533|8600->4667|8680->4715|8723->4726
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|66->40|66->40|68->42|68->42|68->42|70->44|70->44|70->44|72->46|76->50|76->50|77->51|77->51|81->55|81->55|81->55|85->59|85->59|85->59|91->65|91->65|91->65|96->70|96->70|97->71|97->71|98->72|98->72|99->73|99->73|100->74|100->74|105->79|105->79|105->79|107->81|107->81|107->81|107->81|107->81|107->81|109->83|109->83|109->83|111->85|111->85|111->85|112->86|112->86|112->86|113->87|116->90|116->90|116->90|118->92|118->92|118->92|119->93|119->93|119->93|120->94|123->97|123->97|123->97|125->99|125->99|125->99|126->100|126->100|126->100|127->101|130->104|130->104|130->104|132->106|132->106|132->106|133->107|133->107|133->107|134->108|137->111|144->118|144->118|144->118|146->120|146->120|148->122|148->122|148->122|152->126|154->128|154->128|154->128|156->130|156->130|156->130|158->132|158->132|160->134|160->134|160->134|164->138|168->142|170->144
                    -- GENERATED --
                */
            