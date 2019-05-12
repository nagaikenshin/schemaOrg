package org.kyojo.schemaorg.m3n5.doma.core.digitalDocumentPermissionType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.digitalDocumentPermissionType.COMMENT_PERMISSION;
import org.kyojo.schemaorg.m3n5.core.DigitalDocumentPermissionType.CommentPermission;

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
