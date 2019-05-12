package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.WARRANTY_PROMISE;
import org.kyojo.schemaorg.m3n5.core.Clazz.WarrantyPromise;

@ExternalDomain
public class WarrantyPromiseConverter implements DomainConverter<WarrantyPromise, String> {

	@Override
	public String fromDomainToValue(WarrantyPromise domain) {
		return domain.getNativeValue();
	}

	@Override
	public WarrantyPromise fromValueToDomain(String value) {
		return new WARRANTY_PROMISE(value);
	}

}
