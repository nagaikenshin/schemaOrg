package org.kyojo.schemaorg.m3n4.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DATE_CREATED;
import org.kyojo.schemaorg.m3n4.core.Container.DateCreated;

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
