package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.VERSION;
import org.kyojo.schemaorg.m3n4.core.Container.Version;

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