package io.getquill.context.cassandra.udt

import io.getquill.Spec
import io.getquill.context.cassandra.Udt

trait UdtSpec extends Spec {
  case class Name(firstName: String, lastName: String) extends Udt
  case class Personal(number: Int, street: String, name: Name) extends Udt
}
