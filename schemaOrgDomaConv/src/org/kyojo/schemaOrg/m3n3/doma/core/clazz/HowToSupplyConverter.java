package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HOW_TO_SUPPLY;
import org.kyojo.schemaOrg.m3n3.core.Clazz.HowToSupply;

@ExternalDomain
public class HowToSupplyConverter implements DomainConverter<HowToSupply, String> {

	@Override
	public String fromDomainToValue(HowToSupply domain) {
		return domain.getNativeValue();
	}

	@Override
	public HowToSupply fromValueToDomain(String value) {
		return new HOW_TO_SUPPLY(value);
	}

}
