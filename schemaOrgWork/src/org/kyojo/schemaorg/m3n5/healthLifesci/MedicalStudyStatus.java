package org.kyojo.schemaorg.m3n5.healthLifesci;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/MedicalStudyStatus")
@CamelizedName("medicalStudyStatus")
@ConstantizedName("MEDICAL_STUDY_STATUS")
public interface MedicalStudyStatus extends Clazz.MedicalStudyStatus {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ActiveNotRecruiting")
	@SchemaOrgLabel("ActiveNotRecruiting")
	@SchemaOrgComment(""
			+ "Active, but not recruiting new participants.")
	@CamelizedName("activeNotRecruiting")
	@ConstantizedName("ACTIVE_NOT_RECRUITING")
	@SampleValue("1")
	public interface ActiveNotRecruiting extends MedicalStudyStatus {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Completed")
	@SchemaOrgLabel("Completed")
	@SchemaOrgComment("Completed.")
	@CamelizedName("completed")
	@ConstantizedName("COMPLETED")
	@SampleValue("2")
	public interface Completed extends MedicalStudyStatus {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/EnrollingByInvitation")
	@SchemaOrgLabel("EnrollingByInvitation")
	@SchemaOrgComment(""
			+ "Enrolling participants by invitation only.")
	@CamelizedName("enrollingByInvitation")
	@ConstantizedName("ENROLLING_BY_INVITATION")
	@SampleValue("3")
	public interface EnrollingByInvitation extends MedicalStudyStatus {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/NotYetRecruiting")
	@SchemaOrgLabel("NotYetRecruiting")
	@SchemaOrgComment("Not yet recruiting.")
	@CamelizedName("notYetRecruiting")
	@ConstantizedName("NOT_YET_RECRUITING")
	@SampleValue("4")
	public interface NotYetRecruiting extends MedicalStudyStatus {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Recruiting")
	@SchemaOrgLabel("Recruiting")
	@SchemaOrgComment("Recruiting participants.")
	@CamelizedName("recruiting")
	@ConstantizedName("RECRUITING")
	@SampleValue("5")
	public interface Recruiting extends MedicalStudyStatus {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ResultsAvailable")
	@SchemaOrgLabel("ResultsAvailable")
	@SchemaOrgComment("Results are available.")
	@CamelizedName("resultsAvailable")
	@ConstantizedName("RESULTS_AVAILABLE")
	@SampleValue("6")
	public interface ResultsAvailable extends MedicalStudyStatus {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ResultsNotAvailable")
	@SchemaOrgLabel("ResultsNotAvailable")
	@SchemaOrgComment("Results are not available.")
	@CamelizedName("resultsNotAvailable")
	@ConstantizedName("RESULTS_NOT_AVAILABLE")
	@SampleValue("7")
	public interface ResultsNotAvailable extends MedicalStudyStatus {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Suspended")
	@SchemaOrgLabel("Suspended")
	@SchemaOrgComment("Suspended.")
	@CamelizedName("suspended")
	@ConstantizedName("SUSPENDED")
	@SampleValue("8")
	public interface Suspended extends MedicalStudyStatus {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Terminated")
	@SchemaOrgLabel("Terminated")
	@SchemaOrgComment("Terminated.")
	@CamelizedName("terminated")
	@ConstantizedName("TERMINATED")
	@SampleValue("9")
	public interface Terminated extends MedicalStudyStatus {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Withdrawn")
	@SchemaOrgLabel("Withdrawn")
	@SchemaOrgComment("Withdrawn.")
	@CamelizedName("withdrawn")
	@ConstantizedName("WITHDRAWN")
	@SampleValue("10")
	public interface Withdrawn extends MedicalStudyStatus {

	}

}
