package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PRODUCT_SUPPORTED;
import org.kyojo.schemaOrg.m3n3.core.Container.ProductSupported;

@ExternalDomain
public class ProductSupportedConverter implements DomainConverter<ProductSupported, String> {

	@Override
	public String fromDomainToValue(ProductSupported domain) {
		return domain.getNativeValue();
	}

	@Override
	public ProductSupported fromValueToDomain(String value) {
		return new PRODUCT_SUPPORTED(value);
	}

}
