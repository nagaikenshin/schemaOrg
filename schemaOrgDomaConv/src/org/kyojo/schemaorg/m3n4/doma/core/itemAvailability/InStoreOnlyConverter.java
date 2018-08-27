package org.kyojo.schemaorg.m3n4.doma.core.itemAvailability;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.itemAvailability.IN_STORE_ONLY;
import org.kyojo.schemaorg.m3n4.core.ItemAvailability.InStoreOnly;

@ExternalDomain
public class InStoreOnlyConverter implements DomainConverter<InStoreOnly, String> {

	@Override
	public String fromDomainToValue(InStoreOnly domain) {
		return domain.getNativeValue();
	}

	@Override
	public InStoreOnly fromValueToDomain(String value) {
		return new IN_STORE_ONLY(value);
	}

}
