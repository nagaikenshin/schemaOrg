package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.COMPETITOR;
import org.kyojo.schemaorg.m3n4.core.Container.Competitor;

@ExternalDomain
public class CompetitorConverter implements DomainConverter<Competitor, String> {

	@Override
	public String fromDomainToValue(Competitor domain) {
		return domain.getNativeValue();
	}

	@Override
	public Competitor fromValueToDomain(String value) {
		return new COMPETITOR(value);
	}

}
