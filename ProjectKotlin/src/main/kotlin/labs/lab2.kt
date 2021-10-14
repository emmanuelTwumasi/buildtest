package labs
var funds : Double = 100.0
val pswd = "password"

fun main() {
    var input : String
    var cmd : List<String>

    while (true) {
        print("Command: ")
        input = readLine()!!
        cmd = input.split(" ")
        when (cmd[0]) {
            "balance" -> balance()
            "deposit" ->  try{ deposit(cmd[1].toDouble())}
                            catch (e:Exception)
                                { e.message}
            "withdraw" -> withdraw(cmd[1].toDouble())
            else -> println("Invalid command")
        }
    }
}


fun balance () {
    println(funds)
}

fun deposit (amount : Double) {

//    if(amount == null || amount.toString() == "")
//    else{
//        throw InvalidAmountException("please enter valid number")
//    }
    funds += amount
}

fun withdraw(amount : Double){
    println("Enter Password")
    var inputPassword = readLine()

    if (inputPassword  == pswd){

        if(amount > funds){
            println("You have insufficient funds, your remaining balance is $funds")
        }else{
            funds -= amount
            println("Your money has been withdrawn successfully")
        }
    } else {
        println("You entered a wrong password")
    }

}

class InvalidAmountException(message : String?) : Throwable (message)