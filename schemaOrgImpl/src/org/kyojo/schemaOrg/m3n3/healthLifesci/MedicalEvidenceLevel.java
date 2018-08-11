package org.kyojo.schemaOrg.m3n3.healthLifesci;

import org.kyojo.schemaOrg.CamelizedName;
import org.kyojo.schemaOrg.ConstantizedName;
import org.kyojo.schemaOrg.JsonLdContext;
import org.kyojo.schemaOrg.SampleValue;
import org.kyojo.schemaOrg.SchemaOrgComment;
import org.kyojo.schemaOrg.SchemaOrgLabel;
import org.kyojo.schemaOrg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/MedicalEvidenceLevel")
@CamelizedName("medicalEvidenceLevel")
@ConstantizedName("MEDICAL_EVIDENCE_LEVEL")
public interface MedicalEvidenceLevel extends Clazz.MedicalEvidenceLevel {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/EvidenceLevelA")
	@SchemaOrgLabel("EvidenceLevelA")
	@SchemaOrgComment(""
			+ "Data derived from multiple randomized clinical trials or meta-analyses.")
	@CamelizedName("evidenceLevelA")
	@ConstantizedName("EVIDENCE_LEVEL_A")
	@SampleValue("1")
	public interface EvidenceLevelA extends MedicalEvidenceLevel {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/EvidenceLevelB")
	@SchemaOrgLabel("EvidenceLevelB")
	@SchemaOrgComment(""
			+ "Data derived from a single randomized trial, or nonrandomized studies.")
	@CamelizedName("evidenceLevelB")
	@ConstantizedName("EVIDENCE_LEVEL_B")
	@SampleValue("2")
	public interface EvidenceLevelB extends MedicalEvidenceLevel {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/EvidenceLevelC")
	@SchemaOrgLabel("EvidenceLevelC")
	@SchemaOrgComment(""
			+ "Only consensus opinion of experts, case studies, or standard-of-care.")
	@CamelizedName("evidenceLevelC")
	@ConstantizedName("EVIDENCE_LEVEL_C")
	@SampleValue("3")
	public interface EvidenceLevelC extends MedicalEvidenceLevel {

	}

}
