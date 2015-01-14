package ar.com.gmvsoft

import ar.com.gmvsoft.model.Model._
import com.softwaremill.macwire.MacwireMacros._

object ApplicationModule {

  lazy val paint = Paint("blue")
  lazy val metal = wire[Metal]

  lazy val wheel = wire[Wheel]
  lazy val engine = wire[Engine]
  lazy val chassis = wire[Chassis]

  lazy val car = wire[Car]

}
