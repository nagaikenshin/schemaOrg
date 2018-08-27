package org.kyojo.schemaorg.m3n4.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DATE_DELETED;
import org.kyojo.schemaorg.m3n4.core.Container.DateDeleted;

@ExternalDomain
public class DateDeletedConverter implements DomainConverter<DateDeleted, Date> {

	@Override
	public Date fromDomainToValue(DateDeleted domain) {
		return domain.getNativeValue();
	}

	@Override
	public DateDeleted fromValueToDomain(Date value) {
		return new DATE_DELETED(value);
	}

}
