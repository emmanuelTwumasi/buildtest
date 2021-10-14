package labs


 fun main(args: Array<String>){

     println("Hello World")

     var ab : String = "Hello"
     println(ab)

     for(x in -5 .. 5){
         var y = calculateY(3 , x, -1)
         println(y)
     }

     for (x in 0 .. 20){
         var a = calculateY(3, x, 5)
         var b = calculateY(4, x, 2)
         if(a == b)
             println("intersect at value $a")
     }

     for(x in 0 .. 100){
         intersection(3, 5, 4, 2, x )
         intersection(2, 1, 3, 3, x )
         intersection(2, 3, 3, -2, x )
     }
 }

    fun calculateY(m : Int, x : Int, c : Int) : Int {
        // y = mx + c - formula for a straight line
        return m * x + c
    }

    fun intersection(mOne : Int, cOne : Int, mTwo : Int, cTwo : Int, x : Int) : Unit {

        // This function takes the equations of two lines:
        var yOne = mOne * x + cOne
        var yTwo = mTwo * x + cTwo

        if(yOne ==  yTwo){
            println(x)
        } else println("They do not intersect")
    }
