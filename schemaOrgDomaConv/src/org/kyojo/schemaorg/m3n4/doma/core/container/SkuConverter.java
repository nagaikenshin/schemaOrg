package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SKU;
import org.kyojo.schemaorg.m3n4.core.Container.Sku;

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
