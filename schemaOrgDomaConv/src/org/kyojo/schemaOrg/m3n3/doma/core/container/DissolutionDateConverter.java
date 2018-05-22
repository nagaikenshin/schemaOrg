package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.sql.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DISSOLUTION_DATE;
import org.kyojo.schemaOrg.m3n3.core.Container.DissolutionDate;

@ExternalDomain
public class DissolutionDateConverter implements DomainConverter<DissolutionDate, Date> {

	@Override
	public Date fromDomainToValue(DissolutionDate domain) {
		if(domain != null && domain.getDateList() != null && domain.getDateList().size() > 0) {
			return Date.valueOf(domain.getDateList().get(0).getDate());
		} else {
			return null;
		}
	}

	@Override
	public DissolutionDate fromValueToDomain(Date value) {
		return new DISSOLUTION_DATE(value);
	}

}
