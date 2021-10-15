package labs

import com.sun.jdi.IntegerValue
import java.util.Random as JRAN
import kotlin.random.Random as KRAN


fun main(args: Array<String>){
    val names:List<String> = listOf("Yaw","Adwoa","Mandem")
    totalLength(names)
    //Q5 mini
    names.forEach { println(it.toString()) }

    val items:List<Int> = listOf(1,2,3,4,5,8)


    val joinedString = names.fold("Element",{acc,i->acc+" "+i})
    println(joinedString)
    display()
}
//Q3. Write a function that takes two functions of type (Int) ->
// Int and returns the composite function, applying the first andThen the second, of the same type.

//sample
fun <T,R> Collection<T>.fold(
    initial:R,
    combine:(acc:R,nextElement:T)->R
):R{
    var accumulator: R =initial
    for (element: T in this){
        accumulator = combine(accumulator,element)
    }
    return accumulator

}
//Q4.In one line of code, and using no conditionals or loops, complete the below function
// totalLength such that it calculates the combined length of all the strings in its input put together:
//Hint: think similar to Java streams.

fun totalLength(strings:List<String>) {

    "lop".length.toString()
//    strings.map
    println("Total strings in list is : "+ strings.sumOf { it.length })

//Q5. (Optional) Using neither map() nor any looping construct, print the contents of a list of Strings.
    strings.forEach { println(it) }

}



fun display() {
    val jRand = JRAN().nextInt(1000)
    val kRand = KRAN.nextInt(1000)

    if(jRand>kRand)
        println("Java's random $jRand is greater than Kotlin's random $kRand")
    else
        println("Kotlin random $kRand is greater than Java's random $jRand")
}
