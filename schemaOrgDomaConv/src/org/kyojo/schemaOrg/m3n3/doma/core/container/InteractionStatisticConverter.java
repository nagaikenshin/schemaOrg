package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.INTERACTION_STATISTIC;
import org.kyojo.schemaOrg.m3n3.core.Container.InteractionStatistic;

@ExternalDomain
public class InteractionStatisticConverter implements DomainConverter<InteractionStatistic, String> {

	@Override
	public String fromDomainToValue(InteractionStatistic domain) {
		return domain.getNativeValue();
	}

	@Override
	public InteractionStatistic fromValueToDomain(String value) {
		return new INTERACTION_STATISTIC(value);
	}

}
