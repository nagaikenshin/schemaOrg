package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SOFTWARE_APPLICATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.SoftwareApplication;

@ExternalDomain
public class SoftwareApplicationConverter implements DomainConverter<SoftwareApplication, String> {

	@Override
	public String fromDomainToValue(SoftwareApplication domain) {
		return domain.getNativeValue();
	}

	@Override
	public SoftwareApplication fromValueToDomain(String value) {
		return new SOFTWARE_APPLICATION(value);
	}

}
