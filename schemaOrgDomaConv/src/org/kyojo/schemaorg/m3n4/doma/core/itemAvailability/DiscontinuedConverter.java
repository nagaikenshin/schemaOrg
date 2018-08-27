package org.kyojo.schemaorg.m3n4.doma.core.itemAvailability;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.itemAvailability.DISCONTINUED;
import org.kyojo.schemaorg.m3n4.core.ItemAvailability.Discontinued;

@ExternalDomain
public class DiscontinuedConverter implements DomainConverter<Discontinued, String> {

	@Override
	public String fromDomainToValue(Discontinued domain) {
		return domain.getNativeValue();
	}

	@Override
	public Discontinued fromValueToDomain(String value) {
		return new DISCONTINUED(value);
	}

}
