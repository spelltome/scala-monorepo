package com.spelltome.user

import io.circe.{Decoder, Encoder}

import java.util.UUID

case class UserId(arg: UUID)

object UserId {
  def trusted(arg: String): UserId = UserId(UUID.fromString(arg))
  implicit def encoder: Encoder[UserId] = Encoder.encodeString.contramap(_.arg.toString)
  implicit def decoder: Decoder[UserId] = Decoder.decodeUUID.map(UserId.apply)
}
