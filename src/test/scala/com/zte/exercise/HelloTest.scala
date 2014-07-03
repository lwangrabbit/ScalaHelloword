package com.zte.exercise

import org.scalatest.{Matchers, FunSpec}
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class HelloTest extends FunSpec with Matchers{
  describe("HelloTest"){
    it("should return 'welcome John',when John comes"){
      val hello = new Hello("John")
      hello.get() should be ("welcome John")
    }
  }
}