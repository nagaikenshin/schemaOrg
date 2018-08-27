package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SPECIALTY;
import org.kyojo.schemaorg.m3n4.core.Clazz.Specialty;

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
