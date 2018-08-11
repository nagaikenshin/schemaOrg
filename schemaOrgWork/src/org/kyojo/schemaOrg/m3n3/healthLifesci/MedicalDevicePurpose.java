package org.kyojo.schemaOrg.m3n3.healthLifesci;

import org.kyojo.schemaOrg.CamelizedName;
import org.kyojo.schemaOrg.ConstantizedName;
import org.kyojo.schemaOrg.JsonLdContext;
import org.kyojo.schemaOrg.SampleValue;
import org.kyojo.schemaOrg.SchemaOrgComment;
import org.kyojo.schemaOrg.SchemaOrgLabel;
import org.kyojo.schemaOrg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/MedicalDevicePurpose")
@CamelizedName("medicalDevicePurpose")
@ConstantizedName("MEDICAL_DEVICE_PURPOSE")
public interface MedicalDevicePurpose extends Clazz.MedicalDevicePurpose {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Diagnostic")
	@SchemaOrgLabel("Diagnostic")
	@SchemaOrgComment(""
			+ "A medical device used for diagnostic purposes.")
	@CamelizedName("diagnostic")
	@ConstantizedName("DIAGNOSTIC")
	@SampleValue("1")
	public interface Diagnostic extends MedicalDevicePurpose {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Therapeutic")
	@SchemaOrgLabel("Therapeutic")
	@SchemaOrgComment(""
			+ "A medical device used for therapeutic purposes.")
	@CamelizedName("therapeutic")
	@ConstantizedName("THERAPEUTIC")
	@SampleValue("2")
	public interface Therapeutic extends MedicalDevicePurpose {

	}

}
