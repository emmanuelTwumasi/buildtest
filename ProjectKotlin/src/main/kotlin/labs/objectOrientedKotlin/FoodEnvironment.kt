package labs.objectOrientedKotlin

import kotlin.random.Random


class FoodEnvironment(vararg args: Actor) : Environment(*args) {

    val scores: MutableMap<Actor, Int> = mutableMapOf()
    var animal :String? = ""

    init {
        args.map { agent-> scores.put(agent,0)}
    }

    override fun processAction(agent: Actor, act: Action) {
        val agentScore:Int
        when(act){
            is HuntAction->{
                if (sense(agent)==agent.perceive())
                {
                    agentScore = scores.getOrDefault(agent,0).plus(2)
                    scores[agent] = agentScore
                }
            }
            is ForageAction->{
                agentScore = scores.getOrDefault(agent,0).plus(1)
                //agentScore = agentScore?.plus(1)
                scores[agent] = agentScore
            }
            else -> "nothing"
        }
//        else if (act is ForageAction){
//            val agentScore = scores.getOrDefault(agent,0).plus(1)
////            agentScore = agentScore?.plus(1)
//            scores.put(agent,agentScore)

        }

    override fun sense(agent: Actor) {
        if (animal==null){
        agent.perceive()
        }else{
            Percept("animal", animal!!);
        }
    }

    override fun step() {
        var rand= Random(1);
        var chances = rand.nextDouble(0.0,1.0)
        animal = if (chances>=0.5){ "antelope"  }else{ null }
        super.step()
    }

}



