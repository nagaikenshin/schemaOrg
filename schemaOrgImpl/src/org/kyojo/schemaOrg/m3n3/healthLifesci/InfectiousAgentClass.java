package org.kyojo.schemaOrg.m3n3.healthLifesci;

import org.kyojo.schemaOrg.m3n3.CamelizedName;
import org.kyojo.schemaOrg.m3n3.ConstantizedName;
import org.kyojo.schemaOrg.m3n3.JsonLdContext;
import org.kyojo.schemaOrg.m3n3.SampleValue;
import org.kyojo.schemaOrg.m3n3.SchemaOrgComment;
import org.kyojo.schemaOrg.m3n3.SchemaOrgLabel;
import org.kyojo.schemaOrg.m3n3.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/InfectiousAgentClass")
@CamelizedName("infectiousAgentClass")
@ConstantizedName("INFECTIOUS_AGENT_CLASS")
public interface InfectiousAgentClass extends Clazz.InfectiousAgentClass {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Bacteria")
	@SchemaOrgLabel("Bacteria")
	@SchemaOrgComment(""
			+ "Pathogenic bacteria that cause bacterial infection.")
	@CamelizedName("bacteria")
	@ConstantizedName("BACTERIA")
	@SampleValue("1")
	public interface Bacteria extends InfectiousAgentClass {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Fungus")
	@SchemaOrgLabel("Fungus")
	@SchemaOrgComment("Pathogenic fungus.")
	@CamelizedName("fungus")
	@ConstantizedName("FUNGUS")
	@SampleValue("2")
	public interface Fungus extends InfectiousAgentClass {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MulticellularParasite")
	@SchemaOrgLabel("MulticellularParasite")
	@SchemaOrgComment(""
			+ "Multicellular parasite that causes an infection.")
	@CamelizedName("multicellularParasite")
	@ConstantizedName("MULTICELLULAR_PARASITE")
	@SampleValue("3")
	public interface MulticellularParasite extends InfectiousAgentClass {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Prion")
	@SchemaOrgLabel("Prion")
	@SchemaOrgComment(""
			+ "A prion is an infectious agent composed of protein in a misfolded form.")
	@CamelizedName("prion")
	@ConstantizedName("PRION")
	@SampleValue("4")
	public interface Prion extends InfectiousAgentClass {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Protozoa")
	@SchemaOrgLabel("Protozoa")
	@SchemaOrgComment(""
			+ "Single-celled organism that causes an infection.")
	@CamelizedName("protozoa")
	@ConstantizedName("PROTOZOA")
	@SampleValue("5")
	public interface Protozoa extends InfectiousAgentClass {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Virus")
	@SchemaOrgLabel("Virus")
	@SchemaOrgComment(""
			+ "Pathogenic virus that causes viral infection.")
	@CamelizedName("virus")
	@ConstantizedName("VIRUS")
	@SampleValue("6")
	public interface Virus extends InfectiousAgentClass {

	}

}
