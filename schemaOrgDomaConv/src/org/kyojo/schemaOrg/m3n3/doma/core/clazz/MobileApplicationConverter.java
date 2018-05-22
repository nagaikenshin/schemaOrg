package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MOBILE_APPLICATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MobileApplication;

@ExternalDomain
public class MobileApplicationConverter implements DomainConverter<MobileApplication, String> {

	@Override
	public String fromDomainToValue(MobileApplication domain) {
		return domain.getNativeValue();
	}

	@Override
	public MobileApplication fromValueToDomain(String value) {
		return new MOBILE_APPLICATION(value);
	}

}
