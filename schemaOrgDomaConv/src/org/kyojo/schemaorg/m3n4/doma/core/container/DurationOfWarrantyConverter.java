package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DURATION_OF_WARRANTY;
import org.kyojo.schemaorg.m3n4.core.Container.DurationOfWarranty;

@ExternalDomain
public class DurationOfWarrantyConverter implements DomainConverter<DurationOfWarranty, String> {

	@Override
	public String fromDomainToValue(DurationOfWarranty domain) {
		return domain.getNativeValue();
	}

	@Override
	public DurationOfWarranty fromValueToDomain(String value) {
		return new DURATION_OF_WARRANTY(value);
	}

}
