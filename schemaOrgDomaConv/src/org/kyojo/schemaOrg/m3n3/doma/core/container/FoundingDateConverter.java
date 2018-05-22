package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.sql.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.FOUNDING_DATE;
import org.kyojo.schemaOrg.m3n3.core.Container.FoundingDate;

@ExternalDomain
public class FoundingDateConverter implements DomainConverter<FoundingDate, Date> {

	@Override
	public Date fromDomainToValue(FoundingDate domain) {
		if(domain != null && domain.getDateList() != null && domain.getDateList().size() > 0) {
			return Date.valueOf(domain.getDateList().get(0).getDate());
		} else {
			return null;
		}
	}

	@Override
	public FoundingDate fromValueToDomain(Date value) {
		return new FOUNDING_DATE(value);
	}

}
