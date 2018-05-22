package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.sql.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PREVIOUS_START_DATE;
import org.kyojo.schemaOrg.m3n3.core.Container.PreviousStartDate;

@ExternalDomain
public class PreviousStartDateConverter implements DomainConverter<PreviousStartDate, Date> {

	@Override
	public Date fromDomainToValue(PreviousStartDate domain) {
		if(domain != null && domain.getDateList() != null && domain.getDateList().size() > 0) {
			return Date.valueOf(domain.getDateList().get(0).getDate());
		} else {
			return null;
		}
	}

	@Override
	public PreviousStartDate fromValueToDomain(Date value) {
		return new PREVIOUS_START_DATE(value);
	}

}
