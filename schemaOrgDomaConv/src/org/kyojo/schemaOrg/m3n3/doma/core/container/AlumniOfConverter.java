package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ALUMNI_OF;
import org.kyojo.schemaOrg.m3n3.core.Container.AlumniOf;

@ExternalDomain
public class AlumniOfConverter implements DomainConverter<AlumniOf, String> {

	@Override
	public String fromDomainToValue(AlumniOf domain) {
		return domain.getNativeValue();
	}

	@Override
	public AlumniOf fromValueToDomain(String value) {
		return new ALUMNI_OF(value);
	}

}
