package org.kyojo.schemaorg.m3n4.doma.core.container;

import java.sql.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.EXPIRES;
import org.kyojo.schemaorg.m3n4.core.Container.Expires;

@ExternalDomain
public class ExpiresConverter implements DomainConverter<Expires, Date> {

	@Override
	public Date fromDomainToValue(Expires domain) {
		if(domain != null && domain.getDateList() != null && domain.getDateList().size() > 0) {
			return Date.valueOf(domain.getDateList().get(0).getDate());
		} else {
			return null;
		}
	}

	@Override
	public Expires fromValueToDomain(Date value) {
		return new EXPIRES(value);
	}

}
