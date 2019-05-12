package org.kyojo.schemaorg.m3n5.doma.core.digitalDocumentPermissionType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.digitalDocumentPermissionType.READ_PERMISSION;
import org.kyojo.schemaorg.m3n5.core.DigitalDocumentPermissionType.ReadPermission;

@ExternalDomain
public class ReadPermissionConverter implements DomainConverter<ReadPermission, String> {

	@Override
	public String fromDomainToValue(ReadPermission domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReadPermission fromValueToDomain(String value) {
		return new READ_PERMISSION(value);
	}

}
