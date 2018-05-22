package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DURATION_OF_WARRANTY;
import org.kyojo.schemaOrg.m3n3.core.Container.DurationOfWarranty;

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
