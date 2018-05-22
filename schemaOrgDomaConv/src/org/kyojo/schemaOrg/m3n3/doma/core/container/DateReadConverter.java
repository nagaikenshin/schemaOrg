package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DATE_READ;
import org.kyojo.schemaOrg.m3n3.core.Container.DateRead;

@ExternalDomain
public class DateReadConverter implements DomainConverter<DateRead, Date> {

	@Override
	public Date fromDomainToValue(DateRead domain) {
		return domain.getNativeValue();
	}

	@Override
	public DateRead fromValueToDomain(Date value) {
		return new DATE_READ(value);
	}

}
