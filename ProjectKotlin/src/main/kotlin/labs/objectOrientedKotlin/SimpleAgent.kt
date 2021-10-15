package labs.objectOrientedKotlin


class SimpleAgent(override val name: String) : Actor {
        override fun act(): Action {
           return ForageAction()
        }

        override fun perceive(vararg facts: Percept) {

        }

        override fun toString(): String {
            return "SimpleAgent(name='$name')"
        }
 }


fun main(args:Array<String>){
    val agent = SimpleAgent("Group 14-15")


    println(agent.act())


    val env = FoodEnvironment(SimpleAgent("Charlie"));
    env.step()
    env.step()
    println(env.scores)

    val env1 = FoodEnvironment()
    for (i in 1..10) {
        env1.step()
        println(env.animal)
    }
//    RandomAgent("Bob", 0.2),
    val env2 = FoodEnvironment(CleverAgent("harlie"),  SimpleAgent("Alice"))
    for (i in 1..100) {
        env2.step()
    }
    println(env.scores)
}