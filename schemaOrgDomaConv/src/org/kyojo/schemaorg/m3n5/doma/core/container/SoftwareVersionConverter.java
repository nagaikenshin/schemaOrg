package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SOFTWARE_VERSION;
import org.kyojo.schemaorg.m3n5.core.Container.SoftwareVersion;

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
