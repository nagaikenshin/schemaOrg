package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.physicalActivityCategory;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.physicalActivityCategory.BALANCE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.PhysicalActivityCategory.Balance;

@ExternalDomain
public class BalanceConverter implements DomainConverter<Balance, String> {

	@Override
	public String fromDomainToValue(Balance domain) {
		return domain.getNativeValue();
	}

	@Override
	public Balance fromValueToDomain(String value) {
		return new BALANCE(value);
	}

}
