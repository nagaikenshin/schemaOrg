package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ELIGIBLE_QUANTITY;
import org.kyojo.schemaOrg.m3n3.core.Container.EligibleQuantity;

@ExternalDomain
public class EligibleQuantityConverter implements DomainConverter<EligibleQuantity, String> {

	@Override
	public String fromDomainToValue(EligibleQuantity domain) {
		return domain.getNativeValue();
	}

	@Override
	public EligibleQuantity fromValueToDomain(String value) {
		return new ELIGIBLE_QUANTITY(value);
	}

}
