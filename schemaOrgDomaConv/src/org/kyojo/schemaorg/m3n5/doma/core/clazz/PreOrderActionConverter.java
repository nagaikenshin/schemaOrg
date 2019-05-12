package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PRE_ORDER_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.PreOrderAction;

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
