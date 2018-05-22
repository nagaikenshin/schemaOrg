package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DROPOFF_TIME;
import org.kyojo.schemaOrg.m3n3.core.Container.DropoffTime;

@ExternalDomain
public class DropoffTimeConverter implements DomainConverter<DropoffTime, Date> {

	@Override
	public Date fromDomainToValue(DropoffTime domain) {
		return domain.getNativeValue();
	}

	@Override
	public DropoffTime fromValueToDomain(Date value) {
		return new DROPOFF_TIME(value);
	}

}
