package org.kyojo.schemaOrg.m3n3.core;

import org.kyojo.schemaOrg.CamelizedName;
import org.kyojo.schemaOrg.ConstantizedName;
import org.kyojo.schemaOrg.JsonLdContext;
import org.kyojo.schemaOrg.SampleValue;
import org.kyojo.schemaOrg.SchemaOrgComment;
import org.kyojo.schemaOrg.SchemaOrgLabel;
import org.kyojo.schemaOrg.SchemaOrgURI;

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
