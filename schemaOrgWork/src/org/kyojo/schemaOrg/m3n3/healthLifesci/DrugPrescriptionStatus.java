package org.kyojo.schemaOrg.m3n3.healthLifesci;

import org.kyojo.schemaOrg.CamelizedName;
import org.kyojo.schemaOrg.ConstantizedName;
import org.kyojo.schemaOrg.JsonLdContext;
import org.kyojo.schemaOrg.SampleValue;
import org.kyojo.schemaOrg.SchemaOrgComment;
import org.kyojo.schemaOrg.SchemaOrgLabel;
import org.kyojo.schemaOrg.SchemaOrgURI;

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
