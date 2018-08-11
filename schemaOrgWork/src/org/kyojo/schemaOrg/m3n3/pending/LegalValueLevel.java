package org.kyojo.schemaOrg.m3n3.pending;

import org.kyojo.schemaOrg.CamelizedName;
import org.kyojo.schemaOrg.ConstantizedName;
import org.kyojo.schemaOrg.JsonLdContext;
import org.kyojo.schemaOrg.SampleValue;
import org.kyojo.schemaOrg.SchemaOrgComment;
import org.kyojo.schemaOrg.SchemaOrgLabel;
import org.kyojo.schemaOrg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/LegalValueLevel")
@CamelizedName("legalValueLevel")
@ConstantizedName("LEGAL_VALUE_LEVEL")
public interface LegalValueLevel extends Clazz.LegalValueLevel {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AuthoritativeLegalValue")
	@SchemaOrgLabel("AuthoritativeLegalValue")
	@SchemaOrgComment(""
			+ "Indicates that the publisher gives some special status to the publication of the"
			+ " document. (\"The Queens Printer\" version of a UK Act of Parliament, or the PDF"
			+ " version of a Directive published by the EU Office of Publications). Something"
			+ " \"AuthoritativeLegalValue\" is considered to be also <a class=\"localLink\""
			+ " href=\"http://schema.org/OfficialLegalValue\">OfficialLegalValue</a>\".")
	@CamelizedName("authoritativeLegalValue")
	@ConstantizedName("AUTHORITATIVE_LEGAL_VALUE")
	@SampleValue("1")
	public interface AuthoritativeLegalValue extends LegalValueLevel {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Definitive")
	@SchemaOrgLabel("Definitive")
	@SchemaOrgComment(""
			+ "Indicates a document for which the text is conclusively what the law says and is"
			+ " legally binding. (e.g. The digitally signed version of an Official Journal.)\n "
			+ " Something \"Definitive\" is considered to be also \"<a"
			+ " href=\"/Authoritative\">Authoritative</a>\".")
	@CamelizedName("definitive")
	@ConstantizedName("DEFINITIVE")
	@SampleValue("2")
	public interface Definitive extends LegalValueLevel {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OfficialLegalValue")
	@SchemaOrgLabel("OfficialLegalValue")
	@SchemaOrgComment(""
			+ "All the documents published by an official publisher should have at least the"
			+ " legal value level \"OfficialLegalValue\". This indicates that the document was"
			+ " published by an organisation with the public task of making it available (e.g."
			+ " a consolidated version of a EU directive published by the EU Office of"
			+ " Publications).")
	@CamelizedName("officialLegalValue")
	@ConstantizedName("OFFICIAL_LEGAL_VALUE")
	@SampleValue("3")
	public interface OfficialLegalValue extends LegalValueLevel {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/UnofficialLegalValue")
	@SchemaOrgLabel("UnofficialLegalValue")
	@SchemaOrgComment(""
			+ "Indicates that a document has no particular or special standing (e.g. a"
			+ " republication of a law by a private publisher).")
	@CamelizedName("unofficialLegalValue")
	@ConstantizedName("UNOFFICIAL_LEGAL_VALUE")
	@SampleValue("4")
	public interface UnofficialLegalValue extends LegalValueLevel {

	}

}
