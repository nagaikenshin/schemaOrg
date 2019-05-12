package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.DENTIST;
import org.kyojo.schemaorg.m3n5.core.Clazz.Dentist;

@ExternalDomain
public class DentistConverter implements DomainConverter<Dentist, String> {

	@Override
	public String fromDomainToValue(Dentist domain) {
		return domain.getNativeValue();
	}

	@Override
	public Dentist fromValueToDomain(String value) {
		return new DENTIST(value);
	}

}
