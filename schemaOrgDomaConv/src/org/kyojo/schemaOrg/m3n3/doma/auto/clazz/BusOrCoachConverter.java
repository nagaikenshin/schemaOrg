package org.kyojo.schemaOrg.m3n3.doma.auto.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.auto.impl.BUS_OR_COACH;
import org.kyojo.schemaOrg.m3n3.auto.Clazz.BusOrCoach;

@ExternalDomain
public class BusOrCoachConverter implements DomainConverter<BusOrCoach, String> {

	@Override
	public String fromDomainToValue(BusOrCoach domain) {
		return domain.getNativeValue();
	}

	@Override
	public BusOrCoach fromValueToDomain(String value) {
		return new BUS_OR_COACH(value);
	}

}
