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
case class OrderRefund(amount: Option[Amount] = None, refundDate: Option[String] = None, refundId: Option[String] = None, refundReferenceId: Option[String] = None, refundStatus: Option[String] = None)
object OrderRefund {
  implicit val encodeOrderRefund: _root_.io.circe.Encoder.AsObject[OrderRefund] = {
    val readOnlyKeys = _root_.scala.Predef.Set[_root_.scala.Predef.String]()
    _root_.io.circe.Encoder.AsObject.instance[OrderRefund](a => _root_.io.circe.JsonObject.fromIterable(_root_.scala.Vector(("amount", a.amount.asJson), ("refundDate", a.refundDate.asJson), ("refundId", a.refundId.asJson), ("refundReferenceId", a.refundReferenceId.asJson), ("refundStatus", a.refundStatus.asJson)))).mapJsonObject(_.filterKeys(key => !(readOnlyKeys contains key)))
  }
  implicit val decodeOrderRefund: _root_.io.circe.Decoder[OrderRefund] = new _root_.io.circe.Decoder[OrderRefund] { final def apply(c: _root_.io.circe.HCursor): _root_.io.circe.Decoder.Result[OrderRefund] = for (v0 <- c.downField("amount").as[Option[Amount]]; v1 <- c.downField("refundDate").as[Option[String]]; v2 <- c.downField("refundId").as[Option[String]]; v3 <- c.downField("refundReferenceId").as[Option[String]]; v4 <- c.downField("refundStatus").as[Option[String]]) yield OrderRefund(v0, v1, v2, v3, v4) }
}