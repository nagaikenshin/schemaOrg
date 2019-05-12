package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.WARRANTY_SCOPE;
import org.kyojo.schemaorg.m3n5.core.Container.WarrantyScope;

@ExternalDomain
public class WarrantyScopeConverter implements DomainConverter<WarrantyScope, String> {

	@Override
	public String fromDomainToValue(WarrantyScope domain) {
		return domain.getNativeValue();
	}

	@Override
	public WarrantyScope fromValueToDomain(String value) {
		return new WARRANTY_SCOPE(value);
	}

}
