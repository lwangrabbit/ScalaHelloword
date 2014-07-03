package com.zte.exercise

class UrlParse(val url:String) {
  def getProtocol():String = {
    val protocolEndIndex = url.indexOf(":")
    url.substring(0, protocolEndIndex)
  }

  def getDomain():String = {
    val domainEndIndex: Int = getDomainEndIndex
    if(domainEndIndex < 0)
      url.substring(domainStartIndex)
    else
      url.substring(domainStartIndex, domainEndIndex)
  }

  def getPath():String = {
    val domainEndIndex: Int = getDomainEndIndex
    if(domainEndIndex < 0) {
      return ""
    } else {
      val pathStartIndex = domainEndIndex + 1
      return url.substring(pathStartIndex)
    }
  }

  private def getDomainEndIndex: Int = {
    val domainStartIndex = url.indexOf("//") + 2
    val domainEndIndex = url.indexOf('/', domainStartIndex)
    domainEndIndex
  }
}
