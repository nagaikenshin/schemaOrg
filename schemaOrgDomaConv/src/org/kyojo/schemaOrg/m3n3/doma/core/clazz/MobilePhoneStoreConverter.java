package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MOBILE_PHONE_STORE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MobilePhoneStore;

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
