package org.kyojo.schemaOrg.m3n3.core;

import org.kyojo.schemaOrg.m3n3.CamelizedName;
import org.kyojo.schemaOrg.m3n3.ConstantizedName;
import org.kyojo.schemaOrg.m3n3.JsonLdContext;
import org.kyojo.schemaOrg.m3n3.SampleValue;
import org.kyojo.schemaOrg.m3n3.SchemaOrgComment;
import org.kyojo.schemaOrg.m3n3.SchemaOrgLabel;
import org.kyojo.schemaOrg.m3n3.SchemaOrgURI;

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
