package org.kyojo.schemaorg.m3n5.pending;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

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
			+ " \"Authoritative\" is considered to be also <a class=\"localLink\""
			+ " href=\"http://schema.org/OfficialLegalValue\">OfficialLegalValue</a>\".")
	@CamelizedName("authoritativeLegalValue")
	@ConstantizedName("AUTHORITATIVE_LEGAL_VALUE")
	@SampleValue("1")
	public interface AuthoritativeLegalValue extends LegalValueLevel {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DefinitiveLegalValue")
	@SchemaOrgLabel("DefinitiveLegalValue")
	@SchemaOrgComment(""
			+ "Indicates a document for which the text is conclusively what the law says and is"
			+ " legally binding. (e.g. The digitally signed version of an Official Journal.)\n "
			+ " Something \"Definitive\" is considered to be also <a class=\"localLink\""
			+ " href=\"http://schema.org/AuthoritativeLegalValue\">AuthoritativeLegalValue</a>.")
	@CamelizedName("definitiveLegalValue")
	@ConstantizedName("DEFINITIVE_LEGAL_VALUE")
	@SampleValue("2")
	public interface DefinitiveLegalValue extends LegalValueLevel {

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
