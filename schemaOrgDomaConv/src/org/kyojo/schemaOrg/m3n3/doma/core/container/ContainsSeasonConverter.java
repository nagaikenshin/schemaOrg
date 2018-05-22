package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CONTAINS_SEASON;
import org.kyojo.schemaOrg.m3n3.core.Container.ContainsSeason;

@ExternalDomain
public class ContainsSeasonConverter implements DomainConverter<ContainsSeason, String> {

	@Override
	public String fromDomainToValue(ContainsSeason domain) {
		return domain.getNativeValue();
	}

	@Override
	public ContainsSeason fromValueToDomain(String value) {
		return new CONTAINS_SEASON(value);
	}

}
