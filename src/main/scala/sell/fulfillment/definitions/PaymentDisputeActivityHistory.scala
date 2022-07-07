/*
 * This file was generated by guardrail (https://github.com/guardrail-dev/guardrail).
 * Modifications will be overwritten; instead edit the OpenAPI/Swagger spec file.
 */
package sell.fulfillment.definitions

import cats.syntax.either._
import io.circe._
import io.circe.syntax._
import cats.implicits._
import _root_.sell.fulfillment.Implicits._
case class PaymentDisputeActivityHistory(activity: Option[_root_.scala.Vector[PaymentDisputeActivity]] = None)
object PaymentDisputeActivityHistory {
  implicit val encodePaymentDisputeActivityHistory: _root_.io.circe.Encoder.AsObject[PaymentDisputeActivityHistory] = {
    val readOnlyKeys = _root_.scala.Predef.Set[_root_.scala.Predef.String]()
    _root_.io.circe.Encoder.AsObject.instance[PaymentDisputeActivityHistory](a => _root_.io.circe.JsonObject.fromIterable(_root_.scala.Vector(("activity", a.activity.asJson)))).mapJsonObject(_.filterKeys(key => !(readOnlyKeys contains key)))
  }
  implicit val decodePaymentDisputeActivityHistory: _root_.io.circe.Decoder[PaymentDisputeActivityHistory] = new _root_.io.circe.Decoder[PaymentDisputeActivityHistory] { final def apply(c: _root_.io.circe.HCursor): _root_.io.circe.Decoder.Result[PaymentDisputeActivityHistory] = for (v0 <- c.downField("activity").as[Option[_root_.scala.Vector[PaymentDisputeActivity]]]) yield PaymentDisputeActivityHistory(v0) }
}