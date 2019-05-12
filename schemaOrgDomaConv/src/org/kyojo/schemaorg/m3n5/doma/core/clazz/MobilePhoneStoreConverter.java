package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MOBILE_PHONE_STORE;
import org.kyojo.schemaorg.m3n5.core.Clazz.MobilePhoneStore;

@ExternalDomain
public class MobilePhoneStoreConverter implements DomainConverter<MobilePhoneStore, String> {

	@Override
	public String fromDomainToValue(MobilePhoneStore domain) {
		return domain.getNativeValue();
	}

	@Override
	public MobilePhoneStore fromValueToDomain(String value) {
		return new MOBILE_PHONE_STORE(value);
	}

}
