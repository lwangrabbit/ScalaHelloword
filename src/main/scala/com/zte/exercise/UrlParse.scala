package com.zte.exercise

class UrlParse(val url:String) {
  def getProtocol():String = {
    if(hasUrlProtocol()) {
      url.substring(0, url.indexOf(":"))
    } else ""
  }

  private def hasUrlProtocol():Boolean = {
    url.indexOf(":") >= 0
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
