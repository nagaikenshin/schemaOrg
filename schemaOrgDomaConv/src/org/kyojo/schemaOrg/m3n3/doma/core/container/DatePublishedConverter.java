package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.sql.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DATE_PUBLISHED;
import org.kyojo.schemaOrg.m3n3.core.Container.DatePublished;

@ExternalDomain
public class DatePublishedConverter implements DomainConverter<DatePublished, Date> {

	@Override
	public Date fromDomainToValue(DatePublished domain) {
		if(domain != null && domain.getDateList() != null && domain.getDateList().size() > 0) {
			return Date.valueOf(domain.getDateList().get(0).getDate());
		} else {
			return null;
		}
	}

	@Override
	public DatePublished fromValueToDomain(Date value) {
		return new DATE_PUBLISHED(value);
	}

}
