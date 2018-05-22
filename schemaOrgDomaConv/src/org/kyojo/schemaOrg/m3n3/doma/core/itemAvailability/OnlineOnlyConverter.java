package org.kyojo.schemaOrg.m3n3.doma.core.itemAvailability;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.itemAvailability.ONLINE_ONLY;
import org.kyojo.schemaOrg.m3n3.core.ItemAvailability.OnlineOnly;

@ExternalDomain
public class OnlineOnlyConverter implements DomainConverter<OnlineOnly, String> {

	@Override
	public String fromDomainToValue(OnlineOnly domain) {
		return domain.getNativeValue();
	}

	@Override
	public OnlineOnly fromValueToDomain(String value) {
		return new ONLINE_ONLY(value);
	}

}
