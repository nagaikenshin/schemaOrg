package org.kyojo.schemaOrg.m3n3.healthLifesci;

import org.kyojo.schemaOrg.m3n3.CamelizedName;
import org.kyojo.schemaOrg.m3n3.ConstantizedName;
import org.kyojo.schemaOrg.m3n3.JsonLdContext;
import org.kyojo.schemaOrg.m3n3.SampleValue;
import org.kyojo.schemaOrg.m3n3.SchemaOrgComment;
import org.kyojo.schemaOrg.m3n3.SchemaOrgLabel;
import org.kyojo.schemaOrg.m3n3.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/MedicalTrialDesign")
@CamelizedName("medicalTrialDesign")
@ConstantizedName("MEDICAL_TRIAL_DESIGN")
public interface MedicalTrialDesign extends Clazz.MedicalTrialDesign {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DoubleBlindedTrial")
	@SchemaOrgLabel("DoubleBlindedTrial")
	@SchemaOrgComment(""
			+ "A trial design in which neither the researcher nor the patient knows the details"
			+ " of the treatment the patient was randomly assigned to.")
	@CamelizedName("doubleBlindedTrial")
	@ConstantizedName("DOUBLE_BLINDED_TRIAL")
	@SampleValue("1")
	public interface DoubleBlindedTrial extends MedicalTrialDesign {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/InternationalTrial")
	@SchemaOrgLabel("InternationalTrial")
	@SchemaOrgComment("An international trial.")
	@CamelizedName("internationalTrial")
	@ConstantizedName("INTERNATIONAL_TRIAL")
	@SampleValue("2")
	public interface InternationalTrial extends MedicalTrialDesign {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MultiCenterTrial")
	@SchemaOrgLabel("MultiCenterTrial")
	@SchemaOrgComment(""
			+ "A trial that takes place at multiple centers.")
	@CamelizedName("multiCenterTrial")
	@ConstantizedName("MULTI_CENTER_TRIAL")
	@SampleValue("3")
	public interface MultiCenterTrial extends MedicalTrialDesign {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OpenTrial")
	@SchemaOrgLabel("OpenTrial")
	@SchemaOrgComment(""
			+ "A trial design in which the researcher knows the full details of the treatment,"
			+ " and so does the patient.")
	@CamelizedName("openTrial")
	@ConstantizedName("OPEN_TRIAL")
	@SampleValue("4")
	public interface OpenTrial extends MedicalTrialDesign {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PlaceboControlledTrial")
	@SchemaOrgLabel("PlaceboControlledTrial")
	@SchemaOrgComment("A placebo-controlled trial design.")
	@CamelizedName("placeboControlledTrial")
	@ConstantizedName("PLACEBO_CONTROLLED_TRIAL")
	@SampleValue("5")
	public interface PlaceboControlledTrial extends MedicalTrialDesign {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RandomizedTrial")
	@SchemaOrgLabel("RandomizedTrial")
	@SchemaOrgComment("A randomized trial design.")
	@CamelizedName("randomizedTrial")
	@ConstantizedName("RANDOMIZED_TRIAL")
	@SampleValue("6")
	public interface RandomizedTrial extends MedicalTrialDesign {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SingleBlindedTrial")
	@SchemaOrgLabel("SingleBlindedTrial")
	@SchemaOrgComment(""
			+ "A trial design in which the researcher knows which treatment the patient was"
			+ " randomly assigned to but the patient does not.")
	@CamelizedName("singleBlindedTrial")
	@ConstantizedName("SINGLE_BLINDED_TRIAL")
	@SampleValue("7")
	public interface SingleBlindedTrial extends MedicalTrialDesign {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SingleCenterTrial")
	@SchemaOrgLabel("SingleCenterTrial")
	@SchemaOrgComment(""
			+ "A trial that takes place at a single center.")
	@CamelizedName("singleCenterTrial")
	@ConstantizedName("SINGLE_CENTER_TRIAL")
	@SampleValue("8")
	public interface SingleCenterTrial extends MedicalTrialDesign {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TripleBlindedTrial")
	@SchemaOrgLabel("TripleBlindedTrial")
	@SchemaOrgComment(""
			+ "A trial design in which neither the researcher, the person administering the"
			+ " therapy nor the patient knows the details of the treatment the patient was"
			+ " randomly assigned to.")
	@CamelizedName("tripleBlindedTrial")
	@ConstantizedName("TRIPLE_BLINDED_TRIAL")
	@SampleValue("9")
	public interface TripleBlindedTrial extends MedicalTrialDesign {

	}

}
