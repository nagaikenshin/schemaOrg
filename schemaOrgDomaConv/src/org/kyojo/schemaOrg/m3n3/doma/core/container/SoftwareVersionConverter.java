package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SOFTWARE_VERSION;
import org.kyojo.schemaOrg.m3n3.core.Container.SoftwareVersion;

@ExternalDomain
public class SoftwareVersionConverter implements DomainConverter<SoftwareVersion, String> {

	@Override
	public String fromDomainToValue(SoftwareVersion domain) {
		return domain.getNativeValue();
	}

	@Override
	public SoftwareVersion fromValueToDomain(String value) {
		return new SOFTWARE_VERSION(value);
	}

}
