package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.START_DATE;
import org.kyojo.schemaOrg.m3n3.core.Container.StartDate;

@ExternalDomain
public class StartDateConverter implements DomainConverter<StartDate, Date> {

	@Override
	public Date fromDomainToValue(StartDate domain) {
		return domain.getNativeValue();
	}

	@Override
	public StartDate fromValueToDomain(Date value) {
		return new START_DATE(value);
	}

}
