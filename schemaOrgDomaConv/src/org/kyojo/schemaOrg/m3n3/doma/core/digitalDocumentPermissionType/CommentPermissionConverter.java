package org.kyojo.schemaOrg.m3n3.doma.core.digitalDocumentPermissionType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.digitalDocumentPermissionType.COMMENT_PERMISSION;
import org.kyojo.schemaOrg.m3n3.core.DigitalDocumentPermissionType.CommentPermission;

@ExternalDomain
public class CommentPermissionConverter implements DomainConverter<CommentPermission, String> {

	@Override
	public String fromDomainToValue(CommentPermission domain) {
		return domain.getNativeValue();
	}

	@Override
	public CommentPermission fromValueToDomain(String value) {
		return new COMMENT_PERMISSION(value);
	}

}
