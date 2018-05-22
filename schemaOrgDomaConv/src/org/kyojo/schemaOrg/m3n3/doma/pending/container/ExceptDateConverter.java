package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.EXCEPT_DATE;
import org.kyojo.schemaOrg.m3n3.pending.Container.ExceptDate;

@ExternalDomain
public class ExceptDateConverter implements DomainConverter<ExceptDate, Date> {

	@Override
	public Date fromDomainToValue(ExceptDate domain) {
		return domain.getNativeValue();
	}

	@Override
	public ExceptDate fromValueToDomain(Date value) {
		return new EXCEPT_DATE(value);
	}

}
