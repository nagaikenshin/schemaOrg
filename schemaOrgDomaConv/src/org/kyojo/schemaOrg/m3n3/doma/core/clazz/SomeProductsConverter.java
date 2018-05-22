package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SOME_PRODUCTS;
import org.kyojo.schemaOrg.m3n3.core.Clazz.SomeProducts;

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
