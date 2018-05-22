package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.sql.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RELEASE_DATE;
import org.kyojo.schemaOrg.m3n3.core.Container.ReleaseDate;

@ExternalDomain
public class ReleaseDateConverter implements DomainConverter<ReleaseDate, Date> {

	@Override
	public Date fromDomainToValue(ReleaseDate domain) {
		if(domain != null && domain.getDateList() != null && domain.getDateList().size() > 0) {
			return Date.valueOf(domain.getDateList().get(0).getDate());
		} else {
			return null;
		}
	}

	@Override
	public ReleaseDate fromValueToDomain(Date value) {
		return new RELEASE_DATE(value);
	}

}
