package org.kyojo.schemaorg.m3n4.doma.core.container;

import java.sql.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.RELEASE_DATE;
import org.kyojo.schemaorg.m3n4.core.Container.ReleaseDate;

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
