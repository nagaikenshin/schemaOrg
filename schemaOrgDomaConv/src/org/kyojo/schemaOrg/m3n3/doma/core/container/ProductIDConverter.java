package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PRODUCT_ID;
import org.kyojo.schemaOrg.m3n3.core.Container.ProductID;

@ExternalDomain
public class ProductIDConverter implements DomainConverter<ProductID, String> {

	@Override
	public String fromDomainToValue(ProductID domain) {
		return domain.getNativeValue();
	}

	@Override
	public ProductID fromValueToDomain(String value) {
		return new PRODUCT_ID(value);
	}

}
