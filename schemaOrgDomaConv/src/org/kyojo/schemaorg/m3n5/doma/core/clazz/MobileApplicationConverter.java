package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MOBILE_APPLICATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.MobileApplication;

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
