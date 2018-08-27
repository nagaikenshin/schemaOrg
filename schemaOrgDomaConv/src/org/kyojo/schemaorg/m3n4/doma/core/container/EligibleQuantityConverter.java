package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ELIGIBLE_QUANTITY;
import org.kyojo.schemaorg.m3n4.core.Container.EligibleQuantity;

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
