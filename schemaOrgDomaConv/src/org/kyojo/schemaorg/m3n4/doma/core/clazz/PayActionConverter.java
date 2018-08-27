package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PAY_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.PayAction;

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
