package uk.gov.hmrc.ssttp.Support

import org.scalatest._
import org.scalatest.concurrent.Eventually
import play.api.http.Status

trait IntegrationSpec
  extends FeatureSpec
      with GivenWhenThen
      with Matchers
      with Eventually
      with Status
      with GetBanksActions
      with BeforeAndAfterEach {
  
//    val wireMockServer = new WireMockServer(wireMockConfig().port(Port))
//
//    override def beforeEach {
//      wireMockServer.start()
//      WireMock.configureFor(Host, Port)
//    }
//
//    override def afterEach {
//      wireMockServer.stop()
//    }

  }