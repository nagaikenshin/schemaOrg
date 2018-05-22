package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MOSQUE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Mosque;

@ExternalDomain
public class MosqueConverter implements DomainConverter<Mosque, String> {

	@Override
	public String fromDomainToValue(Mosque domain) {
		return domain.getNativeValue();
	}

	@Override
	public Mosque fromValueToDomain(String value) {
		return new MOSQUE(value);
	}

}
