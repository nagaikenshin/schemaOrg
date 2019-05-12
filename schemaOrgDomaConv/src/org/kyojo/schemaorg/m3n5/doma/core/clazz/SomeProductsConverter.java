package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SOME_PRODUCTS;
import org.kyojo.schemaorg.m3n5.core.Clazz.SomeProducts;

@ExternalDomain
public class SomeProductsConverter implements DomainConverter<SomeProducts, String> {

	@Override
	public String fromDomainToValue(SomeProducts domain) {
		return domain.getNativeValue();
	}

	@Override
	public SomeProducts fromValueToDomain(String value) {
		return new SOME_PRODUCTS(value);
	}

}
