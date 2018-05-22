package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.COPYRIGHT_HOLDER;
import org.kyojo.schemaOrg.m3n3.core.Container.CopyrightHolder;

@ExternalDomain
public class CopyrightHolderConverter implements DomainConverter<CopyrightHolder, String> {

	@Override
	public String fromDomainToValue(CopyrightHolder domain) {
		return domain.getNativeValue();
	}

	@Override
	public CopyrightHolder fromValueToDomain(String value) {
		return new COPYRIGHT_HOLDER(value);
	}

}
