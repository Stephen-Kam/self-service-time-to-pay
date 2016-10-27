package uk.gov.hmrc.ssttp.Support

import java.io.{File => JFile}

import play.api.Play.current
import play.api.libs.ws.{WS, WSResponse}

import scala.io.Source

trait GetBanksActions extends ActionsSupport {
  
  def createDDRequest(file: JFile): WSResponse = createDDRequest(Source.fromFile(file).mkString)

  def createDDRequest(data: String): WSResponse = createDDRequest(data.getBytes())

  def createDDRequest(data: Array[Byte]): WSResponse =
    WS
      .url(s"$url/customers/1234567890123456/instructions-request")
      .withHeaders("Content-Type" -> "application/json")
      .post(data)
      .futureValue
}
