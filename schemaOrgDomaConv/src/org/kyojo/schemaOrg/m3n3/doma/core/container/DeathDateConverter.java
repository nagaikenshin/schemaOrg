package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.sql.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DEATH_DATE;
import org.kyojo.schemaOrg.m3n3.core.Container.DeathDate;

@ExternalDomain
public class DeathDateConverter implements DomainConverter<DeathDate, Date> {

	@Override
	public Date fromDomainToValue(DeathDate domain) {
		if(domain != null && domain.getDateList() != null && domain.getDateList().size() > 0) {
			return Date.valueOf(domain.getDateList().get(0).getDate());
		} else {
			return null;
		}
	}

	@Override
	public DeathDate fromValueToDomain(Date value) {
		return new DEATH_DATE(value);
	}

}
