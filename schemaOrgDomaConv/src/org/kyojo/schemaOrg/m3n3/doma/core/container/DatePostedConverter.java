package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.sql.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DATE_POSTED;
import org.kyojo.schemaOrg.m3n3.core.Container.DatePosted;

@ExternalDomain
public class DatePostedConverter implements DomainConverter<DatePosted, Date> {

	@Override
	public Date fromDomainToValue(DatePosted domain) {
		if(domain != null && domain.getDateList() != null && domain.getDateList().size() > 0) {
			return Date.valueOf(domain.getDateList().get(0).getDate());
		} else {
			return null;
		}
	}

	@Override
	public DatePosted fromValueToDomain(Date value) {
		return new DATE_POSTED(value);
	}

}
