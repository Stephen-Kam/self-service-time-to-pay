//package uk.gov.hmrc.ssttp.support
//
//import play.api.libs.json.Json
//
//object GetBanksReportSupport extends Support {
//
//  def requestBodyAsJson(args: Map[String, Any] = Map.empty) = Json.parse(requestBody(args))
//
//  def requestBody(args: Map[String, Any] = Map.empty) =
//    s"""
//       |{
//       |  "requestingService": "${args.getOrElse("serviceName", None)}",
//       |  "submissionDateTime": "${args.getOrElse("formattedExpiryDate", "2099-07-14T10:28:18Z")}",
//       |  "knownFact": [
//       |   {
//       |    "service": "CESA"
//       |    "value": "123456678123123"
//       |  },
//       |  {
//       |   "service": "NTC",
//       |  "value": "7263817263321"
//       |  }
//       |  ]
//       |}
//		 """.stripMargin
//}