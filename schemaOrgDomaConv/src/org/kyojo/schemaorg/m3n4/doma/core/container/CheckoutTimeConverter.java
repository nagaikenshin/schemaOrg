package org.kyojo.schemaorg.m3n4.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CHECKOUT_TIME;
import org.kyojo.schemaorg.m3n4.core.Container.CheckoutTime;

@ExternalDomain
public class CheckoutTimeConverter implements DomainConverter<CheckoutTime, Date> {

	@Override
	public Date fromDomainToValue(CheckoutTime domain) {
		return domain.getNativeValue();
	}

	@Override
	public CheckoutTime fromValueToDomain(Date value) {
		return new CHECKOUT_TIME(value);
	}

}
