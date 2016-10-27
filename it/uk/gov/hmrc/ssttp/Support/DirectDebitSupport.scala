package uk.gov.hmrc.ssttp.Support

import play.api.libs.json.Json

object DirectDebitSupport extends Support {

  def requestBodyAsJson(args: Map[String, Any] = Map.empty) = Json.parse(requestBody(args))

  def requestBody(args: Map[String, Any] = Map.empty) = s"""
     |{
     |    "requestingService": "SSTTP",
     |    "knownFact": [
     |    {
     |      "service": "CESA",
     |      "value": "412345344555"
     |    },
     |    {
     |      "service": "PAYE",
     |      "value": "872635123"
     |    }
     |  ]
     |}
		 """.stripMargin

}
