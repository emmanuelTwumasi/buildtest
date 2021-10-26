val named:String  = "Manasseh"
var greeting:String = "Good afternoon"
var nonVar:String? =" "
fun main(args: Array<String>) {
    //two types of variables :
    //mutable - values can be reassigned, declared using var

    //immutables - defined only ones using val

    var name:String = "Adwoa."
    println(nonVar)
    print("$greeting,$named and ")
    println(name)
    nonVar = null
    println(nonVar)
    println("Hello World!")

    for (i in -5..5){
        println("When y = "+calculate(3,i,-1)+":\t\tx = "+i);
    }
    display(3,5,4,2)

}

fun calculate(m:Int,x:Int,c:Int):Int{
    return m*x+c
}
fun lineIntersectCalc(m2:Int, c:Int): Int {
    var y = 0;
    for (x in 0..20)
       y = calculate(m2,x,c)
    return y
}
fun display(m :Int,c:Int,m2:Int,c2:Int){

    var inter1 = lineIntersectCalc(m,c)
    var inter2 = lineIntersectCalc(m2,c2)
    if (inter1==inter2)
        println("X and y intersect at = $inter1 and $inter2")
}