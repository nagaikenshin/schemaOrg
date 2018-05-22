package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PRODUCT_MODEL;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ProductModel;

@ExternalDomain
public class ProductModelConverter implements DomainConverter<ProductModel, String> {

	@Override
	public String fromDomainToValue(ProductModel domain) {
		return domain.getNativeValue();
	}

	@Override
	public ProductModel fromValueToDomain(String value) {
		return new PRODUCT_MODEL(value);
	}

}
