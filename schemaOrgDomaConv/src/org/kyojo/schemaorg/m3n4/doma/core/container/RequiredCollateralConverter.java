package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.REQUIRED_COLLATERAL;
import org.kyojo.schemaorg.m3n4.core.Container.RequiredCollateral;

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
