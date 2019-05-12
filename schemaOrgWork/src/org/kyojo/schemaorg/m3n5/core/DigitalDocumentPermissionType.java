package org.kyojo.schemaorg.m3n5.core;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/DigitalDocumentPermissionType")
@CamelizedName("digitalDocumentPermissionType")
@ConstantizedName("DIGITAL_DOCUMENT_PERMISSION_TYPE")
public interface DigitalDocumentPermissionType extends Clazz.DigitalDocumentPermissionType {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CommentPermission")
	@SchemaOrgLabel("CommentPermission")
	@SchemaOrgComment(""
			+ "Permission to add comments to the document.")
	@CamelizedName("commentPermission")
	@ConstantizedName("COMMENT_PERMISSION")
	@SampleValue("3")
	public interface CommentPermission extends DigitalDocumentPermissionType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ReadPermission")
	@SchemaOrgLabel("ReadPermission")
	@SchemaOrgComment(""
			+ "Permission to read or view the document.")
	@CamelizedName("readPermission")
	@ConstantizedName("READ_PERMISSION")
	@SampleValue("1")
	public interface ReadPermission extends DigitalDocumentPermissionType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/WritePermission")
	@SchemaOrgLabel("WritePermission")
	@SchemaOrgComment(""
			+ "Permission to write or edit the document.")
	@CamelizedName("writePermission")
	@ConstantizedName("WRITE_PERMISSION")
	@SampleValue("2")
	public interface WritePermission extends DigitalDocumentPermissionType {

	}

}
