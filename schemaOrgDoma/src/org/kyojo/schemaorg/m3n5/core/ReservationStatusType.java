package org.kyojo.schemaorg.m3n5.core;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/ReservationStatusType")
@CamelizedName("reservationStatusType")
@ConstantizedName("RESERVATION_STATUS_TYPE")
public interface ReservationStatusType extends Clazz.ReservationStatusType {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ReservationCancelled")
	@SchemaOrgLabel("ReservationCancelled")
	@SchemaOrgComment(""
			+ "The status for a previously confirmed reservation that is now cancelled.")
	@CamelizedName("reservationCancelled")
	@ConstantizedName("RESERVATION_CANCELLED")
	@SampleValue("1")
	public interface ReservationCancelled extends ReservationStatusType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ReservationConfirmed")
	@SchemaOrgLabel("ReservationConfirmed")
	@SchemaOrgComment("The status of a confirmed reservation.")
	@CamelizedName("reservationConfirmed")
	@ConstantizedName("RESERVATION_CONFIRMED")
	@SampleValue("2")
	public interface ReservationConfirmed extends ReservationStatusType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ReservationHold")
	@SchemaOrgLabel("ReservationHold")
	@SchemaOrgComment(""
			+ "The status of a reservation on hold pending an update like credit card number or"
			+ " flight changes.")
	@CamelizedName("reservationHold")
	@ConstantizedName("RESERVATION_HOLD")
	@SampleValue("3")
	public interface ReservationHold extends ReservationStatusType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ReservationPending")
	@SchemaOrgLabel("ReservationPending")
	@SchemaOrgComment(""
			+ "The status of a reservation when a request has been sent, but not confirmed.")
	@CamelizedName("reservationPending")
	@ConstantizedName("RESERVATION_PENDING")
	@SampleValue("4")
	public interface ReservationPending extends ReservationStatusType {

	}

}
