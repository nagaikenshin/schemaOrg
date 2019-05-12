package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PRODUCT_MODEL;
import org.kyojo.schemaorg.m3n5.core.Clazz.ProductModel;

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
