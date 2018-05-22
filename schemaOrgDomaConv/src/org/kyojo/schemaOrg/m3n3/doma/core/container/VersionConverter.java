package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.VERSION;
import org.kyojo.schemaOrg.m3n3.core.Container.Version;

@ExternalDomain
public class VersionConverter implements DomainConverter<Version, String> {

	@Override
	public String fromDomainToValue(Version domain) {
		return domain.getNativeValue();
	}

	@Override
	public Version fromValueToDomain(String value) {
		return new VERSION(value);
	}

}
