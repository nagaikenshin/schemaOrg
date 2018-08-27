package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DUNS;
import org.kyojo.schemaorg.m3n4.core.Container.Duns;

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
