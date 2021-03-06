package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PERMITTED_USAGE;
import org.kyojo.schemaorg.m3n5.core.Container.PermittedUsage;

@ExternalDomain
public class PermittedUsageConverter implements DomainConverter<PermittedUsage, String> {

	@Override
	public String fromDomainToValue(PermittedUsage domain) {
		return domain.getNativeValue();
	}

	@Override
	public PermittedUsage fromValueToDomain(String value) {
		return new PERMITTED_USAGE(value);
	}

}
