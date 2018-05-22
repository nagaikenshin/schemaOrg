package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ARRIVE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ArriveAction;

@ExternalDomain
public class ArriveActionConverter implements DomainConverter<ArriveAction, String> {

	@Override
	public String fromDomainToValue(ArriveAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public ArriveAction fromValueToDomain(String value) {
		return new ARRIVE_ACTION(value);
	}

}
