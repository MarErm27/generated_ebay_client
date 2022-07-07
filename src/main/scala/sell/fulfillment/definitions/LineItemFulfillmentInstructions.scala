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
case class LineItemFulfillmentInstructions(guaranteedDelivery: Option[Boolean] = None, maxEstimatedDeliveryDate: Option[String] = None, minEstimatedDeliveryDate: Option[String] = None, shipByDate: Option[String] = None)
object LineItemFulfillmentInstructions {
  implicit val encodeLineItemFulfillmentInstructions: _root_.io.circe.Encoder.AsObject[LineItemFulfillmentInstructions] = {
    val readOnlyKeys = _root_.scala.Predef.Set[_root_.scala.Predef.String]()
    _root_.io.circe.Encoder.AsObject.instance[LineItemFulfillmentInstructions](a => _root_.io.circe.JsonObject.fromIterable(_root_.scala.Vector(("guaranteedDelivery", a.guaranteedDelivery.asJson), ("maxEstimatedDeliveryDate", a.maxEstimatedDeliveryDate.asJson), ("minEstimatedDeliveryDate", a.minEstimatedDeliveryDate.asJson), ("shipByDate", a.shipByDate.asJson)))).mapJsonObject(_.filterKeys(key => !(readOnlyKeys contains key)))
  }
  implicit val decodeLineItemFulfillmentInstructions: _root_.io.circe.Decoder[LineItemFulfillmentInstructions] = new _root_.io.circe.Decoder[LineItemFulfillmentInstructions] { final def apply(c: _root_.io.circe.HCursor): _root_.io.circe.Decoder.Result[LineItemFulfillmentInstructions] = for (v0 <- c.downField("guaranteedDelivery").as[Option[Boolean]]; v1 <- c.downField("maxEstimatedDeliveryDate").as[Option[String]]; v2 <- c.downField("minEstimatedDeliveryDate").as[Option[String]]; v3 <- c.downField("shipByDate").as[Option[String]]) yield LineItemFulfillmentInstructions(v0, v1, v2, v3) }
}