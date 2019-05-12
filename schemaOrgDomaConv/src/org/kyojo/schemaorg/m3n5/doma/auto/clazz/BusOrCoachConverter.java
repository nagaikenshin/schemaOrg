package org.kyojo.schemaorg.m3n5.doma.auto.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.auto.impl.BUS_OR_COACH;
import org.kyojo.schemaorg.m3n5.auto.Clazz.BusOrCoach;

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