package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HOME_AND_CONSTRUCTION_BUSINESS;
import org.kyojo.schemaOrg.m3n3.core.Clazz.HomeAndConstructionBusiness;

@ExternalDomain
public class HomeAndConstructionBusinessConverter implements DomainConverter<HomeAndConstructionBusiness, String> {

	@Override
	public String fromDomainToValue(HomeAndConstructionBusiness domain) {
		return domain.getNativeValue();
	}

	@Override
	public HomeAndConstructionBusiness fromValueToDomain(String value) {
		return new HOME_AND_CONSTRUCTION_BUSINESS(value);
	}

}
