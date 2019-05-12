package org.kyojo.schemaorg.m3n5.doma.core.digitalDocumentPermissionType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.digitalDocumentPermissionType.WRITE_PERMISSION;
import org.kyojo.schemaorg.m3n5.core.DigitalDocumentPermissionType.WritePermission;

@ExternalDomain
public class WritePermissionConverter implements DomainConverter<WritePermission, String> {

	@Override
	public String fromDomainToValue(WritePermission domain) {
		return domain.getNativeValue();
	}

	@Override
	public WritePermission fromValueToDomain(String value) {
		return new WRITE_PERMISSION(value);
	}

}