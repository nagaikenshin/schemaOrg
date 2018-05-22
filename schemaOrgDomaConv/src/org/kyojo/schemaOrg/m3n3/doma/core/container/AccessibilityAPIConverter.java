package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ACCESSIBILITY_API;
import org.kyojo.schemaOrg.m3n3.core.Container.AccessibilityAPI;

@ExternalDomain
public class AccessibilityAPIConverter implements DomainConverter<AccessibilityAPI, String> {

	@Override
	public String fromDomainToValue(AccessibilityAPI domain) {
		return domain.getNativeValue();
	}

	@Override
	public AccessibilityAPI fromValueToDomain(String value) {
		return new ACCESSIBILITY_API(value);
	}

}
