package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CEMETERY;
import org.kyojo.schemaorg.m3n4.core.Clazz.Cemetery;

@ExternalDomain
public class CemeteryConverter implements DomainConverter<Cemetery, String> {

	@Override
	public String fromDomainToValue(Cemetery domain) {
		return domain.getNativeValue();
	}

	@Override
	public Cemetery fromValueToDomain(String value) {
		return new CEMETERY(value);
	}

}
