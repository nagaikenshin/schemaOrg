package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ACCESSIBILITY_SUMMARY;
import org.kyojo.schemaorg.m3n4.core.Container.AccessibilitySummary;

@ExternalDomain
public class AccessibilitySummaryConverter implements DomainConverter<AccessibilitySummary, String> {

	@Override
	public String fromDomainToValue(AccessibilitySummary domain) {
		return domain.getNativeValue();
	}

	@Override
	public AccessibilitySummary fromValueToDomain(String value) {
		return new ACCESSIBILITY_SUMMARY(value);
	}

}
