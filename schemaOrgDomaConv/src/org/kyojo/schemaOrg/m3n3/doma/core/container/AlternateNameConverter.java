package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ALTERNATE_NAME;
import org.kyojo.schemaOrg.m3n3.core.Container.AlternateName;

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
