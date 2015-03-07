
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
object fiamain extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import play.i18n._


Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
       
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <title>"""),_display_(Seq[Any](/*10.11*/title)),format.raw/*10.16*/("""</title>
         <meta charset="utf-8">
    <link rel="icon" type="image/png" href=""""),_display_(Seq[Any](/*12.46*/routes/*12.52*/.Assets.at("bootstrap/img/logo.png"))),format.raw/*12.88*/("""" />

    <link href=""""),_display_(Seq[Any](/*14.18*/routes/*14.24*/.Assets.at("bootstrap/css/bootstrap.min.css"))),format.raw/*14.69*/("""" rel="stylesheet">
    <link href=""""),_display_(Seq[Any](/*15.18*/routes/*15.24*/.Assets.at("bootstrap/font-awesome/css/font-awesome.css"))),format.raw/*15.81*/("""" rel="stylesheet">
    <!-- Data Tables -->
    <link href=""""),_display_(Seq[Any](/*17.18*/routes/*17.24*/.Assets.at("bootstrap/css/plugins/dataTables/dataTables.bootstrap.css"))),format.raw/*17.95*/("""" rel="stylesheet">
    <link href=""""),_display_(Seq[Any](/*18.18*/routes/*18.24*/.Assets.at("bootstrap/css/plugins/dataTables/dataTables.responsive.css"))),format.raw/*18.96*/("""" rel="stylesheet">
    <link href=""""),_display_(Seq[Any](/*19.18*/routes/*19.24*/.Assets.at("bootstrap/css/plugins/dataTables/dataTables.tableTools.min.css"))),format.raw/*19.100*/("""" rel="stylesheet">

    <link href=""""),_display_(Seq[Any](/*21.18*/routes/*21.24*/.Assets.at("bootstrap/css/animate.css"))),format.raw/*21.63*/("""" rel="stylesheet">
    <link href=""""),_display_(Seq[Any](/*22.18*/routes/*22.24*/.Assets.at("bootstrap/css/style.css"))),format.raw/*22.61*/("""" rel="stylesheet">
        
    </head>
    <body>
          <div id="wrapper">

    <nav class="navbar-default navbar-static-side" role="navigation">
        <div class="sidebar-collapse">
            <ul class="nav" id="side-menu">
                <li class="nav-header">
                    <div class="dropdown profile-element"> <span>
                            <img alt="image" class="img-circle" src="img/profile_small.png" />
                             </span>
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="clear"> <span class="block m-t-xs"> <strong class="font-bold">"""),_display_(Seq[Any](/*36.105*/Messages/*36.113*/.get("rnp"))),format.raw/*36.124*/("""</strong>
                             </span> <span class="text-muted text-xs block">Driver License Department <b class="caret"></b></span> </span> </a>
                        <ul class="dropdown-menu animated fadeInRight m-t-xs">
                            <li><a href="profile.html">"""),_display_(Seq[Any](/*39.57*/Messages/*39.65*/.get("myProfile"))),format.raw/*39.82*/("""</a></li>
                            <li><a href="contacts.html">"""),_display_(Seq[Any](/*40.58*/Messages/*40.66*/.get("contacts"))),format.raw/*40.82*/("""</a></li>
                            <li><a href="mailbox.html">"""),_display_(Seq[Any](/*41.57*/Messages/*41.65*/.get("mailbox"))),format.raw/*41.80*/("""</a></li>
                            <li class="divider"></li>
                            <li><a href=""""),_display_(Seq[Any](/*43.43*/routes/*43.49*/.Application.logout())),format.raw/*43.70*/("""">"""),_display_(Seq[Any](/*43.73*/session/*43.80*/.get("email"))),_display_(Seq[Any](/*43.94*/Messages/*43.102*/.get("logout"))),format.raw/*43.116*/("""</a></li>
                        </ul>
                    </div>
                    <div class="logo-element">
                        IN+
                    </div>
                </li>
                <li class="active">
                    <a href="table_data_tables.html"><i class="fa fa-table"></i> <span class="nav-label">Tables</span><span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                      <li class="active"><a href="table_data_tables.html">Data Tables</a></li>
                    </ul>
                </li>
                <li>
                  <ul class="nav nav-second-level">
                    <li class="active"><a href="login.html">Data Tables</a></li>   

                    </ul>
                </li>
                <li></li>
            </ul>

        </div>
    </nav>

        <div id="page-wrapper" class="gray-bg">
        <div class="row border-bottom">
        <nav class="navbar navbar-static-top" role="navigation" style="margin-bottom: 0">
        <div class="navbar-header">
            <a class="navbar-minimalize minimalize-styl-2 btn btn-primary " href="#"><i class="fa fa-bars"></i> </a>
            <form role="search" class="navbar-form-custom" method="post" action="search_results.html">
                <div class="form-group">
                    <input type="text" placeholder="Search for something..." class="form-control" name="top-search" id="top-search">
                </div>
            </form>
        </div>
            <ul class="nav navbar-top-links navbar-right">
                <li>
                    <span class="m-r-sm text-muted welcome-message">"""),_display_(Seq[Any](/*81.70*/Messages/*81.78*/.get("welcome"))),format.raw/*81.93*/(""" &nbsp;"""),_display_(Seq[Any](/*81.101*/Messages/*81.109*/.get("dlms"))),format.raw/*81.121*/("""</span>
                </li>
                <li class="dropdown">
                    <a class="dropdown-toggle count-info" data-toggle="dropdown" href="#">
                        <i class="fa fa-envelope"></i>  <span class="label label-warning">16</span>
                    </a>
                    <ul class="dropdown-menu dropdown-messages">
                        <li>
                            <div class="dropdown-messages-box">
                                <a href="profile.html" class="pull-left">
                                    <img alt="image" class="img-circle" src="img/a7.jpg">
                                </a>
                                <div class="media-body">
                                    <small class="pull-right">46h ago</small>
                                    <strong>Mike Loreipsum</strong> started following <strong>Monica Smith</strong>. <br>
                                    <small class="text-muted">3 days ago at 7:58 pm - 10.06.2014</small>
                                </div>
                            </div>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <div class="dropdown-messages-box">
                                <a href="profile.html" class="pull-left">
                                    <img alt="image" class="img-circle" src="img/a4.jpg">
                                </a>
                                <div class="media-body ">
                                    <small class="pull-right text-navy">5h ago</small>
                                    <strong>Chris Johnatan Overtunk</strong> started following <strong>Monica Smith</strong>. <br>
                                    <small class="text-muted">Yesterday 1:21 pm - 11.06.2014</small>
                                </div>
                            </div>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <div class="dropdown-messages-box">
                                <a href="profile.html" class="pull-left">
                                    <img alt="image" class="img-circle" src="img/profile.jpg">
                                </a>
                                <div class="media-body ">
                                    <small class="pull-right">23h ago</small>
                                    <strong>Monica Smith</strong> love <strong>Kim Smith</strong>. <br>
                                    <small class="text-muted">2 days ago at 2:30 am - 11.06.2014</small>
                                </div>
                            </div>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <div class="text-center link-block">
                                <a href="mailbox.html">
                                    <i class="fa fa-envelope"></i> <strong>Read All Messages</strong>
                                </a>
                            </div>
                        </li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a class="dropdown-toggle count-info" data-toggle="dropdown" href="#">
                        <i class="fa fa-bell"></i>  <span class="label label-primary">8</span>
                    </a>
                    <ul class="dropdown-menu dropdown-alerts">
                        <li>
                            <a href="mailbox.html">
                                <div>
                                    <i class="fa fa-envelope fa-fw"></i> You have 16 messages
                                    <span class="pull-right text-muted small">4 minutes ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="profile.html">
                                <div>
                                    <i class="fa fa-twitter fa-fw"></i> 3 New Followers
                                    <span class="pull-right text-muted small">12 minutes ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="grid_options.html">
                                <div>
                                    <i class="fa fa-upload fa-fw"></i> Server Rebooted
                                    <span class="pull-right text-muted small">4 minutes ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <div class="text-center link-block">
                                <a href="notifications.html">
                                    <strong>See All Alerts</strong>
                                    <i class="fa fa-angle-right"></i>
                                </a>
                            </div>
                        </li>
                    </ul>
                </li>
                <li>
                <a href=""""),_display_(Seq[Any](/*179.27*/routes/*179.33*/.Application.logout())),format.raw/*179.54*/(""""> <i class="fa fa-sign-out"></i> Log out </a>
                    
                </li>
            </ul>

        </nav>
        </div>
            <div class="row wrapper border-bottom white-bg page-heading">
                <div class="col-lg-10">
                    <h2>Data Tables</h2>
                    <ol class="breadcrumb">
                        <li>
                            <a href="index.html">Home</a>
                        </li>
                        <li>
                            <a>Tables</a>
                        </li>
                        <li class="active">
                            <strong>Data Tables</strong>
                        </li>
                    </ol>
                </div>
                <div class="col-lg-2">

                </div>
            </div>
            
        <div class="wrapper wrapper-content animated fadeInRight">
            <div class="row">
            """),_display_(Seq[Any](/*208.14*/content)),format.raw/*208.21*/("""
               
            </div>
            <div class="row">    </div>
        </div>
        <div class="footer">
                    <div class="pull-right">
                        Developed by <strong>PIVOT ACCESS</strong>.
                    </div>
                    <div>
                        <strong>Copyright</strong> RBC -OPD Division &copy; 2015
                    </div>
                </div>

        </div>
        </div>

<!--Java Scripts-->

    <!-- Mainly scripts -->
    <script src=""""),_display_(Seq[Any](/*228.19*/routes/*228.25*/.Assets.at("bootstrap/js/jquery-2.1.1.js"))),format.raw/*228.67*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*229.19*/routes/*229.25*/.Assets.at("bootstrap/js/bootstrap.min.js"))),format.raw/*229.68*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*230.19*/routes/*230.25*/.Assets.at("bootstrap/js/plugins/metisMenu/jquery.metisMenu.js"))),format.raw/*230.89*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*231.19*/routes/*231.25*/.Assets.at("bootstrap/js/plugins/slimscroll/jquery.slimscroll.min.js"))),format.raw/*231.95*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*232.19*/routes/*232.25*/.Assets.at("bootstrap/js/plugins/jeditable/jquery.jeditable.js"))),format.raw/*232.89*/(""""></script>

    <!-- Data Tables -->
    <script src=""""),_display_(Seq[Any](/*235.19*/routes/*235.25*/.Assets.at("bootstrap/js/plugins/dataTables/jquery.dataTables.js"))),format.raw/*235.91*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*236.19*/routes/*236.25*/.Assets.at("bootstrap/js/plugins/dataTables/dataTables.bootstrap.js"))),format.raw/*236.94*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*237.19*/routes/*237.25*/.Assets.at("bootstrap/js/plugins/dataTables/dataTables.responsive.js"))),format.raw/*237.95*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*238.19*/routes/*238.25*/.Assets.at("bootstrap/js/plugins/dataTables/dataTables.tableTools.min.js"))),format.raw/*238.99*/(""""></script>

    <!-- Custom and plugin javascript -->
    <script src=""""),_display_(Seq[Any](/*241.19*/routes/*241.25*/.Assets.at("bootstrap/js/inspinia.js"))),format.raw/*241.63*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*242.19*/routes/*242.25*/.Assets.at("bootstrap/js/plugins/pace/pace.min.js"))),format.raw/*242.76*/(""""></script>

    <!-- Page-Level Scripts -->
    <script>
        $(document).ready(function() """),format.raw/*246.38*/("""{"""),format.raw/*246.39*/("""
            $('.dataTables-example').dataTable("""),format.raw/*247.48*/("""{"""),format.raw/*247.49*/("""
                responsive: true,
                "dom": 'T<"clear">lfrtip',
                "tableTools": """),format.raw/*250.31*/("""{"""),format.raw/*250.32*/("""
                    "sSwfPath": "js/plugins/dataTables/swf/copy_csv_xls_pdf.swf"
                """),format.raw/*252.17*/("""}"""),format.raw/*252.18*/("""
            """),format.raw/*253.13*/("""}"""),format.raw/*253.14*/(""");

            /* Init DataTables */
            var oTable = $('#editable').dataTable();

            /* Apply the jEditable handlers to the table */
            oTable.$('td').editable( '../example_ajax.php', """),format.raw/*259.61*/("""{"""),format.raw/*259.62*/("""
                "callback": function( sValue, y ) """),format.raw/*260.51*/("""{"""),format.raw/*260.52*/("""
                    var aPos = oTable.fnGetPosition( this );
                    oTable.fnUpdate( sValue, aPos[0], aPos[1] );
                """),format.raw/*263.17*/("""}"""),format.raw/*263.18*/(""",
                "submitdata": function ( value, settings ) """),format.raw/*264.60*/("""{"""),format.raw/*264.61*/("""
                    return """),format.raw/*265.28*/("""{"""),format.raw/*265.29*/("""
                        "row_id": this.parentNode.getAttribute('id'),
                        "column": oTable.fnGetPosition( this )[2]
                    """),format.raw/*268.21*/("""}"""),format.raw/*268.22*/(""";
                """),format.raw/*269.17*/("""}"""),format.raw/*269.18*/(""",

                "width": "90%",
                "height": "100%"
            """),format.raw/*273.13*/("""}"""),format.raw/*273.14*/(""" );


        """),format.raw/*276.9*/("""}"""),format.raw/*276.10*/(""");

        function fnClickAddRow() """),format.raw/*278.34*/("""{"""),format.raw/*278.35*/("""
            $('#editable').dataTable().fnAddData( [
                "Custom row",
                "New row",
                "New row",
                "New row",
                "New row" ] );

        """),format.raw/*286.9*/("""}"""),format.raw/*286.10*/("""
    </script>
<style>
    body.DTTT_Print """),format.raw/*289.21*/("""{"""),format.raw/*289.22*/("""
        background: #fff;

    """),format.raw/*292.5*/("""}"""),format.raw/*292.6*/("""
    .DTTT_Print #page-wrapper """),format.raw/*293.31*/("""{"""),format.raw/*293.32*/("""
        margin: 0;
        background:#fff;
    """),format.raw/*296.5*/("""}"""),format.raw/*296.6*/("""

    button.DTTT_button, div.DTTT_button, a.DTTT_button """),format.raw/*298.56*/("""{"""),format.raw/*298.57*/("""
        border: 1px solid #e7eaec;
        background: #fff;
        color: #676a6c;
        box-shadow: none;
        padding: 6px 8px;
    """),format.raw/*304.5*/("""}"""),format.raw/*304.6*/("""
    button.DTTT_button:hover, div.DTTT_button:hover, a.DTTT_button:hover """),format.raw/*305.74*/("""{"""),format.raw/*305.75*/("""
        border: 1px solid #d2d2d2;
        background: #fff;
        color: #676a6c;
        box-shadow: none;
        padding: 6px 8px;
    """),format.raw/*311.5*/("""}"""),format.raw/*311.6*/("""

    .dataTables_filter label """),format.raw/*313.30*/("""{"""),format.raw/*313.31*/("""
        margin-right: 5px;

    """),format.raw/*316.5*/("""}"""),format.raw/*316.6*/("""
</style>
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
                    SOURCE: /home/zigama/workspace/rmts/app/views/fiamain.scala.html
                    HASH: 619870323d8c0f5ccfd557987bedf81cbfdcf742
                    MATRIX: 781->1|924->31|951->52|1116->181|1143->186|1265->272|1280->278|1338->314|1397->337|1412->343|1479->388|1552->425|1567->431|1646->488|1744->550|1759->556|1852->627|1925->664|1940->670|2034->742|2107->779|2122->785|2221->861|2295->899|2310->905|2371->944|2444->981|2459->987|2518->1024|3216->1685|3234->1693|3268->1704|3593->1993|3610->2001|3649->2018|3752->2085|3769->2093|3807->2109|3909->2175|3926->2183|3963->2198|4105->2304|4120->2310|4163->2331|4202->2334|4218->2341|4262->2355|4280->2363|4317->2377|6023->4047|6040->4055|6077->4070|6122->4078|6140->4086|6175->4098|11584->9470|11600->9476|11644->9497|12622->10438|12652->10445|13205->10961|13221->10967|13286->11009|13353->11039|13369->11045|13435->11088|13502->11118|13518->11124|13605->11188|13672->11218|13688->11224|13781->11294|13848->11324|13864->11330|13951->11394|14044->11450|14060->11456|14149->11522|14216->11552|14232->11558|14324->11627|14391->11657|14407->11663|14500->11733|14567->11763|14583->11769|14680->11843|14790->11916|14806->11922|14867->11960|14934->11990|14950->11996|15024->12047|15148->12142|15178->12143|15255->12191|15285->12192|15422->12300|15452->12301|15579->12399|15609->12400|15651->12413|15681->12414|15922->12626|15952->12627|16032->12678|16062->12679|16234->12822|16264->12823|16354->12884|16384->12885|16441->12913|16471->12914|16657->13071|16687->13072|16734->13090|16764->13091|16873->13171|16903->13172|16945->13186|16975->13187|17041->13224|17071->13225|17303->13429|17333->13430|17405->13473|17435->13474|17495->13506|17524->13507|17584->13538|17614->13539|17691->13588|17720->13589|17806->13646|17836->13647|18006->13789|18035->13790|18138->13864|18168->13865|18338->14007|18367->14008|18427->14039|18457->14040|18518->14073|18547->14074
                    LINES: 26->1|30->1|31->3|38->10|38->10|40->12|40->12|40->12|42->14|42->14|42->14|43->15|43->15|43->15|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|49->21|49->21|49->21|50->22|50->22|50->22|64->36|64->36|64->36|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|71->43|71->43|71->43|71->43|71->43|71->43|71->43|71->43|109->81|109->81|109->81|109->81|109->81|109->81|207->179|207->179|207->179|236->208|236->208|256->228|256->228|256->228|257->229|257->229|257->229|258->230|258->230|258->230|259->231|259->231|259->231|260->232|260->232|260->232|263->235|263->235|263->235|264->236|264->236|264->236|265->237|265->237|265->237|266->238|266->238|266->238|269->241|269->241|269->241|270->242|270->242|270->242|274->246|274->246|275->247|275->247|278->250|278->250|280->252|280->252|281->253|281->253|287->259|287->259|288->260|288->260|291->263|291->263|292->264|292->264|293->265|293->265|296->268|296->268|297->269|297->269|301->273|301->273|304->276|304->276|306->278|306->278|314->286|314->286|317->289|317->289|320->292|320->292|321->293|321->293|324->296|324->296|326->298|326->298|332->304|332->304|333->305|333->305|339->311|339->311|341->313|341->313|344->316|344->316
                    -- GENERATED --
                */
            