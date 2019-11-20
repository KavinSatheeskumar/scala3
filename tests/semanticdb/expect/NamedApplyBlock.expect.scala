package example

object NamedApplyBlockMethods/*<-example::NamedApplyBlockMethods.*/ {
  val local/*<-example::NamedApplyBlockMethods.local.*/ = 1
  def foo/*<-example::NamedApplyBlockMethods.foo().*/(a/*<-example::NamedApplyBlockMethods.foo().(a)*/: Int/*->scala::Int#*/ = 1, b/*<-example::NamedApplyBlockMethods.foo().(b)*/: Int/*->scala::Int#*/ = 2, c/*<-example::NamedApplyBlockMethods.foo().(c)*/: Int/*->scala::Int#*/ = 3): Int/*->scala::Int#*/ = a/*->example::NamedApplyBlockMethods.foo().(a)*/ +/*->scala::Int#`+`(+4).*/ b/*->example::NamedApplyBlockMethods.foo().(b)*/ +/*->scala::Int#`+`(+4).*/ c/*->example::NamedApplyBlockMethods.foo().(c)*/
  def baseCase/*<-example::NamedApplyBlockMethods.baseCase().*/ = foo/*->example::NamedApplyBlockMethods.foo().*//*->local0*/(local/*->example::NamedApplyBlockMethods.local.*/, c = 3) // as named apply is desugared, it would take more work to inspect within the body of the setter
  def recursive/*<-example::NamedApplyBlockMethods.recursive().*/ = foo/*->example::NamedApplyBlockMethods.foo().*//*->local2*/(local/*->example::NamedApplyBlockMethods.local.*/, c = /*->local1*/foo(local, c = 3)) // as named apply is desugared, it would take more work to inspect within the body of the setter
}

object NamedApplyBlockCaseClassConstruction/*<-example::NamedApplyBlockCaseClassConstruction.*/ {
  case class Msg/*<-example::NamedApplyBlockCaseClassConstruction.Msg#*/(body/*<-example::NamedApplyBlockCaseClassConstruction.Msg#body.*/: String/*->scala::Predef.String#*/, head/*<-example::NamedApplyBlockCaseClassConstruction.Msg#head.*/: String/*->scala::Predef.String#*/ = "default", tail/*<-example::NamedApplyBlockCaseClassConstruction.Msg#tail.*/: String/*->scala::Predef.String#*/)
  val bodyText/*<-example::NamedApplyBlockCaseClassConstruction.bodyText.*/ = "body"
  val msg/*<-example::NamedApplyBlockCaseClassConstruction.msg.*/ = Msg/*->example::NamedApplyBlockCaseClassConstruction.Msg.*//*->local3*//*->example::NamedApplyBlockCaseClassConstruction.Msg.apply().*/(bodyText/*->example::NamedApplyBlockCaseClassConstruction.bodyText.*/, tail = "tail")
}
