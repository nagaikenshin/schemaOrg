package org.kyojo.schemaorg.m3n4.healthLifesci;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgClass;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalProcedure;

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
