package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ALTERNATE_NAME;
import org.kyojo.schemaorg.m3n4.core.Container.AlternateName;

@ExternalDomain
public class AlternateNameConverter implements DomainConverter<AlternateName, String> {

	@Override
	public String fromDomainToValue(AlternateName domain) {
		return domain.getNativeValue();
	}

	@Override
	public AlternateName fromValueToDomain(String value) {
		return new ALTERNATE_NAME(value);
	}

}
