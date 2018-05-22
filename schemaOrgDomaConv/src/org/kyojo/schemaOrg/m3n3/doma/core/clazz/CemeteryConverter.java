package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CEMETERY;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Cemetery;

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
