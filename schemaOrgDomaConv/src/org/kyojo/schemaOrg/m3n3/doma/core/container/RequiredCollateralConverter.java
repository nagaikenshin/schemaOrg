package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.REQUIRED_COLLATERAL;
import org.kyojo.schemaOrg.m3n3.core.Container.RequiredCollateral;

@ExternalDomain
public class RequiredCollateralConverter implements DomainConverter<RequiredCollateral, String> {

	@Override
	public String fromDomainToValue(RequiredCollateral domain) {
		return domain.getNativeValue();
	}

	@Override
	public RequiredCollateral fromValueToDomain(String value) {
		return new REQUIRED_COLLATERAL(value);
	}

}
