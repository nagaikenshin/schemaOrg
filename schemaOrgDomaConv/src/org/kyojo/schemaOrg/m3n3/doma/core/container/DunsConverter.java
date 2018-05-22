package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DUNS;
import org.kyojo.schemaOrg.m3n3.core.Container.Duns;

@ExternalDomain
public class DunsConverter implements DomainConverter<Duns, String> {

	@Override
	public String fromDomainToValue(Duns domain) {
		return domain.getNativeValue();
	}

	@Override
	public Duns fromValueToDomain(String value) {
		return new DUNS(value);
	}

}
