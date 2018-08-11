package org.kyojo.schemaOrg.m3n3.healthLifesci;

import org.kyojo.schemaOrg.CamelizedName;
import org.kyojo.schemaOrg.ConstantizedName;
import org.kyojo.schemaOrg.JsonLdContext;
import org.kyojo.schemaOrg.SampleValue;
import org.kyojo.schemaOrg.SchemaOrgComment;
import org.kyojo.schemaOrg.SchemaOrgLabel;
import org.kyojo.schemaOrg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/MedicalImagingTechnique")
@CamelizedName("medicalImagingTechnique")
@ConstantizedName("MEDICAL_IMAGING_TECHNIQUE")
public interface MedicalImagingTechnique extends Clazz.MedicalImagingTechnique {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CT")
	@SchemaOrgLabel("CT")
	@SchemaOrgComment("X-ray computed tomography imaging.")
	@CamelizedName("ct")
	@ConstantizedName("CT")
	@SampleValue("1")
	public interface CT extends MedicalImagingTechnique {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MRI")
	@SchemaOrgLabel("MRI")
	@SchemaOrgComment("Magnetic resonance imaging.")
	@CamelizedName("mri")
	@ConstantizedName("MRI")
	@SampleValue("2")
	public interface MRI extends MedicalImagingTechnique {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PET")
	@SchemaOrgLabel("PET")
	@SchemaOrgComment("Positron emission tomography imaging.")
	@CamelizedName("pet")
	@ConstantizedName("PET")
	@SampleValue("3")
	public interface PET extends MedicalImagingTechnique {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Radiography")
	@SchemaOrgLabel("Radiography")
	@SchemaOrgComment(""
			+ "Radiography is an imaging technique that uses electromagnetic radiation other"
			+ " than visible light, especially X-rays, to view the internal structure of a"
			+ " non-uniformly composed and opaque object such as the human body.")
	@CamelizedName("radiography")
	@ConstantizedName("RADIOGRAPHY")
	@SampleValue("4")
	public interface Radiography extends MedicalImagingTechnique, MedicalSpecialty {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Ultrasound")
	@SchemaOrgLabel("Ultrasound")
	@SchemaOrgComment("Ultrasound imaging.")
	@CamelizedName("ultrasound")
	@ConstantizedName("ULTRASOUND")
	@SampleValue("5")
	public interface Ultrasound extends MedicalImagingTechnique {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/XRay")
	@SchemaOrgLabel("XRay")
	@SchemaOrgComment("X-ray imaging.")
	@CamelizedName("xRay")
	@ConstantizedName("X_RAY")
	@SampleValue("6")
	public interface XRay extends MedicalImagingTechnique {

	}

}
