package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ACCESSIBILITY_CONTROL;
import org.kyojo.schemaorg.m3n5.core.Container.AccessibilityControl;

@ExternalDomain
public class AccessibilityControlConverter implements DomainConverter<AccessibilityControl, String> {

	@Override
	public String fromDomainToValue(AccessibilityControl domain) {
		return domain.getNativeValue();
	}

	@Override
	public AccessibilityControl fromValueToDomain(String value) {
		return new ACCESSIBILITY_CONTROL(value);
	}

}
