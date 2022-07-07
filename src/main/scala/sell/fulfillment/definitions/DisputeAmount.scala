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
case class DisputeAmount(convertedFromCurrency: Option[String] = None, convertedFromValue: Option[String] = None, currency: Option[String] = None, exchangeRate: Option[String] = None, value: Option[String] = None)
object DisputeAmount {
  implicit val encodeDisputeAmount: _root_.io.circe.Encoder.AsObject[DisputeAmount] = {
    val readOnlyKeys = _root_.scala.Predef.Set[_root_.scala.Predef.String]()
    _root_.io.circe.Encoder.AsObject.instance[DisputeAmount](a => _root_.io.circe.JsonObject.fromIterable(_root_.scala.Vector(("convertedFromCurrency", a.convertedFromCurrency.asJson), ("convertedFromValue", a.convertedFromValue.asJson), ("currency", a.currency.asJson), ("exchangeRate", a.exchangeRate.asJson), ("value", a.value.asJson)))).mapJsonObject(_.filterKeys(key => !(readOnlyKeys contains key)))
  }
  implicit val decodeDisputeAmount: _root_.io.circe.Decoder[DisputeAmount] = new _root_.io.circe.Decoder[DisputeAmount] { final def apply(c: _root_.io.circe.HCursor): _root_.io.circe.Decoder.Result[DisputeAmount] = for (v0 <- c.downField("convertedFromCurrency").as[Option[String]]; v1 <- c.downField("convertedFromValue").as[Option[String]]; v2 <- c.downField("currency").as[Option[String]]; v3 <- c.downField("exchangeRate").as[Option[String]]; v4 <- c.downField("value").as[Option[String]]) yield DisputeAmount(v0, v1, v2, v3, v4) }
}