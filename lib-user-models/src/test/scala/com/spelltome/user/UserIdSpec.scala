package com.spelltome.user

import org.scalatest._
import flatspec._
import io.circe.Json
import io.circe.syntax.EncoderOps
import matchers._

class UserIdSpec extends AnyFlatSpec with should.Matchers {

  private val uuidString: String = "13b469a5-b910-4029-b80e-36cd9a222a09"
  private val userId: UserId = UserId.trusted(uuidString)
  private val userIdAsJson: Json = Json.fromString(uuidString)

  "UserId" should "correctly encode" in {
    userId.asJson should be (userIdAsJson)
  }

  "UserId" should "correctly decode" in {
    userIdAsJson.as[UserId] should be (Right(userId))
  }

  "UserId" should "fail to decode when not a uuid" in {
    Json.fromString("stuff").as[UserId].isLeft should be (true)
  }
}
