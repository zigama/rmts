// @SOURCE:/home/zigama/workspace/rmts/conf/routes
// @HASH:51baccb9fe7cb59acfb49f85adf1df144a1d9bb7
// @DATE:Wed Mar 04 09:29:59 CAT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:7
package controllers {

// @LINE:32
// @LINE:31
// @LINE:30
class ReverseMalariaCases {
    

// @LINE:32
def list(p:Int = 0, s:String = "id", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "cases" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "id") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:31
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "cases")
}
                                                

// @LINE:30
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "cases/new")
}
                                                
    
}
                          

// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:15
class ReverseUsers {
    

// @LINE:27
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:19
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/new")
}
                                                

// @LINE:23
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:24
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:15
def list(p:Int = 0, s:String = "email", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "email") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:20
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "users")
}
                                                
    
}
                          

// @LINE:35
class ReverseAssets {
    

// @LINE:35
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:7
class ReverseApplication {
    

// @LINE:12
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:7
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:11
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:10
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          
}
                  


// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:7
package controllers.javascript {

// @LINE:32
// @LINE:31
// @LINE:30
class ReverseMalariaCases {
    

// @LINE:32
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MalariaCases.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cases" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:31
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MalariaCases.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cases"})
      }
   """
)
                        

// @LINE:30
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MalariaCases.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cases/new"})
      }
   """
)
                        
    
}
              

// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:15
class ReverseUsers {
    

// @LINE:27
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:19
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/new"})
      }
   """
)
                        

// @LINE:23
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:24
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:15
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:20
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
      }
   """
)
                        
    
}
              

// @LINE:35
class ReverseAssets {
    

// @LINE:35
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:7
class ReverseApplication {
    

// @LINE:12
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:7
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:11
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:10
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:7
package controllers.ref {


// @LINE:32
// @LINE:31
// @LINE:30
class ReverseMalariaCases {
    

// @LINE:32
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MalariaCases.list(p, s, o, f), HandlerDef(this, "controllers.MalariaCases", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """cases""")
)
                      

// @LINE:31
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MalariaCases.save(), HandlerDef(this, "controllers.MalariaCases", "save", Seq(), "POST", """""", _prefix + """cases""")
)
                      

// @LINE:30
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MalariaCases.create(), HandlerDef(this, "controllers.MalariaCases", "create", Seq(), "GET", """Malaria Case""", _prefix + """cases/new""")
)
                      
    
}
                          

// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:15
class ReverseUsers {
    

// @LINE:27
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.delete(id), HandlerDef(this, "controllers.Users", "delete", Seq(classOf[Long]), "POST", """ Delete a user""", _prefix + """users/$id<[^/]+>/delete""")
)
                      

// @LINE:19
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.create(), HandlerDef(this, "controllers.Users", "create", Seq(), "GET", """ Add user""", _prefix + """users/new""")
)
                      

// @LINE:23
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.edit(id), HandlerDef(this, "controllers.Users", "edit", Seq(classOf[Long]), "GET", """ Edit existing user""", _prefix + """users/$id<[^/]+>""")
)
                      

// @LINE:24
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.update(id), HandlerDef(this, "controllers.Users", "update", Seq(classOf[Long]), "POST", """""", _prefix + """users/$id<[^/]+>""")
)
                      

// @LINE:15
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.list(p, s, o, f), HandlerDef(this, "controllers.Users", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """ Users list (look at the default values for pagination parameters)""", _prefix + """users""")
)
                      

// @LINE:20
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.save(), HandlerDef(this, "controllers.Users", "save", Seq(), "POST", """""", _prefix + """users""")
)
                      
    
}
                          

// @LINE:35
class ReverseAssets {
    

// @LINE:35
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:7
class ReverseApplication {
    

// @LINE:12
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:7
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:11
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:10
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """Authentication           """, _prefix + """login""")
)
                      
    
}
                          
}
        
    