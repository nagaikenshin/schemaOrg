package org.kyojo.schemaorg.m3n5.healthLifesci;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

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
