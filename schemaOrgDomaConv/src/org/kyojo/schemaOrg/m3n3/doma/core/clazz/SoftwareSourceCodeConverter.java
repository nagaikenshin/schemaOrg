package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SOFTWARE_SOURCE_CODE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.SoftwareSourceCode;

@ExternalDomain
public class SoftwareSourceCodeConverter implements DomainConverter<SoftwareSourceCode, String> {

	@Override
	public String fromDomainToValue(SoftwareSourceCode domain) {
		return domain.getNativeValue();
	}

	@Override
	public SoftwareSourceCode fromValueToDomain(String value) {
		return new SOFTWARE_SOURCE_CODE(value);
	}

}
