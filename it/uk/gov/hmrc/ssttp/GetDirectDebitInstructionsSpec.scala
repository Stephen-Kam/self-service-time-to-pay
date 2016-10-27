package uk.gov.hmrc.ssttp

import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat
import play.api.libs.ws.WSResponse
import uk.gov.hmrc.ssttp.Support.{DirectDebitSupport, IntegrationSpec}


class GetDirectDebitInstructionsSpec extends IntegrationSpec {

  val formatter = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss'Z'")
  val today = new DateTime().plusMinutes(10)

  scenario("Create a new Envelope using basic sample") {
    val formattedExpiryDate: String = formatter.print(today)

    Given("I have the following JSON")
    val json = DirectDebitSupport.requestBody(Map("formattedExpiryDate" -> formattedExpiryDate))

    When("I invoke POST /customers/1234567890123456/instructions-request")
    val response: WSResponse = createDDRequest(json)

    Then("I will receive a 200 Created response")
    response.status shouldBe 200

    And("a new Envelope record will be created")
  }

}

