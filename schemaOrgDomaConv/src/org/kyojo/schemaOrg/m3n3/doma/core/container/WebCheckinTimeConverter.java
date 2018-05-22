package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.WEB_CHECKIN_TIME;
import org.kyojo.schemaOrg.m3n3.core.Container.WebCheckinTime;

@ExternalDomain
public class WebCheckinTimeConverter implements DomainConverter<WebCheckinTime, Date> {

	@Override
	public Date fromDomainToValue(WebCheckinTime domain) {
		return domain.getNativeValue();
	}

	@Override
	public WebCheckinTime fromValueToDomain(Date value) {
		return new WEB_CHECKIN_TIME(value);
	}

}
