package com.zte.exercise

class UrlParse(val url:String) {
  def getProtocol():String = {
    val strIndex = url.indexOf(":")
    url.substring(0, strIndex)
  }

  def getDomain():String = {
    val strIndex = url.indexOf("//")
    val strEndIndex = url.indexOf('/',strIndex + 2)
    if(strEndIndex < 0)
      url.substring(strIndex + 2)
    else
      url.substring(strIndex + 2, strEndIndex)
  }
}
