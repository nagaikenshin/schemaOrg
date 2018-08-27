package org.kyojo.schemaorg.m3n4.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.END_DATE;
import org.kyojo.schemaorg.m3n4.core.Container.EndDate;

@ExternalDomain
public class EndDateConverter implements DomainConverter<EndDate, Date> {

	@Override
	public Date fromDomainToValue(EndDate domain) {
		return domain.getNativeValue();
	}

	@Override
	public EndDate fromValueToDomain(Date value) {
		return new END_DATE(value);
	}

}
