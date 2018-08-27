package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.QUALIFICATIONS;
import org.kyojo.schemaorg.m3n4.pending.Container.Qualifications;

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
