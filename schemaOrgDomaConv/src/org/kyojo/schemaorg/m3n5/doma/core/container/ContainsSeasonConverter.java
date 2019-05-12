package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CONTAINS_SEASON;
import org.kyojo.schemaorg.m3n5.core.Container.ContainsSeason;

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
