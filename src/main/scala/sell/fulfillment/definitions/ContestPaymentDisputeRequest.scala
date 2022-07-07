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
case class ContestPaymentDisputeRequest(returnAddress: Option[ReturnAddress] = None, revision: Option[Int] = None)
object ContestPaymentDisputeRequest {
  implicit val encodeContestPaymentDisputeRequest: _root_.io.circe.Encoder.AsObject[ContestPaymentDisputeRequest] = {
    val readOnlyKeys = _root_.scala.Predef.Set[_root_.scala.Predef.String]()
    _root_.io.circe.Encoder.AsObject.instance[ContestPaymentDisputeRequest](a => _root_.io.circe.JsonObject.fromIterable(_root_.scala.Vector(("returnAddress", a.returnAddress.asJson), ("revision", a.revision.asJson)))).mapJsonObject(_.filterKeys(key => !(readOnlyKeys contains key)))
  }
  implicit val decodeContestPaymentDisputeRequest: _root_.io.circe.Decoder[ContestPaymentDisputeRequest] = new _root_.io.circe.Decoder[ContestPaymentDisputeRequest] { final def apply(c: _root_.io.circe.HCursor): _root_.io.circe.Decoder.Result[ContestPaymentDisputeRequest] = for (v0 <- c.downField("returnAddress").as[Option[ReturnAddress]]; v1 <- c.downField("revision").as[Option[Int]]) yield ContestPaymentDisputeRequest(v0, v1) }
}