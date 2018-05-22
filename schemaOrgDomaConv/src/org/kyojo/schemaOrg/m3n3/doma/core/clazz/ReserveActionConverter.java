package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RESERVE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ReserveAction;

@ExternalDomain
public class ReserveActionConverter implements DomainConverter<ReserveAction, String> {

	@Override
	public String fromDomainToValue(ReserveAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReserveAction fromValueToDomain(String value) {
		return new RESERVE_ACTION(value);
	}

}
