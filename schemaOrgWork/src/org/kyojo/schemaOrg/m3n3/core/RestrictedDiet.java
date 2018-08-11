package org.kyojo.schemaOrg.m3n3.core;

import org.kyojo.schemaOrg.CamelizedName;
import org.kyojo.schemaOrg.ConstantizedName;
import org.kyojo.schemaOrg.JsonLdContext;
import org.kyojo.schemaOrg.SampleValue;
import org.kyojo.schemaOrg.SchemaOrgComment;
import org.kyojo.schemaOrg.SchemaOrgLabel;
import org.kyojo.schemaOrg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/RestrictedDiet")
@CamelizedName("restrictedDiet")
@ConstantizedName("RESTRICTED_DIET")
public interface RestrictedDiet extends Clazz.RestrictedDiet {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DiabeticDiet")
	@SchemaOrgLabel("DiabeticDiet")
	@SchemaOrgComment(""
			+ "A diet appropriate for people with diabetes.")
	@CamelizedName("diabeticDiet")
	@ConstantizedName("DIABETIC_DIET")
	@SampleValue("1")
	public interface DiabeticDiet extends RestrictedDiet {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/GlutenFreeDiet")
	@SchemaOrgLabel("GlutenFreeDiet")
	@SchemaOrgComment("A diet exclusive of gluten.")
	@CamelizedName("glutenFreeDiet")
	@ConstantizedName("GLUTEN_FREE_DIET")
	@SampleValue("2")
	public interface GlutenFreeDiet extends RestrictedDiet {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/HalalDiet")
	@SchemaOrgLabel("HalalDiet")
	@SchemaOrgComment(""
			+ "A diet conforming to Islamic dietary practices.")
	@CamelizedName("halalDiet")
	@ConstantizedName("HALAL_DIET")
	@SampleValue("3")
	public interface HalalDiet extends RestrictedDiet {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/HinduDiet")
	@SchemaOrgLabel("HinduDiet")
	@SchemaOrgComment(""
			+ "A diet conforming to Hindu dietary practices, in particular, beef-free.")
	@CamelizedName("hinduDiet")
	@ConstantizedName("HINDU_DIET")
	@SampleValue("4")
	public interface HinduDiet extends RestrictedDiet {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/KosherDiet")
	@SchemaOrgLabel("KosherDiet")
	@SchemaOrgComment(""
			+ "A diet conforming to Jewish dietary practices.")
	@CamelizedName("kosherDiet")
	@ConstantizedName("KOSHER_DIET")
	@SampleValue("5")
	public interface KosherDiet extends RestrictedDiet {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LowCalorieDiet")
	@SchemaOrgLabel("LowCalorieDiet")
	@SchemaOrgComment(""
			+ "A diet focused on reduced calorie intake.")
	@CamelizedName("lowCalorieDiet")
	@ConstantizedName("LOW_CALORIE_DIET")
	@SampleValue("6")
	public interface LowCalorieDiet extends RestrictedDiet {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LowFatDiet")
	@SchemaOrgLabel("LowFatDiet")
	@SchemaOrgComment(""
			+ "A diet focused on reduced fat and cholesterol intake.")
	@CamelizedName("lowFatDiet")
	@ConstantizedName("LOW_FAT_DIET")
	@SampleValue("7")
	public interface LowFatDiet extends RestrictedDiet {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LowLactoseDiet")
	@SchemaOrgLabel("LowLactoseDiet")
	@SchemaOrgComment(""
			+ "A diet appropriate for people with lactose intolerance.")
	@CamelizedName("lowLactoseDiet")
	@ConstantizedName("LOW_LACTOSE_DIET")
	@SampleValue("8")
	public interface LowLactoseDiet extends RestrictedDiet {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LowSaltDiet")
	@SchemaOrgLabel("LowSaltDiet")
	@SchemaOrgComment(""
			+ "A diet focused on reduced sodium intake.")
	@CamelizedName("lowSaltDiet")
	@ConstantizedName("LOW_SALT_DIET")
	@SampleValue("9")
	public interface LowSaltDiet extends RestrictedDiet {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/VeganDiet")
	@SchemaOrgLabel("VeganDiet")
	@SchemaOrgComment(""
			+ "A diet exclusive of all animal products.")
	@CamelizedName("veganDiet")
	@ConstantizedName("VEGAN_DIET")
	@SampleValue("10")
	public interface VeganDiet extends RestrictedDiet {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/VegetarianDiet")
	@SchemaOrgLabel("VegetarianDiet")
	@SchemaOrgComment("A diet exclusive of animal meat.")
	@CamelizedName("vegetarianDiet")
	@ConstantizedName("VEGETARIAN_DIET")
	@SampleValue("11")
	public interface VegetarianDiet extends RestrictedDiet {

	}

}
