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
case class EbayFulfillmentProgram(fulfilledBy: Option[String] = None)
object EbayFulfillmentProgram {
  implicit val encodeEbayFulfillmentProgram: _root_.io.circe.Encoder.AsObject[EbayFulfillmentProgram] = {
    val readOnlyKeys = _root_.scala.Predef.Set[_root_.scala.Predef.String]()
    _root_.io.circe.Encoder.AsObject.instance[EbayFulfillmentProgram](a => _root_.io.circe.JsonObject.fromIterable(_root_.scala.Vector(("fulfilledBy", a.fulfilledBy.asJson)))).mapJsonObject(_.filterKeys(key => !(readOnlyKeys contains key)))
  }
  implicit val decodeEbayFulfillmentProgram: _root_.io.circe.Decoder[EbayFulfillmentProgram] = new _root_.io.circe.Decoder[EbayFulfillmentProgram] { final def apply(c: _root_.io.circe.HCursor): _root_.io.circe.Decoder.Result[EbayFulfillmentProgram] = for (v0 <- c.downField("fulfilledBy").as[Option[String]]) yield EbayFulfillmentProgram(v0) }
}