package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.REFERENCE_QUANTITY;
import org.kyojo.schemaOrg.m3n3.core.Container.ReferenceQuantity;

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
