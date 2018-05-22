package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MOVING_COMPANY;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MovingCompany;

@ExternalDomain
public class MovingCompanyConverter implements DomainConverter<MovingCompany, String> {

	@Override
	public String fromDomainToValue(MovingCompany domain) {
		return domain.getNativeValue();
	}

	@Override
	public MovingCompany fromValueToDomain(String value) {
		return new MOVING_COMPANY(value);
	}

}
