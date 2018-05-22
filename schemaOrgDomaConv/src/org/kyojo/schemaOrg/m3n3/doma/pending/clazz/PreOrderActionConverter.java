package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.PRE_ORDER_ACTION;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.PreOrderAction;

@ExternalDomain
public class PreOrderActionConverter implements DomainConverter<PreOrderAction, String> {

	@Override
	public String fromDomainToValue(PreOrderAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public PreOrderAction fromValueToDomain(String value) {
		return new PRE_ORDER_ACTION(value);
	}

}
