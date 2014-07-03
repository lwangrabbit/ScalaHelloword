package com.zte.exercise

class UrlParse(val url:String) {
  def getProtocol():String = {
    val strIndex = url.indexOf(":")
    url.substring(0, strIndex)
  }

  def getDomain():String = {
    "www.google.com"
  }
}
