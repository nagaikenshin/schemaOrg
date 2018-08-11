package org.kyojo.schemaOrg.m3n3.healthLifesci;

import org.kyojo.schemaOrg.CamelizedName;
import org.kyojo.schemaOrg.ConstantizedName;
import org.kyojo.schemaOrg.JsonLdContext;
import org.kyojo.schemaOrg.SampleValue;
import org.kyojo.schemaOrg.SchemaOrgComment;
import org.kyojo.schemaOrg.SchemaOrgLabel;
import org.kyojo.schemaOrg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/MedicalAudience")
@CamelizedName("medicalAudience")
@ConstantizedName("MEDICAL_AUDIENCE")
public interface MedicalAudience extends Clazz.MedicalAudience {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Clinician")
	@SchemaOrgLabel("Clinician")
	@SchemaOrgComment(""
			+ "Medical clinicians, including practicing physicians and other medical"
			+ " professionals involved in clinical practice.")
	@CamelizedName("clinician")
	@ConstantizedName("CLINICIAN")
	@SampleValue("1")
	public interface Clinician extends MedicalAudience {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalResearcher")
	@SchemaOrgLabel("MedicalResearcher")
	@SchemaOrgComment("Medical researchers.")
	@CamelizedName("medicalResearcher")
	@ConstantizedName("MEDICAL_RESEARCHER")
	@SampleValue("2")
	public interface MedicalResearcher extends MedicalAudience {

	}

}
