package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ACCESSIBILITY_SUMMARY;
import org.kyojo.schemaOrg.m3n3.core.Container.AccessibilitySummary;

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
