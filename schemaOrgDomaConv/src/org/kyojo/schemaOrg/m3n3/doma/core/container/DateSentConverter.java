package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DATE_SENT;
import org.kyojo.schemaOrg.m3n3.core.Container.DateSent;

@ExternalDomain
public class DateSentConverter implements DomainConverter<DateSent, Date> {

	@Override
	public Date fromDomainToValue(DateSent domain) {
		return domain.getNativeValue();
	}

	@Override
	public DateSent fromValueToDomain(Date value) {
		return new DATE_SENT(value);
	}

}
