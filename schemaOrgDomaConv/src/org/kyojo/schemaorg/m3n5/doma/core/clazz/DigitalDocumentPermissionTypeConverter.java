package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.DIGITAL_DOCUMENT_PERMISSION_TYPE;
import org.kyojo.schemaorg.m3n5.core.Clazz.DigitalDocumentPermissionType;

@ExternalDomain
public class DigitalDocumentPermissionTypeConverter implements DomainConverter<DigitalDocumentPermissionType, String> {

	@Override
	public String fromDomainToValue(DigitalDocumentPermissionType domain) {
		return domain.getNativeValue();
	}

	@Override
	public DigitalDocumentPermissionType fromValueToDomain(String value) {
		return new DIGITAL_DOCUMENT_PERMISSION_TYPE(value);
	}

}
