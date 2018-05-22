package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DATE_CREATED;
import org.kyojo.schemaOrg.m3n3.core.Container.DateCreated;

@ExternalDomain
public class DateCreatedConverter implements DomainConverter<DateCreated, Date> {

	@Override
	public Date fromDomainToValue(DateCreated domain) {
		return domain.getNativeValue();
	}

	@Override
	public DateCreated fromValueToDomain(Date value) {
		return new DATE_CREATED(value);
	}

}
