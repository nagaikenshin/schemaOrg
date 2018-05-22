package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CREMATORIUM;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Crematorium;

@ExternalDomain
public class CrematoriumConverter implements DomainConverter<Crematorium, String> {

	@Override
	public String fromDomainToValue(Crematorium domain) {
		return domain.getNativeValue();
	}

	@Override
	public Crematorium fromValueToDomain(String value) {
		return new CREMATORIUM(value);
	}

}
