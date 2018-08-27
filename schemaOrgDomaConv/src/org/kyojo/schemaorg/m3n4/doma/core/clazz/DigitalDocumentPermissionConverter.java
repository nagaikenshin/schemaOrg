package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DIGITAL_DOCUMENT_PERMISSION;
import org.kyojo.schemaorg.m3n4.core.Clazz.DigitalDocumentPermission;

@ExternalDomain
public class DigitalDocumentPermissionConverter implements DomainConverter<DigitalDocumentPermission, String> {

	@Override
	public String fromDomainToValue(DigitalDocumentPermission domain) {
		return domain.getNativeValue();
	}

	@Override
	public DigitalDocumentPermission fromValueToDomain(String value) {
		return new DIGITAL_DOCUMENT_PERMISSION(value);
	}

}
