package com.zte.exercise

class UrlParse(val url:String) {
  def getProtocol():String = {
    if(hasUrlProtocol) {
      url.substring(0, url.indexOf(":"))
    } else ""
  }

  private def hasUrlProtocol:Boolean = {
    url.indexOf(":") >= 0
  }

  def getDomain():String = {
    if(!hasUrlProtocol && !hasUrlPath)  url
    else if(!hasUrlProtocol && hasUrlPath)  url.substring(0, getDomainEndIndex)
    else if(hasUrlProtocol && !hasUrlPath)  url.substring(getDomainStartIndex)
    else url.substring(getDomainStartIndex, getDomainEndIndex)
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
    url.indexOf('/', getDomainStartIndex)
  }

  private def hasUrlPath: Boolean = {
    getDomainEndIndex >= 0
  }

}
