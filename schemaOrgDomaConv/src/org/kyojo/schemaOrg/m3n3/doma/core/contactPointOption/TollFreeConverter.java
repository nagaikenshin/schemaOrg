package org.kyojo.schemaOrg.m3n3.doma.core.contactPointOption;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.contactPointOption.TOLL_FREE;
import org.kyojo.schemaOrg.m3n3.core.ContactPointOption.TollFree;

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
