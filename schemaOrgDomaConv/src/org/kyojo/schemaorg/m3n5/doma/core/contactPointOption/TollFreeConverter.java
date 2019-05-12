package org.kyojo.schemaorg.m3n5.doma.core.contactPointOption;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.contactPointOption.TOLL_FREE;
import org.kyojo.schemaorg.m3n5.core.ContactPointOption.TollFree;

@ExternalDomain
public class TollFreeConverter implements DomainConverter<TollFree, String> {

	@Override
	public String fromDomainToValue(TollFree domain) {
		return domain.getNativeValue();
	}

	@Override
	public TollFree fromValueToDomain(String value) {
		return new TOLL_FREE(value);
	}

}
