package org.kyojo.schemaOrg.m3n3.healthLifesci;

import org.kyojo.schemaOrg.m3n3.CamelizedName;
import org.kyojo.schemaOrg.m3n3.ConstantizedName;
import org.kyojo.schemaOrg.m3n3.JsonLdContext;
import org.kyojo.schemaOrg.m3n3.SampleValue;
import org.kyojo.schemaOrg.m3n3.SchemaOrgClass;
import org.kyojo.schemaOrg.m3n3.SchemaOrgComment;
import org.kyojo.schemaOrg.m3n3.SchemaOrgLabel;
import org.kyojo.schemaOrg.m3n3.SchemaOrgURI;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalProcedure;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/MedicalProcedureType")
@CamelizedName("medicalProcedureType")
@ConstantizedName("MEDICAL_PROCEDURE_TYPE")
public interface MedicalProcedureType extends Clazz.MedicalProcedureType {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/NoninvasiveProcedure")
	@SchemaOrgLabel("NoninvasiveProcedure")
	@SchemaOrgComment(""
			+ "A type of medical procedure that involves noninvasive techniques.")
	@CamelizedName("noninvasiveProcedure")
	@ConstantizedName("NONINVASIVE_PROCEDURE")
	@SampleValue("1")
	public interface NoninvasiveProcedure extends MedicalProcedureType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PercutaneousProcedure")
	@SchemaOrgLabel("PercutaneousProcedure")
	@SchemaOrgComment(""
			+ "A type of medical procedure that involves percutaneous techniques, where access"
			+ " to organs or tissue is achieved via needle-puncture of the skin. For example,"
			+ " catheter-based procedures like stent delivery.")
	@CamelizedName("percutaneousProcedure")
	@ConstantizedName("PERCUTANEOUS_PROCEDURE")
	@SampleValue("2")
	public interface PercutaneousProcedure extends MedicalProcedureType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SurgicalProcedure")
	@SchemaOrgLabel("SurgicalProcedure")
	@SchemaOrgComment(""
			+ "A type of medical procedure that involves invasive surgical techniques.")
	@CamelizedName("surgicalProcedure")
	@ConstantizedName("SURGICAL_PROCEDURE")
	@SampleValue("3")
	public interface SurgicalProcedure extends MedicalProcedure, MedicalProcedureType, SchemaOrgClass {

	}

}
