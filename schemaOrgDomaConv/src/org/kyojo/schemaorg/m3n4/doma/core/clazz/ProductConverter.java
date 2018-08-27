package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PRODUCT;
import org.kyojo.schemaorg.m3n4.core.Clazz.Product;

@ExternalDomain
public class ProductConverter implements DomainConverter<Product, String> {

	@Override
	public String fromDomainToValue(Product domain) {
		return domain.getNativeValue();
	}

	@Override
	public Product fromValueToDomain(String value) {
		return new PRODUCT(value);
	}

}
