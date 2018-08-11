package org.kyojo.schemaOrg.m3n3.healthLifesci;

import org.kyojo.schemaOrg.CamelizedName;
import org.kyojo.schemaOrg.ConstantizedName;
import org.kyojo.schemaOrg.JsonLdContext;
import org.kyojo.schemaOrg.SampleValue;
import org.kyojo.schemaOrg.SchemaOrgComment;
import org.kyojo.schemaOrg.SchemaOrgLabel;
import org.kyojo.schemaOrg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/MedicineSystem")
@CamelizedName("medicineSystem")
@ConstantizedName("MEDICINE_SYSTEM")
public interface MedicineSystem extends Clazz.MedicineSystem {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Ayurvedic")
	@SchemaOrgLabel("Ayurvedic")
	@SchemaOrgComment(""
			+ "A system of medicine that originated in India over thousands of years and that"
			+ " focuses on integrating and balancing the body, mind, and spirit.")
	@CamelizedName("ayurvedic")
	@ConstantizedName("AYURVEDIC")
	@SampleValue("1")
	public interface Ayurvedic extends MedicineSystem {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Chiropractic")
	@SchemaOrgLabel("Chiropractic")
	@SchemaOrgComment(""
			+ "A system of medicine focused on the relationship between the body's structure,"
			+ " mainly the spine, and its functioning.")
	@CamelizedName("chiropractic")
	@ConstantizedName("CHIROPRACTIC")
	@SampleValue("2")
	public interface Chiropractic extends MedicineSystem {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Homeopathic")
	@SchemaOrgLabel("Homeopathic")
	@SchemaOrgComment(""
			+ "A system of medicine based on the principle that a disease can be cured by a"
			+ " substance that produces similar symptoms in healthy people.")
	@CamelizedName("homeopathic")
	@ConstantizedName("HOMEOPATHIC")
	@SampleValue("3")
	public interface Homeopathic extends MedicineSystem {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Osteopathic")
	@SchemaOrgLabel("Osteopathic")
	@SchemaOrgComment(""
			+ "A system of medicine focused on promoting the body's innate ability to heal"
			+ " itself.")
	@CamelizedName("osteopathic")
	@ConstantizedName("OSTEOPATHIC")
	@SampleValue("4")
	public interface Osteopathic extends MedicineSystem {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TraditionalChinese")
	@SchemaOrgLabel("TraditionalChinese")
	@SchemaOrgComment(""
			+ "A system of medicine based on common theoretical concepts that originated in"
			+ " China and evolved over thousands of years, that uses herbs, acupuncture,"
			+ " exercise, massage, dietary therapy, and other methods to treat a wide range of"
			+ " conditions.")
	@CamelizedName("traditionalChinese")
	@ConstantizedName("TRADITIONAL_CHINESE")
	@SampleValue("5")
	public interface TraditionalChinese extends MedicineSystem {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/WesternConventional")
	@SchemaOrgLabel("WesternConventional")
	@SchemaOrgComment(""
			+ "The conventional Western system of medicine, that aims to apply the best"
			+ " available evidence gained from the scientific method to clinical decision"
			+ " making. Also known as conventional or Western medicine.")
	@CamelizedName("westernConventional")
	@ConstantizedName("WESTERN_CONVENTIONAL")
	@SampleValue("6")
	public interface WesternConventional extends MedicineSystem {

	}

}
