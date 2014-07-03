package com.zte.exercise

import org.scalatest.{FunSpec, Matchers}
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class UrlParseTest extends FunSpec with Matchers {
	describe("UrlParse's get protocol") {
		it("http://www.google.com, the protocol should return http") {
			val url = "http://www.google.com"
			val urlParse = new UrlParse(url)
			urlParse.getProtocol should be ("http")
		}
    it("ftp://test.com, the protocol should return ftp") {
      val url = "ftp://test.com"
      val urlParse = new UrlParse(url)
      urlParse.getProtocol() should be ("ftp")
    }
    it("https://www.bankOfChina.com/a-path, the protocol should return https") {
      val url = "https://www.bankOfChina.com/a-path"
      val urlParse = new UrlParse(url)
      urlParse.getProtocol() should be ("https")
    }
	}
}
