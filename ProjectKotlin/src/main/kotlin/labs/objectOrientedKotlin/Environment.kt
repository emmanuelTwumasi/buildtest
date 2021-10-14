package labs.objectOrientedKotlin


abstract class Environment
    (vararg args:Actor){
    val agents:List<Actor> = args.toList();

    open fun step(){
        for (agent in agents){
            sense(agent)
            processAction(agent, agent.act())
        }
    }

    abstract fun processAction(agent: Actor, act: Action)

    abstract fun sense(agent :Actor)

}