package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.SAFETY_CONSIDERATION;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.SafetyConsideration;

@ExternalDomain
public class SafetyConsiderationConverter implements DomainConverter<SafetyConsideration, String> {

	@Override
	public String fromDomainToValue(SafetyConsideration domain) {
		return domain.getNativeValue();
	}

	@Override
	public SafetyConsideration fromValueToDomain(String value) {
		return new SAFETY_CONSIDERATION(value);
	}

}
