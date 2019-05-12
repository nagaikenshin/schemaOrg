package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BRAND;
import org.kyojo.schemaorg.m3n5.core.Container.Brand;

@ExternalDomain
public class BrandConverter implements DomainConverter<Brand, String> {

	@Override
	public String fromDomainToValue(Brand domain) {
		return domain.getNativeValue();
	}

	@Override
	public Brand fromValueToDomain(String value) {
		return new BRAND(value);
	}

}
