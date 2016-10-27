package uk.gov.hmrc.ssttp.Support

import org.scalatest.concurrent.ScalaFutures
import org.scalatest.time.{Millis, Seconds, Span}
import play.api.http.Status

import scala.concurrent.ExecutionContext

trait ActionsSupport extends ScalaFutures with Status {

  implicit override val patienceConfig = PatienceConfig(timeout = Span(5, Seconds), interval = Span(5, Millis))
  val Port = 9000
  val desPort = 8887
  val Host = "localhost"
  val url = s"http://$Host:$Port/direct-debits"
  val fileTransferUrl = "http://localhost:9000/file-transfer"
  val fileRoutingUrl = "http://localhost:9000/file-routing"
  implicit val ec = ExecutionContext.global
}
