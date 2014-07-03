package com.zte.exercise

class UrlParse(val url:String) {
  def getProtocol():String = {
    val strIndex = url.indexOf(":")
    url.substring(0, strIndex)
  }

  def getDomain():String = {
    val domainStartIndex = url.indexOf("//") + 2
    val domainEndIndex = url.indexOf('/',domainStartIndex)
    if(domainEndIndex < 0)
      url.substring(domainStartIndex)
    else
      url.substring(domainStartIndex, domainEndIndex)
  }
}
