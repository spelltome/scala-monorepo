package com.spelltome.user

import io.circe.{Decoder, Encoder}

import java.util.UUID

case class UserId(arg: UUID) {
  override def toString: String = arg.toString
}

object UserId {
  def apply(arg: String): UserId = UserId(UUID.fromString(arg))

  implicit def encoder: Encoder[UserId] = Encoder.encodeString.contramap(_.toString)
  implicit def decoder: Decoder[UserId] = Decoder.decodeString.map(UserId.apply)
}
