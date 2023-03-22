package com.spelltome.user

import org.scalatest._
import flatspec._
import io.circe.Json
import io.circe.syntax.EncoderOps
import matchers._

class UserIdSpec extends AnyFlatSpec with should.Matchers {

  val uuidString: String = "13b469a5-b910-4029-b80e-36cd9a222a09"
  val userId: UserId = UserId(uuidString)
  val userIdAsJson: Json = Json.fromString(uuidString)

  "UserId" should "correctly encode" in {
    userId.asJson should be (userIdAsJson)
  }

  "UserId" should "correctly decode" in {
    userIdAsJson.as[UserId] should be (Right(userId))
  }
}
