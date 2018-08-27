package org.kyojo.schemaorg.m3n3.healthLifesci;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/PhysicalActivityCategory")
@CamelizedName("physicalActivityCategory")
@ConstantizedName("PHYSICAL_ACTIVITY_CATEGORY")
public interface PhysicalActivityCategory extends Clazz.PhysicalActivityCategory {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AerobicActivity")
	@SchemaOrgLabel("AerobicActivity")
	@SchemaOrgComment(""
			+ "Physical activity of relatively low intensity that depends primarily on the"
			+ " aerobic energy-generating process; during activity, the aerobic metabolism uses"
			+ " oxygen to adequately meet energy demands during exercise.")
	@CamelizedName("aerobicActivity")
	@ConstantizedName("AEROBIC_ACTIVITY")
	@SampleValue("1")
	public interface AerobicActivity extends PhysicalActivityCategory {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AnaerobicActivity")
	@SchemaOrgLabel("AnaerobicActivity")
	@SchemaOrgComment(""
			+ "Physical activity that is of high-intensity which utilizes the anaerobic"
			+ " metabolism of the body.")
	@CamelizedName("anaerobicActivity")
	@ConstantizedName("ANAEROBIC_ACTIVITY")
	@SampleValue("2")
	public interface AnaerobicActivity extends PhysicalActivityCategory {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Balance")
	@SchemaOrgLabel("Balance")
	@SchemaOrgComment(""
			+ "Physical activity that is engaged to help maintain posture and balance.")
	@CamelizedName("balance")
	@ConstantizedName("BALANCE")
	@SampleValue("3")
	public interface Balance extends PhysicalActivityCategory {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Flexibility")
	@SchemaOrgLabel("Flexibility")
	@SchemaOrgComment(""
			+ "Physical activity that is engaged in to improve joint and muscle flexibility.")
	@CamelizedName("flexibility")
	@ConstantizedName("FLEXIBILITY")
	@SampleValue("4")
	public interface Flexibility extends PhysicalActivityCategory {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LeisureTimeActivity")
	@SchemaOrgLabel("LeisureTimeActivity")
	@SchemaOrgComment(""
			+ "Any physical activity engaged in for recreational purposes. Examples may include"
			+ " ballroom dancing, roller skating, canoeing, fishing, etc.")
	@CamelizedName("leisureTimeActivity")
	@ConstantizedName("LEISURE_TIME_ACTIVITY")
	@SampleValue("5")
	public interface LeisureTimeActivity extends PhysicalActivityCategory {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OccupationalActivity")
	@SchemaOrgLabel("OccupationalActivity")
	@SchemaOrgComment(""
			+ "Any physical activity engaged in for job-related purposes. Examples may include"
			+ " waiting tables, maid service, carrying a mailbag, picking fruits or vegetables,"
			+ " construction work, etc.")
	@CamelizedName("occupationalActivity")
	@ConstantizedName("OCCUPATIONAL_ACTIVITY")
	@SampleValue("6")
	public interface OccupationalActivity extends PhysicalActivityCategory {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/StrengthTraining")
	@SchemaOrgLabel("StrengthTraining")
	@SchemaOrgComment(""
			+ "Physical activity that is engaged in to improve muscle and bone strength. Also"
			+ " referred to as resistance training.")
	@CamelizedName("strengthTraining")
	@ConstantizedName("STRENGTH_TRAINING")
	@SampleValue("7")
	public interface StrengthTraining extends PhysicalActivityCategory {

	}

}
