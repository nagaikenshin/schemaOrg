package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.QUALIFICATIONS;
import org.kyojo.schemaOrg.m3n3.core.Container.Qualifications;

@ExternalDomain
public class QualificationsConverter implements DomainConverter<Qualifications, String> {

	@Override
	public String fromDomainToValue(Qualifications domain) {
		return domain.getNativeValue();
	}

	@Override
	public Qualifications fromValueToDomain(String value) {
		return new QUALIFICATIONS(value);
	}

}
