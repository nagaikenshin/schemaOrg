package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.REFERENCE_QUANTITY;
import org.kyojo.schemaorg.m3n4.core.Container.ReferenceQuantity;

@ExternalDomain
public class ReferenceQuantityConverter implements DomainConverter<ReferenceQuantity, String> {

	@Override
	public String fromDomainToValue(ReferenceQuantity domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReferenceQuantity fromValueToDomain(String value) {
		return new REFERENCE_QUANTITY(value);
	}

}