package org.kyojo.schemaorg.m3n4.auto;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.NativeValueText;
import org.kyojo.schemaorg.SchemaOrgClass;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;
import org.kyojo.schemaorg.m3n4.auto.Container;
import org.kyojo.schemaorg.m3n4.core.Clazz.QualitativeValue;
import org.kyojo.schemaorg.m3n4.core.Clazz.Vehicle;

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
	public interface BusOrCoach extends NativeValueText, SchemaOrgClass, Vehicle {

		/**
		 * @see <a href="http://schema.org/acrissCode">http://schema.org/acrissCode</a>
		 */
		public Container.AcrissCode getAcrissCode();
		public void setAcrissCode(Container.AcrissCode acrissCode);

		/**
		 * @see <a href="http://schema.org/roofLoad">http://schema.org/roofLoad</a>
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
	public interface CarUsageType extends NativeValueText, QualitativeValue, SchemaOrgClass {

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
	public interface Motorcycle extends NativeValueText, SchemaOrgClass, Vehicle {

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
	public interface MotorizedBicycle extends NativeValueText, SchemaOrgClass, Vehicle {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

}
