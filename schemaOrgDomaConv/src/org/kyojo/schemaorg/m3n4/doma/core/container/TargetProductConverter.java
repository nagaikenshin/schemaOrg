package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.TARGET_PRODUCT;
import org.kyojo.schemaorg.m3n4.core.Container.TargetProduct;

@ExternalDomain
public class TargetProductConverter implements DomainConverter<TargetProduct, String> {

	@Override
	public String fromDomainToValue(TargetProduct domain) {
		return domain.getNativeValue();
	}

	@Override
	public TargetProduct fromValueToDomain(String value) {
		return new TARGET_PRODUCT(value);
	}

}
