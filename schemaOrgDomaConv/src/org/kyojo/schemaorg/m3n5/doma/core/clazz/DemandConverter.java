package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.DEMAND;
import org.kyojo.schemaorg.m3n5.core.Clazz.Demand;

@ExternalDomain
public class DemandConverter implements DomainConverter<Demand, String> {

	@Override
	public String fromDomainToValue(Demand domain) {
		return domain.getNativeValue();
	}

	@Override
	public Demand fromValueToDomain(String value) {
		return new DEMAND(value);
	}

}
