package org.kyojo.schemaorg.m3n5.doma.core.container;

import java.sql.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.LAST_REVIEWED;
import org.kyojo.schemaorg.m3n5.core.Container.LastReviewed;

@ExternalDomain
public class LastReviewedConverter implements DomainConverter<LastReviewed, Date> {

	@Override
	public Date fromDomainToValue(LastReviewed domain) {
		if(domain != null && domain.getDateList() != null && domain.getDateList().size() > 0) {
			return Date.valueOf(domain.getDateList().get(0).getDate());
		} else {
			return null;
		}
	}

	@Override
	public LastReviewed fromValueToDomain(Date value) {
		return new LAST_REVIEWED(value);
	}

}
