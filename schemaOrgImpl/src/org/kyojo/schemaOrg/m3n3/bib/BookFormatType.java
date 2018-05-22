package org.kyojo.schemaOrg.m3n3.bib;

import org.kyojo.schemaOrg.m3n3.CamelizedName;
import org.kyojo.schemaOrg.m3n3.ConstantizedName;
import org.kyojo.schemaOrg.m3n3.JsonLdContext;
import org.kyojo.schemaOrg.m3n3.SampleValue;
import org.kyojo.schemaOrg.m3n3.SchemaOrgComment;
import org.kyojo.schemaOrg.m3n3.SchemaOrgLabel;
import org.kyojo.schemaOrg.m3n3.SchemaOrgURI;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Enumeration;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/BookFormatType")
@SchemaOrgLabel("BookFormatType")
@SchemaOrgComment("The publication format of the book.")
@CamelizedName("bookFormatType")
@ConstantizedName("BOOK_FORMAT_TYPE")
public interface BookFormatType extends Enumeration {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/GraphicNovel")
	@SchemaOrgLabel("GraphicNovel")
	@SchemaOrgComment(""
			+ "Book format: GraphicNovel. May represent a bound collection of ComicIssue"
			+ " instances.")
	@CamelizedName("graphicNovel")
	@ConstantizedName("GRAPHIC_NOVEL")
	@SampleValue("1")
	public interface GraphicNovel extends BookFormatType {

	}

}
