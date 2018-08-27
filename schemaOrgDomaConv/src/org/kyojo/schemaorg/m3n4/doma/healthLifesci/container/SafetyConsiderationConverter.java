package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.SAFETY_CONSIDERATION;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.SafetyConsideration;

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
