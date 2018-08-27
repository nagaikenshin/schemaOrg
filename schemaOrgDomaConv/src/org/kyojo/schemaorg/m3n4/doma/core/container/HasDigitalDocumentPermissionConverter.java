package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.HAS_DIGITAL_DOCUMENT_PERMISSION;
import org.kyojo.schemaorg.m3n4.core.Container.HasDigitalDocumentPermission;

@ExternalDomain
public class HasDigitalDocumentPermissionConverter implements DomainConverter<HasDigitalDocumentPermission, String> {

	@Override
	public String fromDomainToValue(HasDigitalDocumentPermission domain) {
		return domain.getNativeValue();
	}

	@Override
	public HasDigitalDocumentPermission fromValueToDomain(String value) {
		return new HAS_DIGITAL_DOCUMENT_PERMISSION(value);
	}

}