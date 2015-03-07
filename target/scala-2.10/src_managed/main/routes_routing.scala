// @SOURCE:/home/zigama/workspace/rmts/conf/routes
// @HASH:51baccb9fe7cb59acfb49f85adf1df144a1d9bb7
// @DATE:Wed Mar 04 09:29:59 CAT 2015


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:7
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:10
private[this] lazy val controllers_Application_login1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:11
private[this] lazy val controllers_Application_authenticate2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:12
private[this] lazy val controllers_Application_logout3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:15
private[this] lazy val controllers_Users_list4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users"))))
        

// @LINE:19
private[this] lazy val controllers_Users_create5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/new"))))
        

// @LINE:20
private[this] lazy val controllers_Users_save6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users"))))
        

// @LINE:23
private[this] lazy val controllers_Users_edit7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:24
private[this] lazy val controllers_Users_update8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:27
private[this] lazy val controllers_Users_delete9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:30
private[this] lazy val controllers_MalariaCases_create10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cases/new"))))
        

// @LINE:31
private[this] lazy val controllers_MalariaCases_save11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cases"))))
        

// @LINE:32
private[this] lazy val controllers_MalariaCases_list12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cases"))))
        

// @LINE:35
private[this] lazy val controllers_Assets_at13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users""","""controllers.Users.list(p:Int ?= 0, s:String ?= "email", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/new""","""controllers.Users.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users""","""controllers.Users.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/$id<[^/]+>""","""controllers.Users.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/$id<[^/]+>""","""controllers.Users.update(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/$id<[^/]+>/delete""","""controllers.Users.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cases/new""","""controllers.MalariaCases.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cases""","""controllers.MalariaCases.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cases""","""controllers.MalariaCases.list(p:Int ?= 0, s:String ?= "id", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:7
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:10
case controllers_Application_login1(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """Authentication           """, Routes.prefix + """login"""))
   }
}
        

// @LINE:11
case controllers_Application_authenticate2(params) => {
   call { 
        invokeHandler(controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:12
case controllers_Application_logout3(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:15
case controllers_Users_list4(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("email")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.Users.list(p, s, o, f), HandlerDef(this, "controllers.Users", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """ Users list (look at the default values for pagination parameters)""", Routes.prefix + """users"""))
   }
}
        

// @LINE:19
case controllers_Users_create5(params) => {
   call { 
        invokeHandler(controllers.Users.create(), HandlerDef(this, "controllers.Users", "create", Nil,"GET", """ Add user""", Routes.prefix + """users/new"""))
   }
}
        

// @LINE:20
case controllers_Users_save6(params) => {
   call { 
        invokeHandler(controllers.Users.save(), HandlerDef(this, "controllers.Users", "save", Nil,"POST", """""", Routes.prefix + """users"""))
   }
}
        

// @LINE:23
case controllers_Users_edit7(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Users.edit(id), HandlerDef(this, "controllers.Users", "edit", Seq(classOf[Long]),"GET", """ Edit existing user""", Routes.prefix + """users/$id<[^/]+>"""))
   }
}
        

// @LINE:24
case controllers_Users_update8(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Users.update(id), HandlerDef(this, "controllers.Users", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """users/$id<[^/]+>"""))
   }
}
        

// @LINE:27
case controllers_Users_delete9(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Users.delete(id), HandlerDef(this, "controllers.Users", "delete", Seq(classOf[Long]),"POST", """ Delete a user""", Routes.prefix + """users/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:30
case controllers_MalariaCases_create10(params) => {
   call { 
        invokeHandler(controllers.MalariaCases.create(), HandlerDef(this, "controllers.MalariaCases", "create", Nil,"GET", """Malaria Case""", Routes.prefix + """cases/new"""))
   }
}
        

// @LINE:31
case controllers_MalariaCases_save11(params) => {
   call { 
        invokeHandler(controllers.MalariaCases.save(), HandlerDef(this, "controllers.MalariaCases", "save", Nil,"POST", """""", Routes.prefix + """cases"""))
   }
}
        

// @LINE:32
case controllers_MalariaCases_list12(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("id")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.MalariaCases.list(p, s, o, f), HandlerDef(this, "controllers.MalariaCases", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """cases"""))
   }
}
        

// @LINE:35
case controllers_Assets_at13(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     