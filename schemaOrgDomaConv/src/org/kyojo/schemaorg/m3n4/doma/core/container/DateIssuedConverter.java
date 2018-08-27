package org.kyojo.schemaorg.m3n4.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DATE_ISSUED;
import org.kyojo.schemaorg.m3n4.core.Container.DateIssued;

@ExternalDomain
public class DateIssuedConverter implements DomainConverter<DateIssued, Date> {

	@Override
	public Date fromDomainToValue(DateIssued domain) {
		return domain.getNativeValue();
	}

	@Override
	public DateIssued fromValueToDomain(Date value) {
		return new DATE_ISSUED(value);
	}

}
