package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DATE_RECEIVED;
import org.kyojo.schemaOrg.m3n3.core.Container.DateReceived;

@ExternalDomain
public class DateReceivedConverter implements DomainConverter<DateReceived, Date> {

	@Override
	public Date fromDomainToValue(DateReceived domain) {
		return domain.getNativeValue();
	}

	@Override
	public DateReceived fromValueToDomain(Date value) {
		return new DATE_RECEIVED(value);
	}

}
