package org.kyojo.schemaorg.m3n4.healthLifesci;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/DrugPrescriptionStatus")
@CamelizedName("drugPrescriptionStatus")
@ConstantizedName("DRUG_PRESCRIPTION_STATUS")
public interface DrugPrescriptionStatus extends Clazz.DrugPrescriptionStatus {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OTC")
	@SchemaOrgLabel("OTC")
	@SchemaOrgComment(""
			+ "The character of a medical substance, typically a medicine, of being available"
			+ " over the counter or not.")
	@CamelizedName("otc")
	@ConstantizedName("OTC")
	@SampleValue("1")
	public interface OTC extends DrugPrescriptionStatus {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PrescriptionOnly")
	@SchemaOrgLabel("PrescriptionOnly")
	@SchemaOrgComment("Available by prescription only.")
	@CamelizedName("prescriptionOnly")
	@ConstantizedName("PRESCRIPTION_ONLY")
	@SampleValue("2")
	public interface PrescriptionOnly extends DrugPrescriptionStatus {

	}

}
