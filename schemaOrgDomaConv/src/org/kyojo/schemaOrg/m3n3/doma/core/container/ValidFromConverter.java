package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.VALID_FROM;
import org.kyojo.schemaOrg.m3n3.core.Container.ValidFrom;

@ExternalDomain
public class ValidFromConverter implements DomainConverter<ValidFrom, Date> {

	@Override
	public Date fromDomainToValue(ValidFrom domain) {
		return domain.getNativeValue();
	}

	@Override
	public ValidFrom fromValueToDomain(Date value) {
		return new VALID_FROM(value);
	}

}
