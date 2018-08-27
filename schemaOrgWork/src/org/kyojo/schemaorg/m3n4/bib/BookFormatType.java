package org.kyojo.schemaorg.m3n4.bib;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;
import org.kyojo.schemaorg.m3n4.core.Clazz.Enumeration;

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
