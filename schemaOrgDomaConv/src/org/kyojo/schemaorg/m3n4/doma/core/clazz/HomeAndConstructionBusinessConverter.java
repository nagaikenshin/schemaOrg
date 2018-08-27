package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.HOME_AND_CONSTRUCTION_BUSINESS;
import org.kyojo.schemaorg.m3n4.core.Clazz.HomeAndConstructionBusiness;

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
