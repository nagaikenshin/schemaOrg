package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SPECIALTY;
import org.kyojo.schemaOrg.m3n3.core.Container.Specialty;

@ExternalDomain
public class SpecialtyConverter implements DomainConverter<Specialty, String> {

	@Override
	public String fromDomainToValue(Specialty domain) {
		return domain.getNativeValue();
	}

	@Override
	public Specialty fromValueToDomain(String value) {
		return new SPECIALTY(value);
	}

}
