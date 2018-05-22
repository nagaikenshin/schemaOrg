package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PAY_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.PayAction;

@ExternalDomain
public class PayActionConverter implements DomainConverter<PayAction, String> {

	@Override
	public String fromDomainToValue(PayAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public PayAction fromValueToDomain(String value) {
		return new PAY_ACTION(value);
	}

}
