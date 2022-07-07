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
case class InfoFromBuyer(note: Option[String] = None, returnShipmentTracking: Option[_root_.scala.Vector[TrackingInfo]] = None)
object InfoFromBuyer {
  implicit val encodeInfoFromBuyer: _root_.io.circe.Encoder.AsObject[InfoFromBuyer] = {
    val readOnlyKeys = _root_.scala.Predef.Set[_root_.scala.Predef.String]()
    _root_.io.circe.Encoder.AsObject.instance[InfoFromBuyer](a => _root_.io.circe.JsonObject.fromIterable(_root_.scala.Vector(("note", a.note.asJson), ("returnShipmentTracking", a.returnShipmentTracking.asJson)))).mapJsonObject(_.filterKeys(key => !(readOnlyKeys contains key)))
  }
  implicit val decodeInfoFromBuyer: _root_.io.circe.Decoder[InfoFromBuyer] = new _root_.io.circe.Decoder[InfoFromBuyer] { final def apply(c: _root_.io.circe.HCursor): _root_.io.circe.Decoder.Result[InfoFromBuyer] = for (v0 <- c.downField("note").as[Option[String]]; v1 <- c.downField("returnShipmentTracking").as[Option[_root_.scala.Vector[TrackingInfo]]]) yield InfoFromBuyer(v0, v1) }
}