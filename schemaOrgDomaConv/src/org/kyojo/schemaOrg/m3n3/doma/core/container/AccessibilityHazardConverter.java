package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ACCESSIBILITY_HAZARD;
import org.kyojo.schemaOrg.m3n3.core.Container.AccessibilityHazard;

@ExternalDomain
public class AccessibilityHazardConverter implements DomainConverter<AccessibilityHazard, String> {

	@Override
	public String fromDomainToValue(AccessibilityHazard domain) {
		return domain.getNativeValue();
	}

	@Override
	public AccessibilityHazard fromValueToDomain(String value) {
		return new ACCESSIBILITY_HAZARD(value);
	}

}
