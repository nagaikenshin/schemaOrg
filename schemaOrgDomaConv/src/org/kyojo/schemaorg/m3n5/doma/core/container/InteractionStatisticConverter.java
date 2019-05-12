package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.INTERACTION_STATISTIC;
import org.kyojo.schemaorg.m3n5.core.Container.InteractionStatistic;

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
