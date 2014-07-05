package com.zte.exercise

class UrlParse(val url:String) {
  def getProtocol():String = {
    url.substring(getProtocolStartIndex, getProtocolEndIndex)
  }

  private def hasUrlProtocol:Boolean = {
    url.indexOf(":") >= 0
  }

  private def getProtocolStartIndex:Int = 0
  private def getProtocolEndIndex: Int = {
    if(hasUrlProtocol) url.indexOf(":")
    else 0
  }

  def getDomain():String = {
    url.substring(getDomainStartIndex, getDomainEndIndex)
  }

  def getPath():String = {
    if(!hasUrlPath) {
      return ""
    } else {
      return url.substring(getDomainEndIndex + 1)
    }
  }

  private def getDomainStartIndex: Int = {
    if(hasUrlProtocol) url.indexOf("//") + 2
    else 0
  }

  private def getDomainEndIndex: Int = {
    if(hasUrlPath) url.indexOf('/', getDomainStartIndex)
    else url.length
  }

  private def hasUrlPath: Boolean = {
    url.indexOf('/', getDomainStartIndex) >= 0
  }

}
