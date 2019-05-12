package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ATHLETE;
import org.kyojo.schemaorg.m3n5.core.Container.Athlete;

@ExternalDomain
public class AthleteConverter implements DomainConverter<Athlete, String> {

	@Override
	public String fromDomainToValue(Athlete domain) {
		return domain.getNativeValue();
	}

	@Override
	public Athlete fromValueToDomain(String value) {
		return new ATHLETE(value);
	}

}
