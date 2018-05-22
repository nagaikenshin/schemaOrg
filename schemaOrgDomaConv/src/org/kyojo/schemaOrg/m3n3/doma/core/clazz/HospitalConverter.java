package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HOSPITAL;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Hospital;

@ExternalDomain
public class HospitalConverter implements DomainConverter<Hospital, String> {

	@Override
	public String fromDomainToValue(Hospital domain) {
		return domain.getNativeValue();
	}

	@Override
	public Hospital fromValueToDomain(String value) {
		return new HOSPITAL(value);
	}

}
