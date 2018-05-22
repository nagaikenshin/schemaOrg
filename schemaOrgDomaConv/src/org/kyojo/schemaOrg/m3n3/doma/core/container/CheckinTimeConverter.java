package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CHECKIN_TIME;
import org.kyojo.schemaOrg.m3n3.core.Container.CheckinTime;

@ExternalDomain
public class CheckinTimeConverter implements DomainConverter<CheckinTime, Date> {

	@Override
	public Date fromDomainToValue(CheckinTime domain) {
		return domain.getNativeValue();
	}

	@Override
	public CheckinTime fromValueToDomain(Date value) {
		return new CHECKIN_TIME(value);
	}

}
