package org.kyojo.schemaorg.m3n5.healthLifesci;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

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
