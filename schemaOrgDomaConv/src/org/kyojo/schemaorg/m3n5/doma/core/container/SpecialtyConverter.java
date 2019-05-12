package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SPECIALTY;
import org.kyojo.schemaorg.m3n5.core.Container.Specialty;

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
