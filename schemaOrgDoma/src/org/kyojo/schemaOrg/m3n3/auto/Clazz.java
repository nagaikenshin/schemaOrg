package org.kyojo.schemaOrg.m3n3.auto;

import org.kyojo.schemaOrg.m3n3.CamelizedName;
import org.kyojo.schemaOrg.m3n3.ConstantizedName;
import org.kyojo.schemaOrg.m3n3.JsonLdContext;
import org.kyojo.schemaOrg.m3n3.SchemaOrgClass;
import org.kyojo.schemaOrg.m3n3.SchemaOrgComment;
import org.kyojo.schemaOrg.m3n3.SchemaOrgLabel;
import org.kyojo.schemaOrg.m3n3.SchemaOrgURI;
import org.kyojo.schemaOrg.m3n3.auto.Container;
import org.kyojo.schemaOrg.m3n3.core.Clazz.QualitativeValue;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Vehicle;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://www.w3.org/2000/01/rdf-schema#Class")
@CamelizedName("clazz")
@ConstantizedName("CLAZZ")
public interface Clazz extends SchemaOrgClass {

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BusOrCoach")
	@SchemaOrgLabel("BusOrCoach")
	@SchemaOrgComment(""
			+ "A bus (also omnibus or autobus) is a road vehicle designed to carry passengers."
			+ " Coaches are luxury busses, usually in service for long distance travel.")
	@CamelizedName("busOrCoach")
	@ConstantizedName("BUS_OR_COACH")
	public interface BusOrCoach extends SchemaOrgClass, Vehicle {

		/**
		 * uri: http://schema.org/acrissCode
		 * class: org.kyojo.schemaOrg.m3n3.auto.Container.AcrissCode
		 */
		public Container.AcrissCode getAcrissCode();
		public void setAcrissCode(Container.AcrissCode acrissCode);

		/**
		 * uri: http://schema.org/roofLoad
		 * class: org.kyojo.schemaOrg.m3n3.auto.Container.RoofLoad
		 */
		public Container.RoofLoad getRoofLoad();
		public void setRoofLoad(Container.RoofLoad roofLoad);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CarUsageType")
	@SchemaOrgLabel("CarUsageType")
	@SchemaOrgComment(""
			+ "A value indicating a special usage of a car, e.g. commercial rental, driving"
			+ " school, or as a taxi.")
	@CamelizedName("carUsageType")
	@ConstantizedName("CAR_USAGE_TYPE")
	public interface CarUsageType extends QualitativeValue, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Motorcycle")
	@SchemaOrgLabel("Motorcycle")
	@SchemaOrgComment(""
			+ "A motorcycle or motorbike is a single-track, two-wheeled motor vehicle.")
	@CamelizedName("motorcycle")
	@ConstantizedName("MOTORCYCLE")
	public interface Motorcycle extends SchemaOrgClass, Vehicle {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MotorizedBicycle")
	@SchemaOrgLabel("MotorizedBicycle")
	@SchemaOrgComment(""
			+ "A motorized bicycle is a bicycle with an attached motor used to power the"
			+ " vehicle, or to assist with pedaling.")
	@CamelizedName("motorizedBicycle")
	@ConstantizedName("MOTORIZED_BICYCLE")
	public interface MotorizedBicycle extends SchemaOrgClass, Vehicle {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

}
