package com.zte.exercise

class UrlParse(val url:String) {
  def getProtocol():String = {
    url.substring(0, url.indexOf(":"))
  }

  def getDomain():String = {
    if(!hasUrlPath)
      url.substring(getDomainStartIndex)
    else
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
    url.indexOf("//") + 2
  }

  private def getDomainEndIndex: Int = {
    url.indexOf('/', getDomainStartIndex)
  }

  private def hasUrlPath: Boolean = {
    getDomainEndIndex >= 0
  }

}
