package org.kyojo.schemaorg.m3n5.doma.core.container;

import java.sql.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BIRTH_DATE;
import org.kyojo.schemaorg.m3n5.core.Container.BirthDate;

@ExternalDomain
public class BirthDateConverter implements DomainConverter<BirthDate, Date> {

	@Override
	public Date fromDomainToValue(BirthDate domain) {
		if(domain != null && domain.getDateList() != null && domain.getDateList().size() > 0) {
			return Date.valueOf(domain.getDateList().get(0).getDate());
		} else {
			return null;
		}
	}

	@Override
	public BirthDate fromValueToDomain(Date value) {
		return new BIRTH_DATE(value);
	}

}
