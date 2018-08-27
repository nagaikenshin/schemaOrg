package org.kyojo.schemaorg.m3n4.core;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/MapCategoryType")
@CamelizedName("mapCategoryType")
@ConstantizedName("MAP_CATEGORY_TYPE")
public interface MapCategoryType extends Clazz.MapCategoryType {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ParkingMap")
	@SchemaOrgLabel("ParkingMap")
	@SchemaOrgComment("A parking map.")
	@CamelizedName("parkingMap")
	@ConstantizedName("PARKING_MAP")
	@SampleValue("1")
	public interface ParkingMap extends MapCategoryType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SeatingMap")
	@SchemaOrgLabel("SeatingMap")
	@SchemaOrgComment("A seating map.")
	@CamelizedName("seatingMap")
	@ConstantizedName("SEATING_MAP")
	@SampleValue("2")
	public interface SeatingMap extends MapCategoryType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TransitMap")
	@SchemaOrgLabel("TransitMap")
	@SchemaOrgComment("A transit map.")
	@CamelizedName("transitMap")
	@ConstantizedName("TRANSIT_MAP")
	@SampleValue("3")
	public interface TransitMap extends MapCategoryType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/VenueMap")
	@SchemaOrgLabel("VenueMap")
	@SchemaOrgComment(""
			+ "A venue map (e.g. for malls, auditoriums, museums, etc.).")
	@CamelizedName("venueMap")
	@ConstantizedName("VENUE_MAP")
	@SampleValue("4")
	public interface VenueMap extends MapCategoryType {

	}

}
