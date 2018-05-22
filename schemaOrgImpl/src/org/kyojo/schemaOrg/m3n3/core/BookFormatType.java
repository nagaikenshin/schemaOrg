package org.kyojo.schemaOrg.m3n3.core;

import org.kyojo.schemaOrg.m3n3.CamelizedName;
import org.kyojo.schemaOrg.m3n3.ConstantizedName;
import org.kyojo.schemaOrg.m3n3.JsonLdContext;
import org.kyojo.schemaOrg.m3n3.SampleValue;
import org.kyojo.schemaOrg.m3n3.SchemaOrgComment;
import org.kyojo.schemaOrg.m3n3.SchemaOrgLabel;
import org.kyojo.schemaOrg.m3n3.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/BookFormatType")
@CamelizedName("bookFormatType")
@ConstantizedName("BOOK_FORMAT_TYPE")
public interface BookFormatType extends Clazz.BookFormatType {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AudiobookFormat")
	@SchemaOrgLabel("AudiobookFormat")
	@SchemaOrgComment(""
			+ "Book format: Audiobook. This is an enumerated value for use with the bookFormat"
			+ " property. There is also a type 'Audiobook' in the bib extension which includes"
			+ " Audiobook specific properties.")
	@CamelizedName("audiobookFormat")
	@ConstantizedName("AUDIOBOOK_FORMAT")
	@SampleValue("1")
	public interface AudiobookFormat extends BookFormatType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/EBook")
	@SchemaOrgLabel("EBook")
	@SchemaOrgComment("Book format: Ebook.")
	@CamelizedName("eBook")
	@ConstantizedName("E_BOOK")
	@SampleValue("2")
	public interface EBook extends BookFormatType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Hardcover")
	@SchemaOrgLabel("Hardcover")
	@SchemaOrgComment("Book format: Hardcover.")
	@CamelizedName("hardcover")
	@ConstantizedName("HARDCOVER")
	@SampleValue("3")
	public interface Hardcover extends BookFormatType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Paperback")
	@SchemaOrgLabel("Paperback")
	@SchemaOrgComment("Book format: Paperback.")
	@CamelizedName("paperback")
	@ConstantizedName("PAPERBACK")
	@SampleValue("4")
	public interface Paperback extends BookFormatType {

	}

}
