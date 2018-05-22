package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.COMPETITOR;
import org.kyojo.schemaOrg.m3n3.core.Container.Competitor;

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
