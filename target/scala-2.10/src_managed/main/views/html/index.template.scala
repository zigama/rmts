
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*2.2*/main("Welocome Page")/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""
    
    
     <div class="col-lg-12">
                <div class="ibox float-e-margins">
                 
                    <div class="ibox-content">


                    </div>
                </div>
            </div>
    
    
               
            
    
    
""")))})),format.raw/*20.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 04 09:30:04 CAT 2015
                    SOURCE: /home/zigama/workspace/rmts/app/views/index.scala.html
                    HASH: e2d866a929c0245d13e7d5416b1cb283b71b9078
                    MATRIX: 864->2|893->23|932->25|1240->302
                    LINES: 29->2|29->2|29->2|47->20
                    -- GENERATED --
                */
            