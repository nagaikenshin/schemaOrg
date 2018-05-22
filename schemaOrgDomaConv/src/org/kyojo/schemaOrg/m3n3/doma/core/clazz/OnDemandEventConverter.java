package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ON_DEMAND_EVENT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.OnDemandEvent;

@ExternalDomain
public class OnDemandEventConverter implements DomainConverter<OnDemandEvent, String> {

	@Override
	public String fromDomainToValue(OnDemandEvent domain) {
		return domain.getNativeValue();
	}

	@Override
	public OnDemandEvent fromValueToDomain(String value) {
		return new ON_DEMAND_EVENT(value);
	}

}
