package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SKU;
import org.kyojo.schemaOrg.m3n3.core.Container.Sku;

@ExternalDomain
public class SkuConverter implements DomainConverter<Sku, String> {

	@Override
	public String fromDomainToValue(Sku domain) {
		return domain.getNativeValue();
	}

	@Override
	public Sku fromValueToDomain(String value) {
		return new SKU(value);
	}

}
