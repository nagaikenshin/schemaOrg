package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ALUMNI;
import org.kyojo.schemaorg.m3n4.core.Container.Alumni;

@ExternalDomain
public class AlumniConverter implements DomainConverter<Alumni, String> {

	@Override
	public String fromDomainToValue(Alumni domain) {
		return domain.getNativeValue();
	}

	@Override
	public Alumni fromValueToDomain(String value) {
		return new ALUMNI(value);
	}

}
