package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PRODUCT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Product;

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
