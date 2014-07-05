package com.zte.exercise

import org.scalatest.{FunSpec, Matchers}
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class UrlParseTest extends FunSpec with Matchers {
	describe("UrlParse's get protocol, get domain, get path") {
		it("http://www.google.com, the protocol should return http," +
       "the domain should return www.google.com," +
       "the path should return empty string") {
			val url = "http://www.google.com"
			val urlParse = new UrlParse(url)
			urlParse.getProtocol() should be ("http")
      urlParse.getDomain() should be ("www.google.com")
      urlParse.getPath() should be ("")
		}
    it("ftp://test.com, the protocol should return ftp," +
      "the domain should return test.com," +
      "the path should return empty string") {
      val url = "ftp://test.com"
      val urlParse = new UrlParse(url)
      urlParse.getProtocol() should be ("ftp")
      urlParse.getDomain() should be ("test.com")
      urlParse.getPath() should be ("")
    }
    it("https://www.bankOfChina.com/a-path, the protocol should return https," +
      "the domain should return www.bankOfChina.com," +
      "the path should return a-path") {
      val url = "https://www.bankOfChina.com/a-path"
      val urlParse = new UrlParse(url)
      urlParse.getProtocol() should be ("https")
      urlParse.getDomain() should be ("www.bankOfChina.com")
      urlParse.getPath() should be ("a-path")
    }
    it("http://share.zte.com.cn/tech/jsp/userlogin," +
      "the protocol should return http," +
      "the domain should return share.zte.com.cn," +
      "the path should return tech/jsp/userlogin") {
      val url = "http://share.zte.com.cn/tech/jsp/userlogin"
      val urlParse = new UrlParse(url)
      urlParse.getProtocol() should be ("http")
      urlParse.getDomain() should be ("share.zte.com.cn")
      urlParse.getPath() should be ("tech/jsp/userlogin")
    }
    it("abc.com, the protocol should return empty") {
      val url = "abc.com"
      val urlParse = new UrlParse(url)
      urlParse.getProtocol() should be ("")
    }
    it("abc.com, the domain should return abc.com") {
      val url = "abc.com"
      val urlParse = new UrlParse(url)
      urlParse.getDomain() should be ("abc.com")
    }
    it("abc.com, the path should return empty") {
      val url = "abc.com"
      val urlParse = new UrlParse(url)
      urlParse.getPath() should be ("")
    }
	}
}
