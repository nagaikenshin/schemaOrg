package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DIGITAL_DOCUMENT_PERMISSION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.DigitalDocumentPermission;

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
