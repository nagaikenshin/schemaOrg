package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ATHLETE;
import org.kyojo.schemaOrg.m3n3.core.Container.Athlete;

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
