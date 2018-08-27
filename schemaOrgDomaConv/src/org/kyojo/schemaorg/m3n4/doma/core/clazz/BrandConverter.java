package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.BRAND;
import org.kyojo.schemaorg.m3n4.core.Clazz.Brand;

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
