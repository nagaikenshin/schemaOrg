package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HOSTEL;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Hostel;

@ExternalDomain
public class HostelConverter implements DomainConverter<Hostel, String> {

	@Override
	public String fromDomainToValue(Hostel domain) {
		return domain.getNativeValue();
	}

	@Override
	public Hostel fromValueToDomain(String value) {
		return new HOSTEL(value);
	}

}
