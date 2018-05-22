package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.WARRANTY_SCOPE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.WarrantyScope;

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
