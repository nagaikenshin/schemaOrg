package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ACCESSIBILITY_FEATURE;
import org.kyojo.schemaOrg.m3n3.core.Container.AccessibilityFeature;

@ExternalDomain
public class AccessibilityFeatureConverter implements DomainConverter<AccessibilityFeature, String> {

	@Override
	public String fromDomainToValue(AccessibilityFeature domain) {
		return domain.getNativeValue();
	}

	@Override
	public AccessibilityFeature fromValueToDomain(String value) {
		return new ACCESSIBILITY_FEATURE(value);
	}

}
