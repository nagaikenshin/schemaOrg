package org.kyojo.schemaorg.m3n4.healthLifesci;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/PhysicalExam")
@CamelizedName("physicalExam")
@ConstantizedName("PHYSICAL_EXAM")
public interface PhysicalExam extends Clazz.PhysicalExam {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Abdomen")
	@SchemaOrgLabel("Abdomen")
	@SchemaOrgComment("Abdomen clinical examination.")
	@CamelizedName("abdomen")
	@ConstantizedName("ABDOMEN")
	@SampleValue("1")
	public interface Abdomen extends PhysicalExam {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Appearance")
	@SchemaOrgLabel("Appearance")
	@SchemaOrgComment(""
			+ "Appearance assessment with clinical examination.")
	@CamelizedName("appearance")
	@ConstantizedName("APPEARANCE")
	@SampleValue("2")
	public interface Appearance extends PhysicalExam {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CardiovascularExam")
	@SchemaOrgLabel("CardiovascularExam")
	@SchemaOrgComment(""
			+ "Cardiovascular system assessment withclinical examination.")
	@CamelizedName("cardiovascularExam")
	@ConstantizedName("CARDIOVASCULAR_EXAM")
	@SampleValue("3")
	public interface CardiovascularExam extends PhysicalExam {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Ear")
	@SchemaOrgLabel("Ear")
	@SchemaOrgComment(""
			+ "Ear function assessment with clinical examination.")
	@CamelizedName("ear")
	@ConstantizedName("EAR")
	@SampleValue("4")
	public interface Ear extends PhysicalExam {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Eye")
	@SchemaOrgLabel("Eye")
	@SchemaOrgComment(""
			+ "Eye or ophtalmological function assessment with clinical examination.")
	@CamelizedName("eye")
	@ConstantizedName("EYE")
	@SampleValue("5")
	public interface Eye extends PhysicalExam {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Genitourinary")
	@SchemaOrgLabel("Genitourinary")
	@SchemaOrgComment(""
			+ "Genitourinary system function assessment with clinical examination.")
	@CamelizedName("genitourinary")
	@ConstantizedName("GENITOURINARY")
	@SampleValue("6")
	public interface Genitourinary extends PhysicalExam {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Head")
	@SchemaOrgLabel("Head")
	@SchemaOrgComment(""
			+ "Head assessment with clinical examination.")
	@CamelizedName("head")
	@ConstantizedName("HEAD")
	@SampleValue("7")
	public interface Head extends PhysicalExam {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Lung")
	@SchemaOrgLabel("Lung")
	@SchemaOrgComment(""
			+ "Lung and respiratory system clinical examination.")
	@CamelizedName("lung")
	@ConstantizedName("LUNG")
	@SampleValue("8")
	public interface Lung extends PhysicalExam {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MusculoskeletalExam")
	@SchemaOrgLabel("MusculoskeletalExam")
	@SchemaOrgComment(""
			+ "Musculoskeletal system clinical examination.")
	@CamelizedName("musculoskeletalExam")
	@ConstantizedName("MUSCULOSKELETAL_EXAM")
	@SampleValue("9")
	public interface MusculoskeletalExam extends PhysicalExam {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Neck")
	@SchemaOrgLabel("Neck")
	@SchemaOrgComment(""
			+ "Neck assessment with clinical examination.")
	@CamelizedName("neck")
	@ConstantizedName("NECK")
	@SampleValue("10")
	public interface Neck extends PhysicalExam {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Neuro")
	@SchemaOrgLabel("Neuro")
	@SchemaOrgComment(""
			+ "Neurological system clinical examination.")
	@CamelizedName("neuro")
	@ConstantizedName("NEURO")
	@SampleValue("11")
	public interface Neuro extends PhysicalExam {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Nose")
	@SchemaOrgLabel("Nose")
	@SchemaOrgComment(""
			+ "Nose function assessment with clinical examination.")
	@CamelizedName("nose")
	@ConstantizedName("NOSE")
	@SampleValue("12")
	public interface Nose extends PhysicalExam {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Skin")
	@SchemaOrgLabel("Skin")
	@SchemaOrgComment(""
			+ "Skin assessment with clinical examination.")
	@CamelizedName("skin")
	@ConstantizedName("SKIN")
	@SampleValue("13")
	public interface Skin extends PhysicalExam {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Throat")
	@SchemaOrgLabel("Throat")
	@SchemaOrgComment(""
			+ "Throat assessment with  clinical examination.")
	@CamelizedName("throat")
	@ConstantizedName("THROAT")
	@SampleValue("14")
	public interface Throat extends PhysicalExam {

	}

}
