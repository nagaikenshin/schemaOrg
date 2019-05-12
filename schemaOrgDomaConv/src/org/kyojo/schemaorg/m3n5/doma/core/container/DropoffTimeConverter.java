package org.kyojo.schemaorg.m3n5.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.DROPOFF_TIME;
import org.kyojo.schemaorg.m3n5.core.Container.DropoffTime;

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
