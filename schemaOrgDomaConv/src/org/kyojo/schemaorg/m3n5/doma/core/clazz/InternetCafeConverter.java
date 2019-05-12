package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.INTERNET_CAFE;
import org.kyojo.schemaorg.m3n5.core.Clazz.InternetCafe;

@ExternalDomain
public class InternetCafeConverter implements DomainConverter<InternetCafe, String> {

	@Override
	public String fromDomainToValue(InternetCafe domain) {
		return domain.getNativeValue();
	}

	@Override
	public InternetCafe fromValueToDomain(String value) {
		return new INTERNET_CAFE(value);
	}

}
