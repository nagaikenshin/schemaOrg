package org.kyojo.schemaOrg.m3n3.doma.core.digitalDocumentPermissionType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.digitalDocumentPermissionType.WRITE_PERMISSION;
import org.kyojo.schemaOrg.m3n3.core.DigitalDocumentPermissionType.WritePermission;

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
