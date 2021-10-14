package labs.objectOrientedKotlin

class CleverAgent( override val name: String ): Actor {

    var sensePercept:Percept? = Percept(name,"")
    var foodsense = FoodEnvironment()

    override fun act(): Action {
        if (foodsense.animal!=null){
            return HuntAction(foodsense.animal!!)
        }else{
            return ForageAction()
        }
    }

    override fun perceive(vararg facts: Percept) {

    }

}