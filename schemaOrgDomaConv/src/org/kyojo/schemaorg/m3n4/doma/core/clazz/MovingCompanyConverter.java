package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.MOVING_COMPANY;
import org.kyojo.schemaorg.m3n4.core.Clazz.MovingCompany;

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