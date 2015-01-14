package ar.com.gmvsoft.model

object Model {

  class Metal
  case class Paint(color: String)

  class Wheel
  class Engine(metal: Metal)
  class Chassis(metal: Metal, val paint: Paint)

  class Car(wheel: Wheel, engine: Engine, chassis: Chassis) {
    override def toString = "Full Car wired... Color: " + chassis.paint.color
  }

}
